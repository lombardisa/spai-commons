package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Area.java
 * 
 * @author Matteo Maddes
 * @version 31.07.2024
 */
@JsonDeserialize(as = AreaImpl.class)
public interface Area extends Serializable {

	/**
	 * Returns the ID_CHIAVE.
	 * 
	 * @return: the ID_CHIAVE.
	 */
	String getChiaveId();

	/**
	 * Returns the TESTO of the ID_CHIAVE.
	 * 
	 * @return: the TESTO of the ID_CHIAVE.
	 */
	String getTesto();
}