package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
	private static final long serialVersionUID = 1L;
	public EmptyListException()  {  
        super("List cannot be Empty");
    }
}