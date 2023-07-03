package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: FaqRisposta.java
 * 
 * @author Matteo Maddes
 * @version 03.07.2023
 */
@JsonDeserialize(as = FaqRisposta.class)
public interface FaqRisposta extends Serializable {

	/**
	 * Returns the ID_FAQ.
	 * 
	 * @return the ID_FAQ.
	 */
	String getFaqId();

	/**
	 * Returns the RISPOSTA of the FAQ.
	 * 
	 * @return the RISPOSTA.
	 */
	String getRisposta();
}