
package Object_Oriented_Battle_Arena.Characters;
 
import Object_Oriented_Battle_Arena.Object_Oriented_Battle_Arena_Main;
public class Character {
		public static String[] nameList = {"Geoff" , "Steve" ,"Krogar"};
		public String name = "Geoff";
	    public int strength = 10;
	    public int health = 20;
	    public int defense = 5;

	    
	     public Character(){
	        this.name = nameList[Object_Oriented_Battle_Arena_Main.generator.nextInt(nameList.length)];
	    }
	     
	    public Character(int strength, int defense, int health){
        this();
        this.strength = strength;
        this.defense = defense;
        this.health = health;
        }
	    
	    public int takeDamage(int damage){
	    	int damageTaken = damage - this.defense;
	    	this.health -= damageTaken;
	    	return damageTaken;
	    }
	    public int attack(Character target){
	    	
	    	boolean criticalHit = Object_Oriented_Battle_Arena_Main.generator.nextInt(100) < Rogue.dexterity;
	    	
	    	int damageDealt = this.strength + Object_Oriented_Battle_Arena_Main.generator.nextInt(5);
	    	if(criticalHit){
	            damageDealt *= 2;
	            System.out.println("*** Critical Hit ***");
	        }
	    	return target.takeDamage(damageDealt);
	    }
	    
	    public boolean isAlive(){
	    	return this.health > 0;
	    }
	   
}

