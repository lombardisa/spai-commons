package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: AnnuncioOfferta.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = AnnuncioOffertaImpl.class)
public interface AnnuncioOfferta extends Serializable {

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_OFFERTA.
	 * 
	 * @return: the ID_OFFERTA.
	 */
	Integer getOffertaId();

	/**
	 * Returns the DESCRIZIONE of the ID_OFFERTA.
	 * 
	 * @return: the DESCRIZIONE of the ID_OFFERTA.
	 */
	String getDesc();

	/**
	 * Returns the TITOLO of the ID_OFFERTA.
	 * 
	 * @return: the TITOLO of the ID_OFFERTA.
	 */
	String getTitolo();
}