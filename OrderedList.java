interface OrderedList {
	// returns string representation of list
	public String toString();
	
	// adds the integer "value" to the list in ascending order
	public void add( int value);
	
	// removes integer from the list at given index
	public int remove( int index);
	
	// returns integer from the list at given index
	public int get( int index);
	
	// returns size of list
	public int size();
}