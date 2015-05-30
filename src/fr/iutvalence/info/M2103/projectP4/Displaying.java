package fr.iutvalence.info.M2103.projectP4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 * @author AUGST Maxime and CHALUMEAU Joris
 *
 */
public class Displaying implements Runnable, ActionListener {
	
	/**
	 * controls P4 player
	 */
	private InterfaceUser playerManager;
	
	/**
	 * the window of the game (including both the grid and the console)
	 */
	private JFrame window;
	
	/**
	 * panel 1 (the grid of the game)
	 */
	protected JPanel pan1;
	
	/**
	 * panel 2 (the console)
	 */
	private JPanel pan2;
	
	/**
	 * label of the console (used to give info to the player)
	 */
	protected JLabel lab;
	
	/**
	 * constructor of the window
	 * creates new window
	 * @param controller
	 */
	public Displaying(InterfaceUser controller){
		this.playerManager = controller;
		this.window = new JFrame();
		this.pan1 = new JPanel();
		this.pan2 = new JPanel();
		this.lab = new JLabel("Console :");
	}
	
	/**
	 * overrides runnable
	 * works in another thread than main
	 */
	@Override
	public void run() {
		this.initGraphInterface();
		// greeting message
		this.playerManager.greetings(this);
	}
	
	/**
	 * Used to initialize the Graphic Interface
	 */
	protected void initGraphInterface(){
		this.window.setTitle("Puissance 4");
		this.window.setSize(716, 800);
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		// pan2 => the console
		this.pan2.setLayout(new BorderLayout());
		this.pan2.add(this.lab);
		JButton helpButton = new JButton();
		helpButton.setIcon(new ImageIcon("./img/imgHelpButton.png"));
		this.pan2.add(helpButton, BorderLayout.EAST);
		helpButton.addActionListener(this);
		
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
	
	public void addButtonWindow(){
		// pan1 => the grid (for the P4 game)
		GridLayout gl = new GridLayout(6,7);
		this.pan1.setLayout(gl);
		for (int numButton=0;numButton<42;numButton++){
			ButtonP4 button = new ButtonP4(numButton, this.playerManager);
			this.pan1.add(button);
			this.pan1.setComponentZOrder(button,numButton);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.playerManager.helpInstructions(this);
	}
	
	
}
