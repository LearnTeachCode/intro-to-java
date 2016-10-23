import java.util.*;

public class TicTacToeDriver{
	
	public static void main(String[] args){

		TicTacToe board = new TicTacToe();

		//board.drawMove(0,0, 'x');

		Scanner input = new Scanner(System.in);
		
		/**
      ALTER THE CODE TO MAKE THE GAME
      PROMPT THE USER TO RESTART AFTER A GAME ENDS
    **/
		while(!board.checkForWinner()){

			System.out.println("Which row?");
			int getRow = input.nextInt();

			System.out.println("Which index?");
			int getIndex = input.nextInt();

			board.playerMove(getRow,getIndex);
		}

	}
}