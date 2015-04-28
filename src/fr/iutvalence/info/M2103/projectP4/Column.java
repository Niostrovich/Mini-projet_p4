package fr.iutvalence.info.M2103.projectP4;

/**
 * Represent grid's column
 * 
 * @author augstm
 *
 */
public class Column {

	// TODO (tink anout it) if column are stored in an arry, the array index is already
	// a way to identify column among others
	/**
	 * identity of column
	 */
	private final int number;

	// TODO (think about it) is there some columns with a different capacity?
	/**
	 * column's default capacity
	 */
	private final static int DEFAULT_CAPACITY = 6;

	// TODO detail comment (the diffenrec between height and capacity is not clear)
	/**
	 * column's height
	 */
	private int height;

	// TODO detail comment (the diffenrec between height and capacity is not clear)
	/**
	 * capacity's column
	 */
	private int capacity;

	// TODO detail comment (how is the column when built?)
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
