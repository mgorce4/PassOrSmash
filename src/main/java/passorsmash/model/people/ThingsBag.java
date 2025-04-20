package passorsmash.model.people;

import java.util.ArrayList;

public class ThingsBag extends InitialBag {
	
	public ThingsBag() {
		super(new ArrayList<Person>());
		initializeThingsBag();
	}
	
	public void initializeThingsBag() {
		people.add(new Person("Un banc public mouillé", "src/main/resources/people/things/wetBench.jpg"));
		people.add(new Person("Le coin de la table basse","src/main/resources/people/things/tableBasse.jpg"));
		people.add(new Person("Un escalier en colimaçon mal éclairé",""));

	}
	
	public void describe() {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
	
}
