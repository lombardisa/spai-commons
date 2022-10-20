package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SituazioneLavorativaImpl.class)
public interface SituazioneLavorativa extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Returns the ID_CHIAVE.
	 * 
	 * @return: the ID_CHIAVE.
	 */
	String getChiaveId();

	/**
	 * Returns the TESTO of ID_CHIAVE.
	 * 
	 * @return: the TESTO of ID_CHIAVE.
	 */
	String getTesto();
}
