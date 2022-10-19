package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SondaggioImpl.class)
public interface Sondaggio extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Returns the ID_SONDAGGIO.
	 * 
	 * @return: the ID_SONDAGGIO.
	 */
	Integer getSondaggioId();

	/**
	 * Returns the ID_SOCIETA of ID_SONDAGGIO.
	 * 
	 * @return: the ID_SOCIETA of ID_SONDAGGIO.
	 */
	Integer getSocietaId();

	/**
	 * Returns the DESCRIZIONE of ID_SONDAGGIO.
	 * 
	 * @return: the DESCRIZIONE of ID_SONDAGGIO.
	 */
	String getDesc();

	/**
	 * Returns the ATTIVO of the ID_SONDAGGIO.
	 * 
	 * @return: the ATTIVO of the ID_SONDAGGIO.
	 */
	String getAttivo();

	/**
	 * Returns the CODICE of the ID_SONDAGGIO.
	 * 
	 * @return: the CODICE of the ID_SONDAGGIO.
	 */
	String getCodice();
}
