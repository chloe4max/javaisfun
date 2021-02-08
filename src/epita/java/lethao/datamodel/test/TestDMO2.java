package epita.java.lethao.datamodel.test;

import epita.java.lethao.datamodel.Person;

public class TestDMO2 {
	public static void test() {
		Person person = new Person("Thao","F",28,160,42);
		System.out.println(person.toString());
	}
}
