package fr.iutvalence.info.M2103.projectP4;

import javax.swing.*;
import java.awt.*;


/**
 * Task managing the interface (creating, displaying...)
 * 
 * @author augstm
 *
 */
public class Displaying implements Runnable {

	@Override
	public void run() {
		JFrame window = new JFrame();
		window.setTitle("Puissance 4");
		window.setSize(860, 680);
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// displays the window
		window.setVisible(true);
		/*window.setLayout(GridLayout gl=new GridLayout(6,7,CellState.voidToken(window)));
		gl.setHgap(3); // 3 pixels blanc spaces between 2columns
		for (int numButton;numButton<42;numButton++){
		    this.getContentPane().add(new JButton());
		}*/
	}



}
