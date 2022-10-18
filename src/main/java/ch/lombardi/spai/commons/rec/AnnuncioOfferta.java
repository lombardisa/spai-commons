package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AnnuncioOffertaImpl.class)
public interface AnnuncioOfferta extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO..
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO..
	 */
	Integer getOffertaId();

	/**
	 * Returns the DESCRIZIONE of the ID_BENEFIT.
	 * 
	 * @return: the DESCRIZIONE of the ID_BENEFIT.
	 */
	String getDesc();

	/**
	 * Returns the DESCRIZIONE of the ID_BENEFIT.
	 * 
	 * @return: the DESCRIZIONE of the ID_BENEFIT.
	 */
	String getTitolo();
}
