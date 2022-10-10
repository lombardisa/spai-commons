package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AreaImpl.class)
public interface Area extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * Returns the ID_AREA.
	 * 
	 * @return: the ID_AREA.
	 */
	Integer getAreaId();

	/**
	 * Returns the ID_SOCIETA.
	 * 
	 * @return: the ID_SOCIETA.
	 */
	Integer getSocietaId();

	/**
	 * Returns the DESCRIZIONE of the ID_AREA.
	 * 
	 * @return: the DESCRIZIONE of the ID_AREA.
	 */
	String getDescArea();

	/**
	 * Returns the CODICE of the ID_AREA.
	 * 
	 * @return: the CODICE of the ID_AREA.
	 */
	String getCodice();
}