package org.howard.edu.lsp.assignment7;
import java.util.List;


public interface AverageStrategy {
	public int computeGrade (List<Integer> grades) throws EmptyListException;
	public int computeDroppedGrade (List<Integer> grades) throws EmptyListException;
}