package assignment2;

import java.util.Scanner;
import java.util.Random;

class Guesser {
    private int number;
    public Guesser() {
        Random generator = new Random();
        this.number = generator.nextInt(100) + 1;
    }
    public int getNumber() {
        return this.number;
    }
}

class Player 
{
    public int guessNumber1(int guesserNumber) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Player 1, Enter your guess (between 1 and 100): ");
        int guess = keyboard.nextInt();
        if (guess < guesserNumber) {
            if (guesserNumber - guess > 10) {
                System.out.println("Player 1, Your guess is extremely low.");
            } else {
                System.out.println("Player 1, Your guess is low.");
            }
        } else if (guess > guesserNumber) {
            if (guess - guesserNumber > 10) {
                System.out.println("Player 1, Your guess is extremely high.");
            } else {
                System.out.println("Player 2, Your guess is high.");
            }
        }
        return guess;
    }
    
    public int guessNumber2(int guesserNumber) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Player 2, Enter your guess (between 1 and 100): ");
        int guess = keyboard.nextInt();
        if (guess < guesserNumber) {
            if (guesserNumber - guess > 10) {
                System.out.println("Player 2, Your guess is extremely low.");
            } else {
                System.out.println("Player 2, Your guess is low.");
            }
        } else if (guess > guesserNumber) {
            if (guess - guesserNumber > 10) {
                System.out.println("Player 2, Your guess is extremely high.");
            } else {
                System.out.println("Player 2, Your guess is high.");
            }
        }
        return guess;
    }
    
    public int guessNumber3(int guesserNumber) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Player 3, Enter your guess (between 1 and 100): ");
        int guess = keyboard.nextInt();
        if (guess < guesserNumber) {
            if (guesserNumber - guess > 10) {
                System.out.println("Player 3, Your guess is extremely low.");
            } else {
                System.out.println("Player 3, Your guess is low.");
            }
        } else if (guess > guesserNumber) {
            if (guess - guesserNumber > 10) {
                System.out.println("Player 3, Your guess is extremely high.");
            } else {
                System.out.println("Player 3, Your guess is high.");
            }
        }
        return guess;
    }
}

class Umpire {
    public void compareNumbers(int guesserNumber, int guess1, int guess2, int guess3) {
        if (guesserNumber == guess1) 
        {
        	if(guesserNumber == guess2 && guesserNumber == guess3)
        	{
        		System.out.println("Game tied all three Players guessed correctly");
        	}
        	else if(guesserNumber == guess2)
        	{
        		System.out.println("Player 1 and Player 2 guessing the right number");
        	}
        	else if(guesserNumber == guess3)
        	{
        		System.out.println("Player 1 and Player 3 guessing the right number");
        	}
        	else
        	{
        		System.out.println("//////Player 1 Won the Game\\\\\\");
        	}
        }
        else if (guesserNumber == guess2)
        {
        	if(guesserNumber == guess3)
        	{
        		System.out.println("Player 2 and Player 3 guessing the right number");
        	}
        	else
        	{
        		System.out.println("//////Player 2 Won the Game\\\\\\");
        	}
        }
        else if (guesserNumber == guess3)
        {
        	System.out.println("//////Player 3 Won the Game\\\\\\");
        }
        else
        {
        	System.out.println("Game Lost! Try Again");
        }


        if (guess1 < guesserNumber) 
        {
            if (guess1 == guess2 && guess1 == guess3) {
                System.out.println("All players' guesses are extremely low.");
            } else if (guess1 == guess2) {
                System.out.println("Player 1 & 2's guesses are low.");
            } else if (guess1 == guess3) {
                System.out.println("Player 1 & 3's guesses are low.");
            } else {
                System.out.println();
            }
        } 
        else if (guess1 > guesserNumber) 
        {
            if (guess1 == guess2 && guess1 == guess3) {
                System.out.println("All players' guesses are extremely high.");
            } else if (guess1 == guess2) {
                System.out.println("Player 1 & 2's guesses are high.");
            } else if (guess1 == guess3) {
                System.out.println("Player 1 & 3's guesses are high.");
            } else {
                System.out.println();
            }
        }
    }
}


public class GuesserGameProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String playAgain = "yes";
        int round = 1;
        int guesserNumber = 0;
        while (playAgain.equalsIgnoreCase("yes")) {
            if (round % 3 == 1) {
                System.out.println("Let's play a guessing game");
                System.out.print("******************* Round " + ((round / 3) + 1));
                System.out.println(" ********************");
                Guesser guesser = new Guesser();
                guesserNumber = guesser.getNumber();
            }
            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();
            int guess1 = player1.guessNumber1(guesserNumber);
            int guess2 = player2.guessNumber2(guesserNumber);
            int guess3 = player3.guessNumber3(guesserNumber);
            Umpire umpire = new Umpire();
            umpire.compareNumbers(guesserNumber, guess1, guess2, guess3);
            round++;
            if (round % 3 == 1) {
                System.out.println("Would you like to play again? (yes/no)");
                playAgain = keyboard.nextLine();
            }
        }
        System.out.println("All Rounds are finished");
        System.out.println("Goodbye");
    }
}