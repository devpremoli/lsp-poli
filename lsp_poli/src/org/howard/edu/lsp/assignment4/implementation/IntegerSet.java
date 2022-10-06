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
	
	
	
	
	/**
	 * getter to retrieve our ArrayList
	 * @return the ArrayList set so that we can use it to reference other methods 
	 */
	public ArrayList<Integer> getSet() {
		return this.MySet;
	}
	
	//empties the IntegerSet to clear all the contents using the .clear() method of ArrayList
	public void clear() {
		MySet.clear();
	}
	
	//gives the length of IntegerSet
	//returns length of the IntegerSet, using .size() method of ArrayList 
	public int length() {
		return this.getSet().size();
	}
	
    // returns true if the 2 sets are equal, false otherwise;
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

 	//checks if the value is in the set
	//returns true if the IntegerSet contains the number, else false by using ArrayList's .contain() function 
	public boolean contains(int number) {
		return this.getSet().contains(number);
	}
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {

		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have largest element!");
		}
		return Collections.max(this.getSet());
		
	} 

	public int smallest() throws IntegerSetException {
		

		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("An empty set can't have smallest element!");
		}
		
		return Collections.min(this.getSet());

		}
	
	public void add(int item) {
		if (!this.getSet().contains(item)) {
			this.getSet().add(item);
		}
		
	}
	
	public void remove(int item) throws IntegerSetException {
		if (this.getSet().isEmpty()) {
			throw new IntegerSetException("Can't remove from an empty set");
		}
		if (this.getSet().contains(item)) {
			this.getSet().remove(this.getSet().indexOf(item));
		}
	}
	
	public void union(IntegerSet intSetb) {
		if (!this.getSet().equals(intSetb.getSet())) {
			
			for (int i = 0; i < intSetb.getSet().size(); i ++) {
				this.add(intSetb.getSet().get(i));
			}	
		}
	}
	
	public void intersect(IntegerSet intSetb) {
		this.getSet().retainAll(intSetb.getSet());
		
	}
	
	public void diff(IntegerSet intSetb) {
		this.getSet().removeAll(intSetb.getSet());
	};
	
	public boolean isEmpty() {
		return this.getSet().isEmpty();
	}
	
	public String toString() {
		return this.getSet().toString();
	}

}
