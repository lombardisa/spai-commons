package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = LinguaLivelloImpl.class)
public interface LinguaLivello extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Returns the ID_LINGUA_LIVELLO.
	 * 
	 * @return: the ID_LINGUA_LIVELLO.
	 */
	Integer getLinguaLivelloId();

	/**
	 * Returns the DESCRIZIONE of the ID_LINGUA_LIVELLO.
	 * 
	 * @return: the DESCRIZIONE of the ID_LINGUA_LIVELLO.
	 */
	String getDesc();
}
