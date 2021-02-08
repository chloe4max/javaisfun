package epita.java.lethao.datamodel.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import epita.java.lethao.datamodel.Person;
import epita.java.lethao.datamodel.dao.PersonCSVDAO;
import epita.java.lethao.datamodel.service.PersonDataService;

public class TestBLI1 {
	public static void test() {
		File file = new File("C:\\Users\\letha\\Downloads\\data.csv");
		PersonCSVDAO personCSV = new PersonCSVDAO();
		List<Person> personList = personCSV.readAll(file);
		PersonDataService personService = new PersonDataService();
		System.out.println("Average age of Person List: ");
		System.out.println(personService.averageAge(personList));
		System.out.println("List of people who are above 32 years old");
		List<Person> filterList = new ArrayList<Person>();
		filterList = personService.filter(personList, 32);
		for(Person person: filterList) {
			System.out.println(person);
		}
		System.out.println("Distribution of age");
		System.out.println(personService.ageGroup(personList));
	}

}
