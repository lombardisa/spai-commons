package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SessoImpl.class)
public interface Sesso extends Serializable {
	// METHODS-------------------------------------------
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
