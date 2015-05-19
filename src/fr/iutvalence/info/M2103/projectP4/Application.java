package fr.iutvalence.info.M2103.projectP4;

import javax.swing.SwingUtilities;

/**
 * Une application affichant une fenêtre simple
 * 
 * @author augstm
 *
 */
public class Application {
	
	/**
	 * Main de l'application 
	 * @param args (n/a)
	 */
	public static void main(String[] args) {
		// Exécution de la tâche de gestion de l'IHM dans le thread "event dispatch" de Swing
				SwingUtilities.invokeLater(new Displaying());
				System.out.println("fin du main !");
	}

}
