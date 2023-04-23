/*Practice program by Khristian Dixon
 * Last edit 4/22/23
 * Random number guessing game
 * Back end only
 */

import java.io.IOException;
import java.util.Random;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Initialize variables
		int hidden;
		int guess = 0;
		Scanner myObj = new Scanner(System.in);
		Random rand = new Random();
		
		//assign random value from 1 to 100
		hidden = rand.nextInt(1, 101);
		System.out.println("Please guess a number from 1 to 100: ");
		
		//loop to check if current guess matches hidden number
		while (guess != hidden) {
			
			//input
			guess = myObj.nextInt();
			
			//checks to make sure input is within range
			while (guess > 100 || guess < 1) {
				System.out.println("Please enter a number that is greater than 1 or less than 100");
				guess = myObj.nextInt();
			}
			
			//checks if hidden number is higher, lower, or matches
			if (guess < hidden) {
				System.out.println("Try guessing a little higher");
			}else if (guess > hidden){
				System.out.println("Try guessing a little lower");
			}else if (guess == hidden){
				System.out.println("Congradulations you guessed the number");
			}
		}
	}
}
