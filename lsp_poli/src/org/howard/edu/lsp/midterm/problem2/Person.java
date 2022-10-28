package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name;
	private int age;
	private String socialSecurityNumber;
	
	// Constructor
	Person(String name, String socialSecurityNumber, int age) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	};
	
	// toString
	public String toString() {
		return "name: " + this.name + "\n" + "age: " + this.age + " \n" + "SSN: " + this.socialSecurityNumber +"\n";
	};
	
	// equals
	public String equals(Person p) {
		if (this.socialSecurityNumber == p.socialSecurityNumber) {
			return "These are the same!";
		}
		return "Not the same!";
	}
}
