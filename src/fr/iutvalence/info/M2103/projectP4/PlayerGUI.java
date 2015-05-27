package fr.iutvalence.info.M2103.projectP4;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sun.awt.DisplayChangedListener;

/**
 * represents a player
 * @author AUGST Maxime and CHALUMEAU Joris
 */
public class PlayerGUI {
	
	/**
	 * number of this Player
	 */
	private final int numPlayer;
	
	/**
	 * initialize a new player (with a given number)
	 * @param numPlayer
	 */
	public PlayerGUI(int numPlayer){
		this.numPlayer=numPlayer;
	}
	
	/**
	 * asks the player1 the number of the column (where he wants to add a token)
	 * selects a random int for player2 (number of the column) 
	 * @return the number of a column
	 */
	public int getColumn(Displaying disp){
		if (this.numPlayer==1){
			int numCol=-1;
			String console="<html>Console :<hr>"
					+ "your turn player number 1<br>"
					+ "A quelle colonne rajouter le pion ?<br></html>";
			while (numCol<0 || numCol>6){
				disp.lab.setText(console);
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String s = br.readLine();
					numCol=Integer.parseInt(s);
				} catch (IOException e){}
			}
			disp.lab.setText("<html>Console :<hr>numCol : "+numCol);
			return numCol;
		}
		else{
			// else player2 (computer) playing
			Random rand = new Random();
			int randNumb=rand.nextInt(6);
			disp.lab.setText("<html>Console :<hr>player number 2 has chosen column number "+randNumb);
			return randNumb; // generates "randomly" between 0 and 6 (number of the column)
		}
	}
	
	/**
	 * displays congratulation and "thank you for playing" message
	 */
	public void cheers(boolean draw, Displaying disp) {
		String thanks="<html>Console :<hr>";
		if (!draw){
			if (this.numPlayer==1){
				thanks+="Well done, you won<br>";
			}
			else{
				thanks+="unfortunately, this is a loss<br>";
			}
		}
		else {
			thanks+="It is a draw ! None of you were able to win<br>";
		}
		thanks+="Thank you for playing our game<br><br>";
		thanks+="--------------------------------<br>";
		thanks+="CHALUMEAU Joris and AUGST Maxime<br>";
		thanks+="--------------------------------<br><br></html>";
		disp.lab.setText(thanks);
	}
	
	/**
	 * displays starting greetings and instructions (nothing more)
	 */
	public void greetings(Displaying disp) {
		disp.lab.setText("<html>Console :<hr>"
				+"Welcome to this P4 game<br>"
				+"We hope you enjoy this mini game ;)<br>"
				+"You are player1, and player2 is an IA (random choices)<br>"
				+"player1=Yellow ; player2=Red<br></html>");
	}
	
}
