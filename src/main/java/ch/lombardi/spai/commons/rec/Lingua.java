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
	 * Returns the ID_CHIAVE.
	 * 
	 * @return: the ID_CHIAVE.
	 */
	String getChiaveId();

	/**
	 * Returns the TESTO of the ID_CHIAVE.
	 * 
	 * @return: the TESTO of the ID_CHIAVE.
	 */
	String getTesto();
}