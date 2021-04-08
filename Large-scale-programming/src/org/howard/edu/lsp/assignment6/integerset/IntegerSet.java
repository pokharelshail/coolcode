package org.howard.edu.lsp.assignment6.integerset;


import java.util.ArrayList;

import java.util.List;

import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class IntegerSet {
	
	// ArrayList of integers 
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Constructor for IntegerSet.
	 *
	 * @param integers The list of integers to create the set in IntegerSet.  
	 */
	public IntegerSet(List<Integer> integers) {
		// Initializes the ArrayList with values given from message param using a for loop.
		for (int i = 0; i < integers.size(); i++) {
			//Get number
			int number= (int) integers.get(i);
			this.add(number);
		}
	}
	
	

	/**
	 * Clears the internal representation of the set.
	 */
	public void clear() {
		if (!this.isEmpty()) {
			this.set.clear();
		}
	}

	/**
	 * Returns the length of the set.
	 * 
	 * @return this.set.size which is the number of ints in the given set
	 */
	public int length() {
		return this.set.size();
	} 
	
	/**
	 * Gets the ArrayList of the IntegerSet.
	 *
	 * @return  The arrayList of the instance
	 */
	public List<Integer> getSet() {
		return this.set;
	}

	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * 
	 * @param b IntegerSet instance
	 * 
	 * @return boolean truth value of equals statement
	 */
	public boolean equals(IntegerSet secondSet) {
		//Check if length is different and if it is then instantly return false
		if (this.length() != secondSet.length()) {
			return false;
		}
		for (int i = 0; i < this.length(); i++) {
			if (!(secondSet.contains(this.set.get(i)))){
				return false;
			}
		}
		return true;
	} 

	/**
	 * Returns true if the set contains the value, otherwise false.
	 * 
	 * @param  the integer value
	 * 
	 * @return boolean truth value for the contains statement
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}    

	/**
	   * Returns the largest item in the set; Throws a IntegerSetException if the set is empty.
	   * 
	   * @return largest int value of the largest element in an instance of an IntegerSet
	   */
	public int largest() throws IntegerSetException {
		if (this.isEmpty()) {
			throw new IntegerSetException("IntegerSetException: The list is empty");
		} else if (this.length() == 1) {
			return this.set.get(0);
		}
		int largest = this.set.get(0);
		for (int i = 1; i < this.length(); i++) {
			if (this.set.get(i) > largest) {
				largest = this.set.get(i);
			}
		}
		return largest;
	} 

	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty.
	 * 
	 * @return smallest int value of the IntegerSet
	 */
	public int smallest() throws IntegerSetException {
		if (this.isEmpty()) {
			throw new IntegerSetException("IntegerSetException: The list is empty no small number");
		} else if (this.length() == 1) {
			return this.set.get(0);
		}
		int smallest = this.set.get(0);
		for (int i = 1; i < this.length(); i++) {
			if (this.set.get(i) < smallest) {
				smallest = this.set.get(i);
			}
		}
		return smallest;
	}

	/**
	 * Adds an item to the set or does nothing it already there	.
	 * 
	 * @param item int representation of integer to potentially add to IntegerSet instance
	 */
	public void add(int item) {
		if (!(this.contains(item))) {
			this.set.add(item);
		}
		
	}
 
	/**
	 * Removes an item from the set or does nothing if not there.
	 * 
	 * @param item int representation of integer that maybe in the List and if it is will get removed
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			int position = this.set.indexOf(item);
			this.set.remove(position);
		} 
	} 
 
	/**
	* Set union (aka inclusive or). The result now becomes the value of the IntegerSet value
	* 
	* @param intSetb IntegerSet being passed for union
	*/
	public void union(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getSet();
		if (intSetb.isEmpty()) {
			return;
		}
		for (int i = 0; i < intSetb.length(); i++) {
			if (this.contains(setB.get(i))) {
				continue;
			}
			this.add(setB.get(i));
		}
	}

	/**
	 * Set intersection (aka AND). The result now becomes the value of the IntegerSet 
	 * 
	 * @param intSetb IntegerSet instance being compared
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> intersectingSet = new ArrayList<Integer>();
		for (int i = 0; i < this.length(); i++) {
			int set_value = this.set.get(i);
			if (intSetb.contains(set_value)) {
				intersectingSet.add(set_value);
			}
		}
		this.set = intersectingSet;
	} 

	/**
	 * Set difference (aka exclusive OR). The result now becomes the value of the IntegerSet 
	 * 
	 * @param intSetb IntegerSet instance being compared
	 */
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < this.length(); i++) {
			int set_value = this.set.get(i);
			if (intSetb.contains(set_value)) {
				this.remove(set_value);
			}
		}
	}
 
	/**
	 *  Returns true if the set is empty, false otherwise
	 * 
	 * @return true if set is empty and false if it is not
	 */
	public boolean isEmpty() {
		return this.set.isEmpty();
	} 

	/**
	 * Return String representation of your set 
	 * 
	 * @return string representation of set
	 */
	public String toString() {
		return this.set.toString();
	}
	
}