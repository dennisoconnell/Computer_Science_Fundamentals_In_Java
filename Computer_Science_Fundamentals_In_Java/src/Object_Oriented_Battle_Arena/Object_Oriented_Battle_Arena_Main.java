package Object_Oriented_Battle_Arena;


import java.util.Random;

import Object_Oriented_Battle_Arena.Characters.*;
import Object_Oriented_Battle_Arena.Characters.Character;

public class Object_Oriented_Battle_Arena_Main {
	
	public static Random generator = new Random();
	
	public static void main(String[] args){
		Character player1 = new Rogue();
		Character player2 = new Character(10,2,100);
		player2.name = "Steve";
		System.out.println(player1.name + " vs. " + player2.name);
		System.out.println(player1.health + " HP vs. " + player2.health + "HP");
		
		int turns = 0;
        while(player1.isAlive() && player2.isAlive()){
            turns++;
             
            System.out.println("Turn " + turns + "\n" + player1.name + ": " + player1.health + " Health | " + player2.name + ": " + player2.health + " Health\n");
            int damage;
            // player 1 attack
            damage = player1.attack(player2);
            System.out.println(player1.name + " hits " + player2.name + " for " + damage + " damage.");
             
            // player 2 attack
            damage = player2.attack(player1);
            System.out.println(player2.name + " hits " + player1.name + " for " + damage + " damage.\n");
        }
         
        // Check to see who won
        if( player1.isAlive()){
            System.out.println(player1.name + " wins!");
        }
        else if (player2.isAlive()){
            System.out.println(player2.name + " wins!");
        }
        else{
            System.out.println("It's a draw!");
        }
	}
}
