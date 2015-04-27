package fr.iutvalence.info.M2103.projectP4;
/**
 * Represent grid's column
 * @author augstm
 *
 */

public class Column {
	
	private final static int DEFAULT_CAPACITY = 6; 
/**
 * column's height
 */
	public int height;
/**
 * capacity's column	
 */
	private int capacity;

/**
 * column's biulder	
 */
	public Column()
	{
		this.capacity=DEFAULT_CAPACITY;
		this.height=0;
	}
	
}
