package org.howard.edu.lsp.assignment4.implementation;
/*
 * @author Prem Oli
 * devpremoli
 */

public class IntegerSetException extends Exception {
	//@throws exception when set is empty
	private static final long serialVersionUID = 1L;
	//exception when set is empty
	public IntegerSetException(String e) {
		super(e);
	}
	}