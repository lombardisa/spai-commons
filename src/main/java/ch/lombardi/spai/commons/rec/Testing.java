package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = TestingImpl.class)
public interface Testing extends Serializable {
	// METHODS-------------------------------------------
	/**
	 * Metodo per ricevere l'ID del candidato.
	 * 
	 * @return l'ID del candidato.
	 */
	Integer getTestingId();

	/**
	 * Metodo per ricevere l'ID del sesso del candidato.
	 * 
	 * @return l'ID del sesso del candidato.
	 */
	String getTitle();

	/**
	 * Metodo per ricevere l'ID del sesso del candidato.
	 * 
	 * @return l'ID del sesso del candidato.
	 */
	String getBody();
}
