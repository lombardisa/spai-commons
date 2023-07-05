package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: ErroriApi.java
 * 
 * @author Matteo Maddes
 * @version 05.07.2023
 */
@JsonDeserialize(as = ErroriApi.class)
public interface ErroriApi extends Serializable {

	/**
	 * Returns the error's code (number).
	 * 
	 * @return the error's code (number).
	 */
	Integer getErrorCode();

	/**
	 * Returns the error's message.
	 * 
	 * @return the error's message.
	 */
	String getErrorMessage();
}
