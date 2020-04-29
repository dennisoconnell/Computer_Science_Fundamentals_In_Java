package While_Loop_Battle;
import java.util.Random;
 
public class main {
 
    public static void main(String[] args) {
 
        Random numberGenerator = new Random();
 
        System.out.println("Welcome to the endless tower!");
 
        int playerHealth = 100;
        int enemyHealth = 10;
         
        int playerAttack = 1;
        int enemyAttack = 1;
 
        int damage;
        int enemiesDefeated = 0;
         
        while(playerHealth > 0){
        	if(enemyHealth > 0){
        		 
                System.out.println("Your HP: "+ playerHealth + " Enemy HP: " + enemyHealth);
                 
                damage = playerAttack + numberGenerator.nextInt(3);
                System.out.println("You attack the enemy for " + damage + " damage.");
                enemyHealth -= damage;
              
                damage = enemyAttack + numberGenerator.nextInt(3);
                System.out.println("The enemy attacks you for " + damage + " damage.");
                playerHealth -= damage;
                 
            }
            else { 
            	enemiesDefeated++;
            	 playerAttack++;
                 System.out.println("You Leveled up. Your attack is now " + playerAttack
                         + "\n\nA new challenger approaches!");
                 enemyHealth = 10 + numberGenerator.nextInt(5);
                 enemyAttack += numberGenerator.nextInt(2);
                 System.out.println("The enemy has " + enemyHealth + " health and " + enemyAttack + " attack.");
                
            }
 
        }
        System.out.println("You defeated " + enemiesDefeated + " enemies.");
 
    }
 
}