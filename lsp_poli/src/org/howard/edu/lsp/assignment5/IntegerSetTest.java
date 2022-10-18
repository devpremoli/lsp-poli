package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;



public class IntegerSetTest {
	@Test
	@DisplayName("Test case for clear")
	public void TestClear() {
		IntegerSet setA = new IntegerSet();
		int[] numbers = {10, 30, 20, 0, 10};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
	setA.clear();
	
	assertEquals("[]", setA.toString());
	assertEquals(true, setA.isEmpty());
	}


	@Test
	@DisplayName("Test Length")
		public void testLength() {
		
		IntegerSet setA= new IntegerSet();
		int[] numbers = {12, 22, 13, 54, 85};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {16, 62, 323, 524, 4565};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		assertEquals(5,setA.length());
		assertEquals(5,setB.length());
		assertEquals(setA.length(),setB.length());
	}


	@Test
	@DisplayName("Test case for Equals")
	public void testEquals() {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {10, 2, 23, 34, 78};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {10, 2, 23, 34, 78};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	
	assertEquals(setA.toString(),setB.toString());
	setA.clear();
	setB.clear();
	assertEquals(setA.toString(), setB.toString());
	}

	@Test
	@DisplayName("Test case for Contains")
	public void TestContains() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals(false,setA.contains(10));
		assertEquals(true,setA.contains(3));
		assertNotEquals(true,setA.contains(54));
	}
	

	@Test
	@DisplayName("Test case for Add")
	public void TestAdd() {
		IntegerSet setA = new IntegerSet();
		int[] numbers = {5, 3, 2, 0, 1};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		assertEquals("[5, 3, 2, 0, 1]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[0]", setA.toString());
		
		IntegerSet setB = new IntegerSet();
		int[] numbers_1 = {0, 0, 1, 9, 9, 8};
		for (int i = 0; i < numbers_1.length; i++) {
			setB.add(numbers_1[i]);
		};
		
		assertEquals("[0, 1, 9, 8]", setB.toString());
		assertNotEquals("[0, 0, 1, 9, 9, 8]", setB.toString());
	}
	
	@Test
	@DisplayName("Test case for Remove")
	public void TestRemove() throws org.howard.edu.lsp.assignment4.implementation.IntegerSetException, IntegerSetException {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {10, 20, 30, 40, 50};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		setA.remove(10);
		setA.remove(50);
		assertEquals("[20, 30, 40]",setA.toString());
		assertNotEquals("[]", setA.toString());
		assertNotEquals("[30, 20, 40]", setA.toString());

		IntegerSet setB = new IntegerSet();
		int[] numbers_1 = {90, 60, 80, 12, 34};
		for (int i = 0; i < numbers_1.length; i ++) {
			setB.add(numbers_1[i]);
		}
		
		setB.remove(90);
		setB.remove(50);
		assertEquals(false, setB.contains(90));
		assertEquals(true, setB.contains(60));
		assertNotEquals("[]", setB.toString());
	}


	@Test
	@DisplayName("Test case for Union")
	public void testUnion() {
		IntegerSet setA= new IntegerSet();
		int[] numbers = {10 ,20 ,30 ,40 ,50};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {50, 60, 70, 80, 90};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		
		setA.union(setB);
		assertEquals("[10, 20, 30, 40, 50, 60, 70, 80, 90]",setA.toString());
		assertNotEquals("[50]",setA.toString());
		
}
	@Test
	@DisplayName("Test case for Intersect")
	public void testIntersect() {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {1, 22, 3, 94, 35};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {1, 35, 37, 78, 89, 3};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	setA.intersect(setB);
	assertEquals("[1, 3, 35]",setA.toString());
	assertNotEquals("[11, 22, 33, 44, 55, 66, 77, 88, 99, 00]",setA.toString());
}
	
	@Test
	@DisplayName("Test case for Difference")
	public void testDifference() {
	 
		IntegerSet setA= new IntegerSet();
		int[] numbers = {10,20,30,40,50};
		for (int i = 0; i < numbers.length; i ++) {
			setA.add(numbers[i]);
		}
		IntegerSet setB= new IntegerSet();
		int[] numbers1 = {10, 30, 50 , 70, 9};
		for (int i = 0; i < numbers1.length; i ++) {
			setB.add(numbers1[i]);
		}
		setA.diff(setB);
		assertEquals("[20, 40]",setA.toString());
		assertNotEquals("[10, 30, 50]", setA.toString());
		}
	
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void TestEmpty() {
		IntegerSet setA= new IntegerSet();
		assertEquals(true, setA.isEmpty());
		assertNotEquals(false,setA.isEmpty());
	}
	
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	assertEquals("[]",setA.toString());
	assertNotEquals("[12345]",setA.toString());
	}

	
	@Test
	@DisplayName("test case for testRemove throws exception")
	public void testRemove_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		IntegerSetException exception = assertThrows(IntegerSetException.class, ()->{
			setA.remove(50);
		});
		String expectedMessage = "Can't remove from an empty set";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.equals(expectedMessage));
	}

	
	@Test
	@DisplayName("Test case for Largest")
	public void testLargest() throws IntegerSetException {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {12, 15, 18, 98, 89};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {11, 22, 33, 43, 55,70, 9999};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(98,setA.largest());
	assertEquals(9999,setB.largest());
	}

	@Test
	@DisplayName("Test case for Largest throws exception")
	public void testLargest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.largest();
		});
		String expectedMessage = "An empty set can't have largest element!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
	}


	@Test
	@DisplayName("Test case for Smallest")
	public void testSmallest() throws IntegerSetException {
	IntegerSet setA= new IntegerSet();
	int[] numbers = {18, 22, 33, 54, 35, 50, 1000};
	for (int i = 0; i < numbers.length; i ++) {
		setA.add(numbers[i]);
	}
	IntegerSet setB= new IntegerSet();
	int[] numbers1 = {98, 32, 23, 44, 500,1000};
	for (int i = 0; i < numbers1.length; i ++) {
		setB.add(numbers1[i]);
	}
	assertEquals(18,setA.smallest());
	assertEquals(23,setB.smallest());
	}


	@Test
	@DisplayName("Test case for smallest throws exception")
	public void testSmallest_THROWS_EXCEPTION() {
		IntegerSet setA = new IntegerSet();
		Exception exception = assertThrows(IntegerSetException.class, ()->{
			setA.smallest();
		});
		String expectedMessage = "An empty set can't have smallest element!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.equals(expectedMessage));
	}
}