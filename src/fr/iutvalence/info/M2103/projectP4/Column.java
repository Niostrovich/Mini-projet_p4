package fr.iutvalence.info.M2103.projectP4;

/**
 * Represent grid's column
 * 
 * @author augstm
 *
 */
public class Column {

	/**
	 * identity of column
	 */
	private final int number;

	/**
	 * column's default capacity
	 */
	private final static int DEFAULT_CAPACITY = 6;

	/**
	 * column's height
	 */
	private int height;

	/**
	 * capacity's column
	 */
	private int capacity;

	/**
	 * column's builder default values for capacity and height column number
	 * (parameter)
	 */
	public Column(int numCol) {
		this.capacity = DEFAULT_CAPACITY;
		this.height = 0;
		this.number = numCol;
	}
	
	/*
	public addToken()
	{
		
	}
	*/
}
