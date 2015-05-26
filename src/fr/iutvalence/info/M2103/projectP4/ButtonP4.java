package fr.iutvalence.info.M2103.projectP4;

import javax.swing.JButton;

public class ButtonP4 extends JButton {
	private int numCol;
	
	public ButtonP4(int numButton) {
		switch (numButton) {
		case 0: case 7: case 14: case 21: case 28: case 35:
			this.numCol=0;
			break;
		case 1: case 8: case 15: case 22: case 29: case 36:
			this.numCol=1;
			break;
		case 2: case 9: case 16: case 23: case 30: case 37:
			this.numCol=2;
			break;
		case 3: case 10: case 17: case 24: case 31: case 38:
			this.numCol=3;
			break;
		case 4: case 11: case 18: case 25: case 32: case 39:
			this.numCol=4;
			break;
		case 5: case 12: case 19: case 26: case 33: case 40:
			this.numCol=5;
			break;
		default:
			this.numCol=6;
		}
	}
}
