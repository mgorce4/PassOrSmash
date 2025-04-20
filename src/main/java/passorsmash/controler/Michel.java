package passorsmash.controler;

import java.util.Scanner;

import passorsmash.model.people.PeopleBag;
import passorsmash.model.people.ThingsBag;

public class Michel implements Michelable {
	
	private final String name = "Michel";

	@Override
	public void initPOS() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenue dans Pass or Smash !\nChoisissez un mode !\n1 - Choses\n2 - Personnalités\n");
		int choixUsr = scanner.nextInt();
		
		switch(choixUsr) {
		case 1 : 
			ThingsBag thingsbag = new ThingsBag();
			System.out.println("Vous avez choisi le mode Choses !\nVoici ce que vous allez devoir passer en revue : \n");
			thingsbag.describe();
			break;
		case 2 : 
			PeopleBag peoplebag = new PeopleBag();
			System.out.println("Vous avez choisi le mode Personnalités !\nVoici ce que vous allez devoir passer en revue : \n");
			peoplebag.describe();
			break;
		default:
			System.out.println("Nombre inconnu.");
		}
		
	}
	
	
}
