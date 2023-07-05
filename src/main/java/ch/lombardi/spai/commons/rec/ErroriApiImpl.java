package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: ErroriApiImpl.java
 * 
 * @author Matteo Maddes
 * @version 05.07.2023
 */
public class ErroriApiImpl implements ErroriApi {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 1383570345104264282L;

	// VARIABLES
	private Integer errorCode;
	private String errorMessage;

	/**
	 * Default empty constructor.
	 */
	public ErroriApiImpl() {
		super();
	}

	/**
	 * Constructor of the API's error code & message.
	 * 
	 * @param errorCode:    the API's error code (number).
	 * @param errorMessage: the API's error message.
	 */
	public ErroriApiImpl(Integer errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * Gets the error code (number).
	 */
	public Integer getErrorCode() {
		return errorCode;
	}

	/**
	 * Sets the error code (number).
	 * 
	 * @param errorCode: the error code (number).
	 */
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Gets the error message.
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the error message.
	 * 
	 * @param errorMessage: the error message.
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(errorCode, errorMessage);
	}

	/**
	 * Compares the IDs to see if the values are exactly the same Object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErroriApiImpl other = (ErroriApiImpl) obj;
		return Objects.equals(errorCode, other.errorCode) && Objects.equals(errorMessage, other.errorMessage);
	}
}