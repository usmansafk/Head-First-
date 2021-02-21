
public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int p1Guess = 0;
		int p2Guess = 0;
		int p3Guess = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int)(Math.random()*10);
		
		while(true) {
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			p1Guess = p1.number;
			System.out.println("Player 1 has guessed " + p1Guess);
			p2Guess = p2.number;
			System.out.println("Player 2 has guessed " + p2Guess);
			p3Guess = p3.number;
			System.out.println("Player 3 has guessed " + p3Guess);
			
			if(p1Guess == targetNumber) {
				p1isRight = true;
			}
			if(p2Guess == targetNumber) {
				p2isRight = true;
			}
			if(p3Guess == targetNumber) {
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player 1 is right? " + p1isRight);
				System.out.println("Player 2 is right? " + p2isRight);
				System.out.println("Player 3 is right? " + p3isRight);
				System.out.println("Game over!");
				break;
			} else {
				System.out.println("Players will have to try again...");
			}	
		}
	}	
}


//declare three player variables
//create a startGame() method
//Inside this method:
//Initialise three players
//declare 3 variables to hold 3 guesses players make
//declare 3 variables to hold true or false based on the players answer
//make a target number that players have to guess

//while method...
//Print: Number to guess is: targetNumber
//call each players guess()
//convert players guess and assign it to playerX.number> print player X has guesses: 

//if method for each players guess
//check if guessPlayer1 == target number > change boolean variable to true

//if (player 1 or 2 or 3 is right) > print We have a winner... > p1 is right + boolean variable, do for each
//else> print players will have to try again


