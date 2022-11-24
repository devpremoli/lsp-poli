package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author devpremoli
 *
 */
class GradeTest {

	@Test
	@DisplayName("Test computeGrade")
	void testComputeGrade() {
		List <Integer> grades = new ArrayList<Integer>();
		grades.add(5);
		grades.add(10);
		grades.add(15);
		grades.add(20);
		grades.add(25);
		Grade  average = new Grade();
		try {
			int result = average.ComputeGrade(grades);
			assertNotEquals(result,20);
			assertEquals(result,15);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		
		grades.clear();
		grades.add(7);
		grades.add(23);
		grades.add(6);
		Grade  computeGrade = new Grade();
		try {
			int result = computeGrade.ComputeGrade(grades);
			assertNotEquals(result,24);
			assertEquals(result,12);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test ComputeDroppedGrade")
	void testComputeDroppedGrade() {
		List <Integer> grades = new ArrayList<Integer>();
		grades.add(20);
		grades.add(40);
		grades.add(30);
		grades.add(4);
		grades.add(2);
		Grade computeGrade = new Grade();
		try {
			int result = computeGrade.ComputeDroppedGrade(grades);
			assertEquals(result,30);
			assertNotEquals(result,32);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		
		grades.clear();
		grades.add(5);
		grades.add(45);
		grades.add(90);
		grades.add(60);
		grades.add(10);
		Grade computeGrade1 = new Grade();
		try {
			int result = computeGrade1.ComputeDroppedGrade(grades);
			assertEquals(result,65);
			assertNotEquals(result,40);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test EmptyListException")
	void testEmptyListException() {
		Grade  computeGrade = new Grade();
		List <Integer> grades = new ArrayList<Integer>();
		Exception exception = assertThrows(EmptyListException.class, ()->{computeGrade.ComputeGrade(grades);});
		assertEquals("List cannot be Empty", exception.getMessage());
	}
}
