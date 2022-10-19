package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class AnnuncioEsperienzaImpl implements AnnuncioEsperienza {

	private static final long serialVersionUID = 2676876379619731666L;

	// VARIABILI
	private Integer annuncioId;
	private Integer esperienzaId;
	private String desc;

	/**
	 * 
	 */
	public AnnuncioEsperienzaImpl() {
		super();
	}

	/**
	 * 
	 * @param annuncioId
	 * @param esperienzaId
	 * @param desc
	 */
	public AnnuncioEsperienzaImpl(Integer annuncioId, Integer esperienzaId, String desc) {
		super();
		this.annuncioId = annuncioId;
		this.esperienzaId = esperienzaId;
		this.desc = desc;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public Integer getEsperienzaId() {
		return esperienzaId;
	}

	public String getDesc() {
		return desc;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setEsperienzaId(Integer esperienzaId) {
		this.esperienzaId = esperienzaId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, desc, esperienzaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnnuncioEsperienzaImpl other = (AnnuncioEsperienzaImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Objects.equals(esperienzaId, other.esperienzaId);
	}
}
