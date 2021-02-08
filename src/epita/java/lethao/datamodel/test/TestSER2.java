package epita.java.lethao.datamodel.test;

import java.io.File;
import java.util.List;

import epita.java.lethao.datamodel.Person;
import epita.java.lethao.datamodel.dao.PersonCSVDAO;

public class TestSER2 {
	public static void test() {
		File file = new File("C:\\Users\\letha\\Downloads\\data.csv");
		PersonCSVDAO personCSV = new PersonCSVDAO();
		List<Person> personList = personCSV.readAll(file);
		System.out.println("List of Person sorted by Height");
		for (Person person: personList) {
			System.out.println(person.toString());
		}
	}

}
