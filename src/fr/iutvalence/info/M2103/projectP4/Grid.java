package fr.iutvalence.info.M2103.projectP4;

// TODO fix comment: this class creates nothing, tell what it is (DONE)
/**
 * represents the grid
 * 
 * @author augstm
 *
 */
public class Grid {

	// TODO write comment (DONE)
	/**
	 * default quantity of a column
	 */
	private final static int COLUMN_NUMBER = 6;

	/**
	 * represents grid table of columns token always falls on the lowest
	 * available place in the column
	 */
	public Column[] grid;

	// TODO fix comment: detail comment, tell how is the grid once built (DONE)
	/**
	 * Grid's builder column's grid grid with 6 columns
	 */
	public Grid() {
		for (int numCol = 0; numCol < COLUMN_NUMBER; numCol++) {

			// TODO ask me to discuss about this (DONE)
			this.grid[numCol] = new Column(numCol);
		}
	}

}
