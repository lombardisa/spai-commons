package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AnnuncioEsperienzaImpl.class)
public interface AnnuncioEsperienza extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO..
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_ESPERIENZA.
	 * 
	 * @return: the ID_ESPERIENZA.
	 */
	Integer getEsperienzaId();

	/**
	 * Returns the DESCRIZIONE of the ID_ESPERIENZA.
	 * 
	 * @return: the DESCRIZIONE of the ID_ESPERIENZA.
	 */
	String getDesc();
}
