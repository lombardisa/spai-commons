package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class FaqImpl implements Faq {

	private static final long serialVersionUID = -2664975307331891009L;

	// VARIABILI
	private Integer faqId;
	private String domanda;
	private String risposta;

	/**
	 * 
	 */
	public FaqImpl() {
		super();
	}

	/**
	 * 
	 * @param faqId
	 * @param domanda
	 * @param risposta
	 */
	public FaqImpl(Integer faqId, String domanda, String risposta) {
		super();
		this.faqId = faqId;
		this.domanda = domanda;
		this.risposta = risposta;
	}

	/**
	 * 
	 */
	public Integer getFaqId() {
		return faqId;
	}

	public String getDomanda() {
		return domanda;
	}

	public String getRisposta() {
		return risposta;
	}

	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(domanda, faqId, risposta);
	}

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
