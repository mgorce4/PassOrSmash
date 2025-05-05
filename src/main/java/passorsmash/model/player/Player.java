package passorsmash.model.player;

import java.util.Collection;

import passorsmash.model.people.Person;

public class Player {
	
	private Integer id;
	private String pseudo;
	private String password;

	
	public Player(Integer id, String pseudo, String password ) {
		this.id = id;
		this.pseudo = pseudo;
		this.password = password;
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

	public void describeBag(Collection<Person> persons) {
		for (Person person : persons) {
			System.out.println(person.describe());
		}
	}

}
