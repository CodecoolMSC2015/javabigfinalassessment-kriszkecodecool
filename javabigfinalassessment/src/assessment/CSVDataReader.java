package assessment;

import java.util.List;

public class CSVDataReader extends DataReader {
	String csvFilePath;
	List<Person> persons;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public CSVDataReader(String csvFilePath) {
	}

}
