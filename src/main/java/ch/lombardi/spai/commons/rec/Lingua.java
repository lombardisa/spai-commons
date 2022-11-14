package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Lingua.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = LinguaImpl.class)
public interface Lingua extends Serializable {

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