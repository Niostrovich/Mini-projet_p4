package fr.iutvalence.info.M2103.projectP4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * represents a player
 * @author AUGST Maxime and CHALUMEAU Joris
 */
public class Player implements PlayerGUI, ActionListener  {
	
	/**
	 * number of this Player
	 */
	private final int numPlayer;
	
	/**
	 * this value will change every time player1 clicks on a button
	 * it will get reinitialized afterward
	 */
	public static volatile int columnChosen=-1;
	
	/**
	 * this value will change every time player1 clicks on the button help
	 * it will get reinitialized afterward
	 */
	private static volatile String helpInstruction="";
	
	/**
	 * initialize a new player (with a given number)
	 * @param numPlayer
	 */
	public Player(int numPlayer){
		this.numPlayer=numPlayer;
	}
	
	/**
	 * asks the player1 the number of the column (where he wants to add a token)
	 * selects a random int for player2 (number of the column) 
	 * @return the number of a column
	 * @throws InterruptedException
	 */
	@Override
	public int getColumn(Displaying disp) {
		if (this.numPlayer==1){
			int numCol=-1;
			String console="<html>Console :<hr>"
					+ "your turn player number 1<br>"
					+ "Where will you add a token ?<br></html>";
			disp.lab.setText(console);
			while (columnChosen==-1){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			numCol=columnChosen;
			columnChosen=-1;
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
	 * performed when clicked on a button
	 * get the value of the chosen column
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (helpInstruction=="")
			columnChosen=Integer.parseInt(e.getActionCommand());
		// --> disabled when user checks the help instructions
	}
	
	/**
	 * displays congratulation and "thank you for playing" message
	 */
	@Override
	public void cheers(boolean draw, Displaying disp) {
		String thanks="<html>Console :<hr>";
		if (!draw){
			if (this.numPlayer==1){
				thanks+="Well done, you won<br>";
			} else{
				thanks+="unfortunately, this is your loss<br>";
			}
		}
		else {
			thanks+="It is a draw ! None of you were able to win<br>";
		}
		thanks+="Thank you for playing our game<br><br>";
		thanks+="----------------------------------------------------<br>";
		thanks+="CHALUMEAU Joris & AUGST Maxime<br>";
		thanks+="----------------------------------------------------<br><br></html>";
		disp.lab.setText(thanks);
	}
	
	/**
	 * displays starting greetings and instructions (nothing more)
	 */
	@Override
	public void greetings(Displaying disp) {
		disp.lab.setText("<html>Console :<hr>"
				+"Welcome to this P4 game<br>"
				+"We hope you enjoy this mini game ;)<br>"
				+"You are player1, and player2 is an IA (random choices)<br>"
				+"player1=Yellow ; player2=Red<br></html>");
	}
	
	/**
	 * displays starting greetings and instructions (nothing more)
	 */
	@Override
	public void helpInstructions(Displaying disp) {
		if (helpInstruction==""){
			helpInstruction = disp.lab.getText();
			String help = "<html>HELP :<hr>"
					+"Your goal is to align 4 yellow tokens in any direction<br>"
					+"while preventing your opponent to align 4 red tokens<br>"
					+"It shouldn't be possible to loose since <br>"
					+"your opponent plays randomly ;)<br>"
					+"Just press any button to add a token in the column<br></html>";
			disp.lab.setText(help);
		}
		else{
			disp.lab.setText(helpInstruction);
			helpInstruction="";
		}
	}
}
