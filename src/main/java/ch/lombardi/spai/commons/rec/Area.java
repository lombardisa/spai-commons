package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AreaImpl.class)
public interface Area extends Serializable {

	/**
	 * Metodo per ricevere l'ID dell'area.
	 * 
	 * @return: l'ID dell'area.
	 */
	Integer getAreaId();

	/**
	 * Metodo per ricevere l'ID della societa.
	 * 
	 * @return: l'ID della societa.
	 */
	Integer getSocietaId();

	/**
	 * Metodo per ricevere la descrizione dell'area.
	 * 
	 * @return: la descrizione dell'area.
	 */
	String getDescArea();

	/**
	 * Metodo per ricevere il codice dell'area.
	 * 
	 * @return: il codice dell'area.
	 */
	String getCodice();
}
