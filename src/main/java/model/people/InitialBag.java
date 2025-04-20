package model.people;

import java.util.Collection;

public abstract class InitialBag {
	
	protected Collection<Person> people;
	
	public InitialBag(Collection<Person> people) {
		this.people = people;
	}
	
	public Collection<Person> getPeople() {
		return people;
	}

}
