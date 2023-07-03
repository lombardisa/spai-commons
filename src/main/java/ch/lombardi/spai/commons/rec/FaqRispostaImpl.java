package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: FaqImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class FaqRispostaImpl implements FaqRisposta {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -2664975307331891009L;

	// VARIABLES
	private String faqDomandaId;
	private String risposta;

	/**
	 * Default empty constructor.
	 */
	public FaqRispostaImpl() {
		super();
	}

	/**
	 * Costructor of the faq showed on the website.
	 * 
	 * @param faqId:    the ID_FAQ.
	 * @param domanda:  the DOMANDA.
	 * @param risposta: the RISPOSTA.
	 */
	public FaqRispostaImpl(String faqDomandaId, String risposta) {
		super();
		this.faqDomandaId = faqDomandaId;
		this.risposta = risposta;
	}

	/**
	 * Gets the ID_FAQ.
	 */
	public String getFaqId() {
		return faqDomandaId;
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
	public void setFaqId(String faqDomandaId) {
		this.faqDomandaId = faqDomandaId;
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
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(faqDomandaId, risposta);
	}

	/**
	 * Compares the IDs to see if the values are exactly the same Object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaqRispostaImpl other = (FaqRispostaImpl) obj;
		return Objects.equals(faqDomandaId, other.faqDomandaId) && Objects.equals(risposta, other.risposta);
	}
}