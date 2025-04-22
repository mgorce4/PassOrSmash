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
		people.add(new Person("Un escalier en colimaçon mal éclairé","src/main/resources/people/things/escaliers.png"));
		people.add(new Person("Une flaque d'eau tiède inconnue","src/main/resources/people/things/flaque.jpg"));
		people.add(new Person("Un radiateur poussiéreux dans une salle de classe abandonnée","src/main/resources/people/things/radiateur.jpg"));
		people.add(new Person("Une poubelle qui déborde un lundi matin","src/main/resources/people/things/poubelle.jpg"));
		people.add(new Person("Un vieux torchon mouillé oublié dans l'évier","src/main/resources/people/things/torchon.jpg"));
		people.add(new Person("un tabouret bancal","src/main/resources/people/things/tabouret.jpg"));
		people.add(new Person("Un evier douteux","src/main/resources/people/things/evier.jpg"));
		people.add(new Person("😉","src/main/resources/people/things/emoji.png"));
		people.add(new Person("Le moine décomposé, enfermé vivant dans un mur depuis 1348","src/main/resources/people/things/moine.jpg"));

	}
	
	public void describe() {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
	
	
	
}
