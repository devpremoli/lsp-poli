package org.howard.edu.lsp.assignment5.integerset;

/**
 * @author Prem Oli
 * devpremoli
 */

import java.util.ArrayList;
import java.util.Collections;



public class IntegerSet {
	private ArrayList<Integer> MySet = new ArrayList<>();
	public IntegerSet() {
	};
	public ArrayList<Integer> getSet() {
		return this.MySet;
	}


	// clears the internal representation of the set
	public void clear() {
		MySet.clear();
	}

	
	// returns the length of the set
	public int length() {
		return this.getSet().size();
	}

	
	// returns true if two sets are equal
	// two sets are equal if they contain all of the same value
	public boolean equals(IntegerSet OtherSet) {
		if( OtherSet.length()!=this.length()){
			return false;
		}
		
		else {
			for (int i = 0; i < OtherSet.length(); i++) {
				if (!MySet.contains(OtherSet.getSet().get(i))) {	
					return false;
			}
		};

		return true;	
	}
};


	//returns true if the set contains the number
	public boolean contains(int number) {
		return this.getSet().contains(number);
	};
	

	// returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have largest element!");
		}
		return Collections.max(this.getSet());
		
	};


	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have smallest element!");
		}
		return Collections.min(this.getSet());
		};


	// Adds an item to the set or does nothing it already there
	public void add(int item) {
		if (!this.getSet().contains(item)) {
			this.getSet().add(item);
			}
		};


	// Removes an item from the set or does nothing if not there
	public void remove(int item) throws IntegerSetException {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("Can't remove from an empty set");
		}
		if (this.getSet().contains(item)) {
			this.getSet().remove(this.getSet().indexOf(item));
		}
	};		


	// Set union
	public void union(IntegerSet intSetb) {
		if (!this.getSet().equals(intSetb.getSet())) {
			for (int i = 0; i < intSetb.getSet().size(); i ++) {
				this.add(intSetb.getSet().get(i));
			}	
		}
	};

	
	// Set intersection
	public void intersect(IntegerSet intSetb) {
		this.getSet().retainAll(intSetb.getSet());
	}


	// Set difference
	public void diff(IntegerSet intSetb) {
		this.getSet().removeAll(intSetb.getSet());
	};


	// isEmpty
	public boolean isEmpty() {
		return this.getSet().isEmpty();
	};


	// string representation
	public String toString() {
		return this.getSet().toString();
	};
}