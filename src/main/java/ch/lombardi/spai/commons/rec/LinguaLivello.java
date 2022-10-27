package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = LinguaLivelloImpl.class)
public interface LinguaLivello extends Serializable {
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
