package assessment;

import java.util.List;

public abstract class DataReader {
	String searchCriteria;
	SearchType SearchType;
	List<Person> persons;

	public List<Person> getPersons(String criteria, SearchType searchtype) {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		SearchType = searchType;
	}

}
