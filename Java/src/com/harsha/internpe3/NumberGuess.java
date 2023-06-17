package com.harsha.internpe3;

import java.util.*;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String play="yes";
		
		while(play.equals("yes")){
			Random rand = new Random();
			int randNum = rand.nextInt(100);
			int guess = -1;
			int tries = 0;
			while(guess != randNum){
				System.out.println("Guess the number between 1 and 100 " );
				guess = sc.nextInt();
				tries++;
				if(guess==randNum){
					System.out.println("You guessed the right number");
					System.out.println("guessed in "+tries+"tries");
					System.out.println("play again :yes or no");
					play = sc.next().toLowerCase();
				}
				else if(guess > randNum){
					System.out.println("too high");
				}
				else{
					System.out.println("too low");
				}
			}
		}
		sc.close();

	}

}
