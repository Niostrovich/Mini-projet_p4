package fr.iutvalence.info.M2103.projectP4;

// TODO detail comment
/**
 * represents the grid
 * 
 * @author augstm
 *
 */
public class Grid {

	// TODO fix comment: a grid can have anything different than the default number of columns?
	/**
	 * default quantity of a column
	 */
	private final static int COLUMN_NUMBER = 6;

	// TODO fix comment: it is pretty not understandable...
	/**
	 * represents grid table of columns token always falls on the lowest
	 * available place in the column
	 */
	public Column[] grid;

	// TODO fix comment: detail comment, tell how is the grid once built (empty, full, ... ?)
	/**
	 * Grid's builder column's grid grid with 6 columns
	 */
	public Grid() {
		for (int numCol = 0; numCol < COLUMN_NUMBER; numCol++) {

			this.grid[numCol] = new Column(numCol);
		}
	}

}
