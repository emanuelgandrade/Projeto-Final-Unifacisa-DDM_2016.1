package com.emanuelgandrade.perguntasaoprofessor.service.exception;

public class UserAlreadyExistsException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(final String message) {
        super(message);
    }
}
