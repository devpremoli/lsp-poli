package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	public static void main(String args[]){
		
		// creating a Person object, p1
		Person p1 = new Person("Prem", "112233", 23);
		// toString method
		System.out.println(p1.toString());
		
		
		
		// creating a Person object, p2
		Person p2 = new Person("Anonomous", "112233", 50);
		// toString method
		System.out.println(p2.toString());
		
		

		
		// creating a Person object, p2
		Person a1 = new Person("Nick", "102030", 40);
		System.out.println(a1.toString());

		Person b1 = new Person("Peter", "254590", 80);
		System.out.println(b1.toString());
		
		
		// equals method - case when equal
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		
		// equal methods - case when not equal
		System.out.println(a1.equals(b1));
		System.out.println(b1.equals(a1));
	}
}
