package com.accenture.lecture16;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS;

public class Warrior {

	private String name;
	private int health;
	private static final int MAX_HEALTH = 100;
	private static final int MIN_HEALTH = 0;
	private int damagePower;

	public int getDamagePower() {
		return damagePower;
	}

	public Warrior(String name, int damagePower, int initialHealth) {
		this.name = name;
		this.health = initialHealth;
		this.damagePower = damagePower;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		boolean life;
		if (health > 0) {
			life = true;
		} else {
			life = false;

		}
		return life;
	}

	public void receivedDamage(int damage) {
		if (damage > 0) {
			if (!isAlive() || damage > 0) {
				health = health - damage;
				if (health > MIN_HEALTH) {
					System.out.println(name + " received damage = " + damage
							+ ", total health = " + health);
				} else {
					System.out.println(name + " is dead");
					isAlive();
				}
			}
		} else {
			System.out.println("Invalid damage points");
		}
	}

	public void restoreHealth(int amount) {
		if (amount > 0) {
			if (isAlive()) {
				health = health + amount;
				if (health <= MAX_HEALTH) {
					System.out.println("Health restored by " + amount
							+ " points, total health: " + health);
				} else {
					health = MAX_HEALTH;
					System.out
							.println("Health fully restored to " + MAX_HEALTH);
				}
			} else {
				isAlive();
				System.out.println(name + " is dead");

			}
		} else {
			System.out.println("Invalid health points");
		}
	}

	public void fight(Warrior anotherWarrior) {
		
			if (this.isAlive() && anotherWarrior.isAlive()) {
				this.receivedDamage( anotherWarrior.damagePower);
				anotherWarrior.receivedDamage(this.damagePower);
			}else{
				System.out.println("Fight is over!");
				
			}
		
	}
	
	@Override
	public String toString() {
		return "Warrior [name = " + name + ", health =" + health + "]";
	}

	public static void main(String[] args) {

	}

}
