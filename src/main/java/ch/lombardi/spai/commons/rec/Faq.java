package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: Faq.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = FaqImpl.class)
public interface Faq extends Serializable {

	/**
	 * Returns the ID_FAQ.
	 * 
	 * @return the ID_FAQ.
	 */
	Integer getFaqId();

	/**
	 * Returns the DOMANDA of the FAQ.
	 * 
	 * @return the DOMANDA.
	 */
	String getDomanda();

	/**
	 * Returns the RISPOSTA of the FAQ.
	 * 
	 * @return the RISPOSTA.
	 */
	String getRisposta();
}