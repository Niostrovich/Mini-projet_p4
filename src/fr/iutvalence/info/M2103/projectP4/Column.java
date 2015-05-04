package fr.iutvalence.info.M2103.projectP4;

/**
 * Represent grid's column
 * 
 * @author augstm
 *
 */
public class Column {

	// TODO (think about it) if column are stored in an array, the array index is already
	// a way to identify column among others (DONE)

	//private final int number; (TO DELETE)

	/**
	 * column's capacity
	 * the maximum height
	 */
	private final static int FIXED_CAPACITY = 6;

	/**
	 * column's height
	 * number of token in the column
	 * modified from class Grid
	 */
	private int height;

	/**
	 * capacity's column
	 * maximum number of token in the column (height + available space for tokens)
	 * 
	 */
	private final int capacity;

	
	/**
	 * column's elements (a column is a table of elements)
	 * each element is a token
	 * modified from class Grid
	 */
	private CellState[] cellStates;
	
	/**
	 * Returns a new empty column 
	 */
	public Column() {
		this.capacity = FIXED_CAPACITY;
		this.height = 0;
		this.cellStates = new CellState[FIXED_CAPACITY];
		for (int numCell=0;numCell<FIXED_CAPACITY;numCell++)
		{
			cellStates[numCell]=CellState.NO_TOKEN;
		}
	}

	public String tokenAtGivenHeightToString(int lineNumber) {
		return this.cellStates[lineNumber].toString();
	}
}
