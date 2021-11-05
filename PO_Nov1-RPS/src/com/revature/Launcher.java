package com.revature;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter your move! Type: 'rock', 'paper', or 'scissors'. "
					+ "If you want to exit the game, type 'quit'");
			String myMove = in.nextLine();
			
			
			if(myMove.equals("quit")) {
				break;
			}
			
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
				System.out.println("Your move is invalid");
			} else {
				int random = (int)(Math.random() * 3);
				String oppMove = "";
				if(random == 0) {
					oppMove = "rock";
				} else if (random == 1) {
					oppMove = "paper";
				} else {
					oppMove = "scissors";
				}
				System.out.println("Opponent's move: " + oppMove);
				
				if(myMove.equals(oppMove)) {
					System.out.println("TIE");
				} else if((myMove.equals("rock") && oppMove.equals("scissors")) 
						|| (myMove.equals("scissors") && oppMove.equals("paper"))
						|| (myMove.equals("paper") && oppMove.equals("rock"))) {
					System.out.println("Player 1 wins");
				} else {
					System.out.println("Player 2 wins");
				}
			}
			
		}	
		System.out.println("you have exited the game");
	}
		
}
