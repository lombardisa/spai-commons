package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Sondaggio.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = SondaggioImpl.class)
public interface Sondaggio extends Serializable {

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