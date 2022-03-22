
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		Random rand = new Random();
		playGame(rand);
		
	}

	public static void playGame(Random rand) {
		Game aGame = new Game();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

	// commencer le jeu s'il est jouable avec ou moin 2 personnes
		if (aGame.isPlayable()) {
			do {
				//Lancement du dé
				// Le déplacement est dans la méthode roll, il manque la séparation des responsabilités pour les fonction
				// Il y a aussi un problème sur le nommage
				aGame.roll(rand.nextInt(5) + 1);





				if (rand.nextInt(9) == 7) {
					notAWinner = aGame.wrongAnswer();
				} else {
					notAWinner = aGame.wasCorrectlyAnswered();
				}



			} while (notAWinner);
		}

	}
}
