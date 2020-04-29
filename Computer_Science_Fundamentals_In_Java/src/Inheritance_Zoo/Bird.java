package Inheritance_Zoo;


public class Bird extends Mammal {
	public String color = "Rainbow";
	public String name = "Rick";
	public int weight = 60;
	
	public Bird(int bodyTemp, boolean eating, String color, String name, int weight){
		super(bodyTemp,eating);
		this.color=color;
		this.name=name;
		this.weight=weight;
	}
	public void healthyWeight(){
		if(weight<=100){
			System.out.println("Your bird is a healthy " +weight);
		}
		else if(weight>=20){
			System.out.println("Your bird is a healthy " +weight);
		}
		else{
			System.out.println("Your bird is not healthy");
		}
	
	}
	public void nameColor(){
		System.out.println(name + " is " + color + ".");
	}
	public void isEating(){
		if(eating)
		System.out.println(name + " is eating.");
	}
}