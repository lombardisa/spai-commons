package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = FaqImpl.class)
public interface Faq extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * 
	 * @return
	 */
	Integer getFaqId();

	/**
	 * 
	 * @return
	 */
	String getDomanda();

	/**
	 * 
	 * @return
	 */
	String getRisposta();
}
