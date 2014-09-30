package com.number;

import java.util.Random;
import java.util.Scanner;
/**
 * RightGuess program is for identifying the chosen number is high, low or equal.
 * @author shafik
 *
 */
public class RightGuess {

	public static void main(String[] args) {
		RightGuess rg = new RightGuess();
		Random rand = new Random();
		// Guessing Number
		int choseNumber = rand.nextInt(100);		
		rg.decisionOnGuessedNumber(choseNumber);
	}
	
	void decisionOnGuessedNumber(int choseNumber){
		System.out.println("Number that you have chosen from 0 to 100 is :"+choseNumber);
		Scanner input =  new Scanner(System.in);
		int guess;
		//System.out.print("Enter the number to find the guessed number:");

		for (int i=0; i<=100; i++){
			System.out.print("Enter the number to find the guessed number:");
			guess = input.nextInt();
			
			System.out.println("Computer: Is the number "+guess+"?");
		
			if (guess == choseNumber){
				System.out.println("User: Yes\n----------------------------------------");
				break;
			}else if (guess < choseNumber){
				System.out.println("User: Low\n-----------------------------------------");
			}else if (guess > choseNumber){
				System.out.println("User: High\n----------------------------------------");
			}
		}
		
	}

}
