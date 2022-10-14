package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SedeImpl.class)
public interface Sede extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * 
	 * @return
	 */
	Integer getSedeId();

	/**
	 * 
	 * @return
	 */
	Integer getSocietaId();

	/**
	 * 
	 * @return
	 */
	String getDescSede();

	/**
	 * 
	 * @return
	 */
	String getNomeIndirizzo();

	/**
	 * 
	 * @return
	 */
	String getIndirizzo();

	/**
	 * 
	 * @return
	 */
	String getLocalita();

	/**
	 * 
	 * @return
	 */
	LocalDate getDataChiusura();

	/**
	 * 
	 * @return
	 */
	String getNap();

	/**
	 * 
	 * @return
	 */
	String getNoTelefono();

	/**
	 * 
	 * @return
	 */
	String geteMail();

	/**
	 * 
	 * @return
	 */
	String getTimeZone();

	/**
	 * 
	 * @return
	 */
	String getDescEstesa();

	/**
	 * 
	 * @return
	 */
	String geteMailHr();

	/**
	 * 
	 * @return
	 */
	Integer getNazioneId();

	/**
	 * 
	 * @return
	 */
	String getNazione();
}