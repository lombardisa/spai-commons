package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = BenefitImpl.class)
public interface Benefit extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO..
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the DESCRIZIONE of the ID_BENEFIT.
	 * 
	 * @return: the DESCRIZIONE of the ID_BENEFIT.
	 */
	String getDesc();
}
