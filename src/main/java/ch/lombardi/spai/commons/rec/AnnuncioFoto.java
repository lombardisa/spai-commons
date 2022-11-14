package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: AnnuncioFoto.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = AnnuncioFotoImpl.class)
public interface AnnuncioFoto extends Serializable {

	/**
	 * Returns the ID_FOTO.
	 * 
	 * @return: the ID_FOTO.
	 */
	Integer getFotoId();

	/**
	 * Returns the ID_SOCIETA.
	 * 
	 * @return: the ID_SOCIETA.
	 */
	Integer getSocietaId();

	/**
	 * Returns the ID_ANNUNCIO.
	 * 
	 * @return: the ID_ANNUNCIO.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ATTIVO of the ID_FOTO.
	 * 
	 * @return: the ATTIVO of the ID_FOTO.
	 */
	String getAttivo();

	/**
	 * Returns the FOTO of the ID_FOTO.
	 * 
	 * @return: the FOTO of the ID_FOTO.
	 */
	byte[] getFoto();

	/**
	 * Returns the CODICE of the ID_FOTO.
	 * 
	 * @return: the CODICE of the ID_FOTO.
	 */
	String getCodice();

	/**
	 * Returns the DESCRIZIONE of the ID_FOTO.
	 * 
	 * @return: the DESCRIZIONE of the ID_FOTO.
	 */
	String getDesc();
}