package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Sesso.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = SessoImpl.class)
public interface Sesso extends Serializable {

	/**
	 * Returns the ID_CHIAVE.
	 * 
	 * @return: the ID_CHIAVE.
	 */
	String getChiaveId();

	/**
	 * Returns the TESTO.
	 * 
	 * @return: the TESTO.
	 */
	String getTesto();
}