package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SessoImpl.class)
public interface Sesso extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Returns the ID_SESSO.
	 * 
	 * @return: the ID_SESSO.
	 */
	Integer getSessoId();

	/**
	 * Returns the ID_SOCIETA of ID_SESSO.
	 * 
	 * @return: the ID_SOCIETA of ID_SESSO.
	 */
	Integer getSocietaId();

	/**
	 * Returns the DESCRIZIONE of ID_SESSO.
	 * 
	 * @return: the DESCRIZIONE of ID_SESSO.
	 */
	String getDesc();

	/**
	 * Returns the ATTIVO of the ID_SESSO.
	 * 
	 * @return: the ATTIVO of the ID_SESSO.
	 */
	String getAttivo();
	
	/**
	 * Returns the CODICE of the ID_SESSO.
	 * 
	 * @return: the CODICE of the ID_SESSO.
	 */
	String getCodice();
}
