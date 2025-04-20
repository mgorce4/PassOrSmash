package model.people;

import java.util.ArrayList;
import java.util.Collection;

public class PeopleBag extends InitialBag {

	public PeopleBag() {
		super(new ArrayList<Person>());
		initializePeopleBag();
		
	}
	
	public void initializePeopleBag() {
		this.people.add(new Person("Markiplier", "/images/markiplier.png"));
	}

}
