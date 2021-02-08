package epita.java.lethao.datamodel.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TreeMap;

import epita.java.lethao.datamodel.Person;

public class PersonDataService {
	public int averageAge(List<Person> persons) {
		int sum = 0;
		int count = 0;
		for(Person person: persons) {
			sum += person.getAge();
			count += 1;			
		}
		int averageAge = sum/count;
		return averageAge;
	}
	
	public List<Person> filter(List<Person> persons, int thresholdAge){
		List<Person> filterPerson = new ArrayList<Person>();
		for(Person person: persons) {
			if (person.getAge() > thresholdAge) {
				filterPerson.add(person);
			}
		}
		return filterPerson;
	}
	
	public int calculateYOB(Person person) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int YOB = currentYear - person.getAge();
		return YOB;
	}
	
	public TreeMap<Integer,Integer> ageGroup(List<Person> persons){
		TreeMap<Integer, Integer> ageMap = new TreeMap<Integer,Integer>();
		for(Person person: persons) {
			if(ageMap.containsKey(person.getAge())) {
				int count = ageMap.get(person.getAge()) +1;
				ageMap.put(person.getAge(), count);
			}else {
				ageMap.put(person.getAge(), 1);
			}
		}
		return ageMap;
	}

}
