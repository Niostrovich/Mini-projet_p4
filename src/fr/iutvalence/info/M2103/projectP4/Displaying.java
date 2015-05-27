package fr.iutvalence.info.M2103.projectP4;

import java.awt.FlowLayout;
import java.awt.GridLayout;

//import java.awt.event.ActionEvent;
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
 * @author AUGST Maxime and CHALUMEAU Joris
 *
 */
public class Displaying implements Runnable {
	
	/**
	 * the window of the game (including both the grid and the console)
	 */
	private JFrame window;
	
	/**
	 * panel 1 (the grid of the game)
	 */
	private JPanel pan1;
	
	/**
	 * panel 2 (the console)
	 */
	private JPanel pan2;
	
	/**
	 * label of the console (used to give info to the player)
	 */
	protected JLabel lab;
	
	public Displaying(){
		this.window = new JFrame();
		this.pan1 = new JPanel();
		this.pan2 = new JPanel();
		this.lab = new JLabel("Console :");
	}
	
	@Override
	public void run() {
		this.window.setTitle("Puissance 4");
		this.window.setSize(716, 800);
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		// pan1 => the grid (for the P4 game)
		GridLayout gl = new GridLayout(6,7);
		this.pan1.setLayout(gl);
		for (int numButton=0;numButton<42;numButton++){
			ButtonP4 button = new ButtonP4(numButton); 
			this.pan1.add(button);
		    button.setIcon(new ImageIcon("./img/imgCaseP4-blanc.png"));
		    			// default picture (P4 game without token)
		    button.addActionListener(null);
		}
		
		// pan2 => the console
		this.pan2.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.pan2.add(this.lab);
		
		// splitPane
		splitPane.add(this.pan1);
		splitPane.add(this.pan2);
		splitPane.setDividerLocation(587);
		splitPane.setEnabled(false);
		splitPane.setDividerSize(0);
		
		// adding JSplitPane (both pan1 and pan2) in JFrame
		this.window.setContentPane(splitPane);
		// displays the window
		this.window.setVisible(true);
	}
	
}
