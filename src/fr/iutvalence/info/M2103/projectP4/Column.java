package fr.iutvalence.info.M2103.projectP4;

/**
 * Represent grid's column
 * 
 * @author augstm
 *
 */
public class Column {

	// TODO (think about it) if column are stored in an array, the array index is already
	// a way to identify column among others
	/**
	 * identity of column
	 */
	private final int number;

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
	public int height;

	/**
	 * capacity's column
	 * maximum number of token in the column (height + available space for tokens)
	 * 
	 */
	public int capacity;

	
	/**
	 * column's elements (a column is a table of elements)
	 * each element is a token
	 * modified from class Grid
	 */
	public Token[] elements;
	
	/**
	 * column's builder default values for capacity and height column number
	 * (parameter)
	 * a column has a capacity, a height, and a number(it's the identifier of the column) 
	 */
	public Column(int numCol) {
		this.capacity = FIXED_CAPACITY;
		this.height = 0;
		this.number = numCol;
	}
		
}
