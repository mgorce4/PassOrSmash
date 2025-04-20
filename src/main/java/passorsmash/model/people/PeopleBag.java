package passorsmash.model.people;

import java.util.ArrayList;
import java.util.Collection;

public class PeopleBag extends InitialBag {

	public PeopleBag() {
		super(new ArrayList<Person>());
		initializePeopleBag();
		
	}
	
	public void initializePeopleBag() {
		this.people.add(new Person("Markiplier", "/people/personalities/markiplier.png"));
		this.people.add(new Person("Jean-Philippe Bourdin", "/people/personalities/jeanphi.png"));
		this.people.add(new Person("Rachmaninov recouvert de miel", "/people/personalities/rach.png"));
	}

}
