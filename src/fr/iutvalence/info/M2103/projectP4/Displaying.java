package fr.iutvalence.info.M2103.projectP4;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

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
		window.setSize(716, 750);
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		
		// pan1 => the grid (for the P4 game)
		pan1.setSize(716,618);
		GridLayout gl = new GridLayout(6,7);
		pan1.setLayout(gl);
		for (int numButton=0;numButton<42;numButton++){
			JButton button = new JButton(); 
		    pan1.add(button);
		    button.setIcon(new ImageIcon("./img/imgCaseP4-blanc.png"));
		    // default picture (P4 game without token)
		}
		
		// pan2 => the console
		pan2.setSize(716,770);
		pan2.add(new JLabel("bla"));
		
		splitPane.add(pan1);
		splitPane.add(pan2);
		splitPane.setDividerLocation(619);
		splitPane.setEnabled(false);
		splitPane.setDividerSize(0);
		
		window.setContentPane(splitPane);
		//CellState.voidToken(window)
		// displays the window
		window.setVisible(true);
	}



}
