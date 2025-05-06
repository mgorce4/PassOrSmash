package passorsmash.model.player;

import passorsmash.model.people.Person;

public class Player {
	
	private Integer id;
	private String pseudo;
	private String password;
	private PassBag passBag;
	private SmashBag smashBag;

	
	public Player(Integer id, String pseudo, String password , PassBag passBag, SmashBag smashBag ) {
		this.id = id;
		this.pseudo = pseudo;
		this.password = password;
		this.passBag = passBag;
		this.smashBag = smashBag;
	}

	public Player(String pseudo, String password) {
		this.pseudo = pseudo;
		this.password = password;
	}
	
	public Player() {
		this.pseudo = "Michel";
		this.password = "Michel";
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void describePassBag() {
		for (Person person : passBag.getPassedPersons()) {
			System.out.println(person.describe());
		}
	}
	
	
	public void describeSmashBag() {
		for (Person person : smashBag.getSmashedPersons()) {
			System.out.println(person.describe());
		}
	}
}
