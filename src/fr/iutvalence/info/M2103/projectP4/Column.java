package fr.iutvalence.info.M2103.projectP4;

// TODO fix comment: this class creates nothing. Tell what this class represents
/**
 * Create grid's column
 * @author augstm
 *
 */

public class Column {
	
	// TODO write comment
	private final static int DEFAULT_CAPACITY = 6;
	
	// TODO format your code properly
/**
 * column's height
 */
	// TODO this field should not be public, declare it private
	public int height;
/**
 * capacity's column	
 */
	private int capacity;

	// TODO fix comment: misspelling
	// TODO fix comment: detail comment, tell how is the column (its state) once built
/**
 * column's biulder	
 */
	public Column()
	{
	this.capacity=DEFAULT_CAPACITY;
	this.height=0;
	}
	
}
