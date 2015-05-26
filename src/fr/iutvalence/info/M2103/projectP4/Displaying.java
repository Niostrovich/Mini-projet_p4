package fr.iutvalence.info.M2103.projectP4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

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
		window.setLocationRelativeTo(null);
		window.setAlwaysOnTop(true);
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		// pan1 => the grid (for the P4 game)
		GridLayout gl = new GridLayout(6,7);
		pan1.setLayout(gl);
		for (int numButton=0;numButton<42;numButton++){
			ButtonP4 button = new ButtonP4(numButton); 
		    pan1.add(button);
		    button.setIcon(new ImageIcon("./img/imgCaseP4-blanc.png"));
		    			// default picture (P4 game without token)
		    button.addActionListener(null);
		}
		
		// pan2 => the console
		JLabel lab = new JLabel("Console :\n");
		lab.setHorizontalTextPosition(SwingConstants.LEFT);
		lab.setHorizontalAlignment(SwingConstants.LEFT);
		pan2.add(lab);
		
		// splitPane
		splitPane.add(pan1);
		splitPane.add(pan2);
		splitPane.setDividerLocation(588);
		splitPane.setEnabled(false);
		splitPane.setDividerSize(0);
		
		// adding JSplitPane (both pan1 and pan2) in JFrame
		window.setContentPane(splitPane);
		//CellState.voidToken(window)
		// displays the window
		window.setVisible(true);
	}
	
}
