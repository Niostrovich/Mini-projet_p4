package fr.iutvalence.info.M2103.projectP4;

//import java.util.Scanner;

/**
 * Main function run the program
 * 
 * @author augstm
 *
 */
public class Main {
	
	//private static final Scanner SCANNER = new Scanner(System.in); // makes the script lighter when used as a CONSTANT

	/**
	 * method main (used to call the P4Game builder, which launches a new game)
	 * @param args
	 */
	public static void main(String[] args) {
			/*while(continueGame){
			boolean continueGame=true;*/
		
			P4Game myGame=new P4Game();
			myGame.play();
			/*
			System.out.println("Do you want to play again ?\n");
			System.out.println("(Type OUI or oui if you want to play again)\n");
			String userAnswer = SCANNER.nextLine();
			if (userAnswer!="OUI" && userAnswer!="oui")
				continueGame=false;*/
			
			/*
			System.out.println("Thank you for playing our game\n\n");
			System.out.println("-------------------------------------------\n");
			System.out.println("CHALUMEAU Joris and AUGST Maxime\n");
			System.out.println("-------------------------------------------\n\n");
			*/
	}
}