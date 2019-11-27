package com.accenture.lecture16;

public class WarriorApp {

	public static void main(String[] args) {

		Warrior batman = new Warrior("Batman",30, 50);
		Warrior joker = new Warrior ("Joker", 10, 50);
//		batman.receivedDamage(3);
//		
//		batman.restoreHealth(17);
//		batman.restoreHealth(-40);
//		batman.restoreHealth(350);
//		
//		batman.receivedDamage(-12);
//		batman.receivedDamage(300);
//		
//		batman.restoreHealth(350);
//		batman.receivedDamage(90);
		
		batman.fight(joker);
		batman.fight(joker);
		batman.fight(joker);
		batman.fight(joker);
		batman.fight(joker);
		batman.fight(joker);
		joker.fight(batman);
		
		System.out.println(joker);
		System.out.println(batman);
		
	//	printStatus();
		
	}

}
