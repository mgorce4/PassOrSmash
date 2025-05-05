package passorsmash.model.player;

import java.util.Collection;

import passorsmash.model.people.Person;


public class SmashBag {
	
	private Collection<Person> smashedPersons;
	
	public SmashBag(Collection<Person> persons) {
		this.smashedPersons = persons;
	}

	public Collection<Person> getPersons() {
		return smashedPersons;
	}
	
	public void setPersons(Collection<Person> persons) {
		this.smashedPersons = persons;
	}

	public void addPerson(Person person) {
		this.smashedPersons.add(person);
	}

}
