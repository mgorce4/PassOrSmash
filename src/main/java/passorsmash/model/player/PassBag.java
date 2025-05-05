package passorsmash.model.player;

import java.util.Collection;

import passorsmash.model.people.Person;

public class PassBag {
	
	private Collection<Person> passedPersons;
	
	public PassBag(Collection<Person> persons) {
		this.passedPersons = persons;
	}
	
	public Collection<Person> getSmashedPersons() {
		return passedPersons;
	}

	public void setSmashedPersons(Collection<Person> smashedPersons) {
		this.passedPersons = smashedPersons;
	}

	public void addSmashedPerson(Person person) {
		this.passedPersons.add(person);
	}
	

}
