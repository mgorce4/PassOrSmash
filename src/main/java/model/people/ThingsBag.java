package model.people;

import java.util.ArrayList;

public class ThingsBag extends InitialBag {
	
	public ThingsBag() {
		super(new ArrayList<Person>());
		initializeThingsBag();
	}
	
	public void initializeThingsBag() {
		people.add(new Person("Un banc public mouillé", "src/main/resources/people/things/wetBench.jpg"));
	}
	
	
}
