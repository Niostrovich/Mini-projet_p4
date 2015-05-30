package fr.iutvalence.info.M2103.projectP4;

/**
 * represents the grid
 * it's our game's grid
 * 
 * @author AUGST Maxime and CHALUMEAU Joris
 *
 */
public class Grid {

	/**
	 * number of columns
	 * if made private, will cause problems to check if there is a winner
	 */
	protected final static int NUMBER_OF_COLUMNS = 7;

	/**
	 * number of lines
	 * if made private, will cause problems to check if there is a winner
	 */
	protected final static int NUMBER_OF_LINES = 6;

	/**
	 * represents grid (=table of columns)
	 * the token always falls on the lowest possible place in the column
	 * 
	 */
	public Column[] columns=null;

	/**
	 * Grid's builder column's grid
	 * Contains 6 (empty) columns
	 * In other words : builds a grid composed of 6 empty columns
	 */
	public Grid() {
		this.columns=new Column[NUMBER_OF_COLUMNS];
		for (int numCol = 0; numCol < NUMBER_OF_COLUMNS; numCol++) {
			this.columns[numCol] = new Column();
		}
	}
	
	/**
	 * the function adds a token in the column if possible (empty slots available in the column).
	 * @param number number of the column (where the token is added).
	 * @param myColor color of the token that is added.
	 * @return true if token was added ; false otherwise.
	 */
	public boolean addTokenGrid(int colNumber, int numPlayer, Displaying disp)
	{
		if (this.columns[colNumber].height<this.columns[colNumber].capacity){
			switch (numPlayer){
			case 1:
				this.columns[colNumber].cellStates[this.columns[colNumber].height]=CellState.YELLOW_TOKEN;
				// adds a yellow token in the displayed window
				ButtonP4 buttonToYelowColor=(ButtonP4) disp.pan1.getComponent(getNumButton(colNumber, this.columns[colNumber].height+1));
				buttonToYelowColor.switchColorButton(CellState.YELLOW_TOKEN);
				break;
			case 2:
				this.columns[colNumber].cellStates[this.columns[colNumber].height]=CellState.RED_TOKEN;
				// adds a red token in the displayed window
				ButtonP4 buttonToRedColor=(ButtonP4) disp.pan1.getComponent(getNumButton(colNumber, this.columns[colNumber].height+1));
				buttonToRedColor.switchColorButton(CellState.RED_TOKEN);
				break;
			}
			this.columns[colNumber].height=this.columns[colNumber].height+1;
			return true;
		}
		return false;
	}
	
	/**
	 * used to convert column and line number into the number of a button
	 * @param colNumber
	 * @param height
	 * @return
	 */
	public int getNumButton(int colNumber, int height) {
		return (NUMBER_OF_LINES-height)*NUMBER_OF_COLUMNS+colNumber;
	}

	/**
	 * Get an Ascii-Art representation of the grid
	 * 
	 */
	public String gridToString()
	{
		String p4AsciiArt = "-------------------------------------------\n";
		for (int lineNumber=NUMBER_OF_LINES-1; lineNumber>=0; lineNumber--)
		{
			for (int columnNumber=0; columnNumber< NUMBER_OF_COLUMNS; columnNumber++){
				p4AsciiArt+="|";
				p4AsciiArt += this.columns[columnNumber].tokenAtGivenHeightToString(lineNumber);
			}
			p4AsciiArt+="|";
			p4AsciiArt+="\n";
			p4AsciiArt+= "-------------------------------------------\n";
		}
		p4AsciiArt+= "   0     1     2     3     4     5     6\n";
		return p4AsciiArt;
	}
	
	
	/**
	 * returns true if the designated token is of the color corresponding to the num of the player ; otherwise false
	 * @param columnNumber
	 * @param lineNumber
	 * @param numPlayer
	 * @return
	 */
	public boolean samePlayerToken(int columnNumber,int lineNumber,int numPlayer){
		if((this.columns[columnNumber].cellStates[lineNumber]==CellState.YELLOW_TOKEN && numPlayer==1)
				|| (this.columns[columnNumber].cellStates[lineNumber]==CellState.RED_TOKEN && numPlayer==2))
			return true;
		return false;
	}
	
	/**
	 * returns true if the grid is full of tokens (no more empty place for another token) ; otherwise false
	 * @return
	 */
	public boolean gridFullOfToken() {
		for (int colNumber=0;colNumber<NUMBER_OF_COLUMNS;colNumber++){
			if (this.columns[colNumber].height!=this.columns[colNumber].capacity)
				return false;
		}
		return true;
	}
}