package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons = new ArrayList<Person>();

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public CSVDataReader(String csvFilePath) {
		BufferedReader br = null;
		String line = "";
		try {
			br = new BufferedReader(new FileReader(csvFilePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String name = data[0];
				String email = data[1];
				String salary = data[5];
				Skill skill = new Skill(data[2], data[3]);
				if (salary == "") {
					Person person = new Person();
					person.setName(name);
					person.setEmail(email);
					person.addSkill(skill);
					persons.add(person);
				} else {
					Person employee = new Employee();
					employee.setName(name);
					employee.setEmail(email);
					employee.addSkill(skill);
					((Employee) employee).setSalary(Integer.parseInt(salary));
				}
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
	}

}
