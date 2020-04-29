package Inheritance_Zoo;


public class Mammal {
	public int bodyTemp;
	public boolean eating;
	String animal;
	public Mammal(int bodyTemp, boolean eating){
		this.bodyTemp=bodyTemp;
		this.eating=eating;
	}
	public void isMammal(){
 	if (bodyTemp <= 40){
		System.out.println("It's body temp is " + bodyTemp + " and it is a mammal.");
	}
	else if(bodyTemp >= 0){
		System.out.println("It's body temp is " + bodyTemp + " and it is mammal.");
	}
	}
	public void isEating(){
		if (eating){
			System.out.println("The animal is eating!");
		}
	}
}
