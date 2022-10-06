package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author Prem Oli
 * devpremoli
 */

public class IntegerSet {
	private ArrayList<Integer> MySet = new ArrayList<>();
	
	public IntegerSet(){
		
	};
	
	
	public ArrayList<Integer> getSet() {
		return this.MySet;
	}
	
	// clear
	public void clear() {
		MySet.clear();
	}
	
	// checks length
	public int length() {
		return this.getSet().size();
	}
	
	// equal
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

	//returns true if the IntegerSet contains the number
	public boolean contains(int number) {
		return this.getSet().contains(number);
	}
	
	// returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {

		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have largest element!");
		}
		return Collections.max(this.getSet());
		
	} 
	
	// smallest
	public int smallest() throws IntegerSetException {
		

		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have smallest element!");
		}
		
		return Collections.min(this.getSet());

		}
	
	// add
	public void add(int item) {
		if (!this.getSet().contains(item)) {
			this.getSet().add(item);
		}
		
	}
	
	// remove
	public void remove(int item) throws IntegerSetException {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("Can't remove from an empty set");
		}
		if (this.getSet().contains(item)) {
			this.getSet().remove(this.getSet().indexOf(item));
		}
	}
	
	// union
	public void union(IntegerSet intSetb) {
		if (!this.getSet().equals(intSetb.getSet())) {
			
			for (int i = 0; i < intSetb.getSet().size(); i ++) {
				this.add(intSetb.getSet().get(i));
			}	
		}
	}
	
	// intersect
	public void intersect(IntegerSet intSetb) {
		this.getSet().retainAll(intSetb.getSet());
		
	}
	
	// difference
	public void diff(IntegerSet intSetb) {
		this.getSet().removeAll(intSetb.getSet());
	};
	
	// isEmpty
	public boolean isEmpty() {
		return this.getSet().isEmpty();
	}
	
	// string representation
	public String toString() {
		return this.getSet().toString();
	}

}
