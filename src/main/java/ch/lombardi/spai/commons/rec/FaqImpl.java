package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: FaqImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class FaqImpl implements Faq {

	/**
	 * UID: technical internal identification number.
	 */
	private static final long serialVersionUID = -2664975307331891009L;

	// VARIABLES
	private Integer faqId;
	private String domanda;
	private String risposta;

	/**
	 * Default empty constructor (necessary for Jackson serialization).
	 */
	public FaqImpl() {
		super();
	}

	/**
	 * Costructor of the faq showed on the website.
	 * 
	 * @param faqId:    the ID_FAQ.
	 * @param domanda:  the DOMANDA.
	 * @param risposta: the RISPOSTA.
	 */
	public FaqImpl(Integer faqId, String domanda, String risposta) {
		super();
		this.faqId = faqId;
		this.domanda = domanda;
		this.risposta = risposta;
	}

	/**
	 * Gets the ID_FAQ.
	 */
	public Integer getFaqId() {
		return faqId;
	}

	/**
	 * Gets the DOMANDA.
	 */
	public String getDomanda() {
		return domanda;
	}

	/**
	 * Gets the RISPOSTA.
	 */
	public String getRisposta() {
		return risposta;
	}

	/**
	 * Sets the ID_FAQ.
	 * 
	 * @param faqId: the ID_FAQ.
	 */
	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}

	/**
	 * Sets the DOMANDA.
	 * 
	 * @param domanda: the DOMANDA.
	 */
	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	/**
	 * Sets the RISPOSTA.
	 * 
	 * @param risposta: the RISPOSTA.
	 */
	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(domanda, faqId, risposta);
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaqImpl other = (FaqImpl) obj;
		return Objects.equals(domanda, other.domanda) && Objects.equals(faqId, other.faqId)
				&& Objects.equals(risposta, other.risposta);
	}
}