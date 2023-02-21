package com.credersi.animals;

public class Cat {
	public boolean alive;
	public int hunger;
	
//Constructor, hunger is in percentage
	public Cat() {
		this.alive = true;
		this.hunger = 50;
	}
	
//Method, owned by object
	public boolean feeds() {
		if (this.hunger > 20) {
			this.hunger -= 20;
		} else {
			this.hunger = 0;
		}
			
		return this.isAlive();
	}
	
	public boolean runs() {
		this.hunger += 30;
		if (this.hunger >= 100) {
			this.alive = false;
		}
		
		return this.isAlive();
	}
	
	public int howHungry() {
		return this.hunger;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
}