package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = LinguaImpl.class)
public interface Lingua extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Returns the ID_LINGUA.
	 * 
	 * @return: the ID_LINGUA.
	 */
	Integer getLinguaId();

	/**
	 * Returns the DESCRIZIONE of the ID_LINGUA.
	 * 
	 * @return: the DESCRIZIONE of the ID_LINGUA.
	 */
	String getDesc();
}
