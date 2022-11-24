package org.howard.edu.lsp.assignment7;
import java.util.List;

 /**
 * @author devpremoli
 *
 */

public interface AverageStrategy {
	/**
	 * @param grades
	 * @return
	 * @throws EmptyListException
	 */
	public int ComputeGrade (List<Integer> grades) throws EmptyListException;
	/**
	 * @param grades
	 * @return
	 * @throws EmptyListException
	 */
	public int ComputeDroppedGrade (List<Integer> grades) throws EmptyListException;
}