package org.howard.edu.lsp.assignment7;
import java.util.Collections;
import java.util.List;


public class Grade implements AverageStrategy{
	
	@Override
	public int computeGrade(List<Integer> grades) throws EmptyListException {
		
        if(grades == null || grades.size() <= 0) {
            throw new EmptyListException();
        }
		int total = 0;
		int length = grades.size();
		for (int i: grades) {
			total += i;
		}
		return total/length;
	}

	
	@Override
	public int computeDroppedGrade(List<Integer> grades) throws EmptyListException {
		
        if(grades == null || grades.size() < 2) {
            throw new EmptyListException();
        }
        
		int total = 0;
		int length = 0;
		int average = 0;
		Collections.sort(grades);
		length = grades.size();
		for (int i : grades) {
			total = total + i;
		}
		average = (total - grades.get(0) - grades.get(1))/(length-2);
		return average;
	}
}