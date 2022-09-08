package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = TestingImpl.class)
public interface Testing extends Serializable {

	/**
	 * Metodo per ricevere l'ID dell'annuncio.
	 * 
	 * @return: l'ID dell'annuncio.
	 */
	Integer getAnnuncioId();

	/**
	 * Metodo per ricevere l'ID del referente principale.
	 * 
	 * @return: l'ID del referente principale.
	 */
	Integer getRefPrincId();

	/**
	 * 
	 * @return
	 */
	String getNomeRefPrinc();

	/**
	 * 
	 * @return
	 */
	String getConomeRefPrinc();

	/**
	 * 
	 * @return
	 */
	byte[] getFotoRefPrinc();

	// -------------------------------------------------------------------------------------------------

}
