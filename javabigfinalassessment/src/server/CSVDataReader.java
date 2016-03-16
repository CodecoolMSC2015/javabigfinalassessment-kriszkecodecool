package server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	Set<Person> people = new HashSet<Person>();

	public Set<Person> getPersons() {
		return people;
	}

	public CSVDataReader(String csvFilePath, String skillName) {
		BufferedReader br = null;
		String line = "";
		Person person = new Person();
		Set<Person> people = new HashSet<Person>();
		try {
			br = new BufferedReader(new FileReader(csvFilePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				Skill skill = new Skill(data[2], data[3]);
				if (data[2].equals(skillName)) {
					person = new Person();
					person.setName(data[0]);
					person.setEmail(data[1]);
					person.addSkill(skill);
				}
				people.add(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		for (Person person2 : people) {
			System.out.println(person2.getName());
		}
	}

	public static void main(String[] args) {
		CSVDataReader asd = new CSVDataReader("C:/persons.csv", "Java");
	}

}
