package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

/**
 * @author Prem Oli
 * devpremoli
 */

public class Driver {
	public static void main (String[] args) throws IntegerSetException {
	IntegerSet set_a = new IntegerSet();
	
	//adds the value to the set_a
	set_a.add(0);
	set_a.add(1);
	set_a.add(2);
	
	System.out.println("Value of set_a is:"+ " " + set_a.toString());
	
	//returns smallest value of set_a
	System.out.println("Smallest value of set_a is:"+ " " + set_a.smallest());
	
	//returns largest value of set_a
	System.out.println("Largest value of set_a is:"+ " " + set_a.largest());
	
	//checks contains
	System.out.println("set_a.contains(6) returns: "+ " " + set_a.contains(6));
	System.out.println("set_a.contains(1) returns: "+ " " + set_a.contains(1));

	IntegerSet set_b = new IntegerSet();
	set_b.add(4);
	set_b.add(5);

	//checks union
	System.out.println("union of set_a and set_b");
	System.out.println("Value of set_a is:" + set_a.toString());
	System.out.println("Value of set_b is:" + set_b.toString());
	set_a.union(set_b);// union of set_a and set_b
	
	// result of union of set_a and set_b
	System.out.println("Result of union of set_a and set_b" + set_a.toString());
	
	set_b.add(1);
	set_b.add(2);
	System.out.println("Value of set_a is:" + set_a.toString());
	System.out.println("Value of set_b is:" + set_b.toString());
	
	//intersection
	set_a.intersect(set_b);
	
	//result of intersection of set_a and set_b
	System.out.println("Result of intersection of set_a and set_b" + set_a.toString());

	//clear
	set_a.clear();
	System.out.println("Value of set_a after clearing is:" + set_a.toString());
	
	//remove
	System.out.println("Value of set_b is:" + set_b.toString());

	set_b.remove(1);
	System.out.println("Value of set_b after removing is:" + set_b.toString());

	//difference
	set_a.add(5);
	set_a.add(6);
	System.out.println("Value of set_a is:" + set_a.toString());
	System.out.println("Value of set_b is:" + set_b.toString());
	set_a.diff(set_b);
	System.out.println("Result of difference of set_a and set_b is: " + set_a.toString());
    
	
	set_a.clear();
	set_b.clear();
	// checks if set_a is empty
	System.out.println("set_a.isEmpty() after clearing: "+ set_a.isEmpty());
	
	//checks IntegerSetException while removing from empty set
	try {
		set_a.remove(0);
	}
	catch (IntegerSetException e) {
		System.out.println(e.getMessage());

	}
	
	//checks IntegerSetException while finding greatest from empty set
	try {
		set_a.largest();
	}
	
	catch (IntegerSetException e) {
		System.out.println(e.getMessage());

	}
	
	//checks IntegerSetException while finding smallest from empty set
	 try {set_a.smallest();}
	 catch (IntegerSetException e) {
			System.out.println(e.getMessage());

		}
	 set_a.add(10);
	 set_a.add(4);
	 System.out.println("Value of set_a after adding 10 and 4 is:" + set_a.toString());

	 System.out.println("The length of set_a is :" + set_a.length());
	 
	 // removes the value from a set that which is not there
	 System.out.println("Value of set_a is:" + set_a.toString());
	 set_a.remove(0);
	 System.out.println("Value of set_a after removing 0 which is not there is:" + set_a.toString());
	 
	 //equals
	 set_b.clear();
	 set_b.add(10);
	 set_b.add(4);
	 System.out.println("Value of set_a is:" + set_a.toString());
	 System.out.println("Value of set_b is:" + set_b.toString());
	 set_a.equals(set_b);
	 System.out.println("Value of set_b after running set_b.equals(set_b) is:" + set_a.equals(set_b));
}}
