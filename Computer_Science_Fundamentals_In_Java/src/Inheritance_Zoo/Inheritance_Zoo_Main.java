package Inheritance_Zoo;


public class Inheritance_Zoo_Main {
	public static void main(String[] args){
		Mammal m1=new Mammal(20, true);
		Bird b1=new Bird(100, false, "black", "Bill", 40);
		b1.isEating();
		b1.nameColor();
		b1.healthyWeight();
		b1.isMammal();
		m1.isMammal();
		m1.isEating();
		
	}
}
