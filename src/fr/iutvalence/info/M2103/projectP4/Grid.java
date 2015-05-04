package fr.iutvalence.info.M2103.projectP4;

/**
 * represents the grid
 * it's our game's grid
 * 
 * @author augstm
 *
 */
public class Grid {

	/**
	 * quantity of a column
	 * number of column
	 */
	private final static int COLUMN_NUMBER = 6;

	/**
	 * represents grid (=table of columns)
	 * the token always falls on the lowest possible place in the column
	 * 
	 */
	public Column[] columns;

	// TODO fix comment: detail comment, tell how is the grid once built (empty, full, ... ?)
	/**
	 * Grid's builder column's grid
	 * Contains 6 columns
	 */
	public Grid() {
		for (int numCol = 0; numCol < COLUMN_NUMBER; numCol++) {
			this.columns[numCol] = new Column(numCol);
		}
	}
	
	// TODO write comment
	public boolean addToken(int number, Token myColor)
	{
		if (this.columns[number].height<this.columns[number].capacity){
			this.columns[number].elements[this.columns[number].height-1]=myColor;
			this.columns[number].height=this.columns[number].height+1;
			return true;
		}
		return false;
	}
	
	
	/**
	 * Get an Ascii-Art representation of the grid
	 * 
	 */
	/*							To update soon (false at the moment)
	public String toString()
	{
		String echiquierAsciiArt = "------------------------------------------------\n";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				echiquierAsciiArt += this.obtenirCase(new Position(numeroDeLigne, numeroDeColonne));
			echiquierAsciiArt += "\n------------------------------------------------\n";
		}

		return echiquierAsciiArt;
	}
	*/
	
}
