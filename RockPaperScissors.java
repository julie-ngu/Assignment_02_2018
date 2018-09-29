/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * Rock, paper, scissors game
 * 
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Random randGen = new Random();
		
		int comChoice = randGen.nextInt(3) + 1;
		
		int rock = 1, paper = 2, scissors = 3;
		
		System.out.print("Rock, paper, scissors, shoot! Choose your fighter and see who wins: \n\n  1 (rock)\n  2 (paper)\n  3 (scissors)\n\n");
		
		int userChoice = userInput.nextInt();
		
		if(userChoice == 1 && comChoice == 2) {
			System.out.println("\nYou chose rock. The computer chose paper. You lose!");
		}
		else if(userChoice == 1 && comChoice == 3) {
			System.out.println("\nYou chose rock. The computer chose scissors. You win!");
		}
		
		else if(userChoice == 2 && comChoice == 3) {
			System.out.println("\nYou chose paper. The computer chose scissors. You lose!");
		}
		else if(userChoice == 2 && comChoice == 1) {
			System.out.println("\nYou chose paper. The computer chose rock. You win!");
		}

		else if(userChoice == 3 && comChoice == 1) {
			System.out.println("\nYou chose scissors. The computer chose rock. You lose!");
		}
		else if(userChoice == 3 && comChoice == 2) {
			System.out.println("\nYou chose scissors. The computer chose paper. You win!");			
		}
		
		else if(userChoice == comChoice) {
			System.out.println("\nYou both chose the same move. It's a draw!");
		}
		else {
			System.out.println("\n-1 (error)");
		}
	}
}
