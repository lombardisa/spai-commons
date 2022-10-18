package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class BenefitImpl implements Benefit {

	private static final long serialVersionUID = 565083839508288574L;

	// VARIABILI
	private Integer annuncioId;
	private String desc;

	/**
	 * 
	 */
	public BenefitImpl() {
		super();
	}

	public BenefitImpl(Integer annuncioId, String desc) {
		super();
		this.annuncioId = annuncioId;
		this.desc = desc;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public String getDesc() {
		return desc;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, desc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenefitImpl other = (BenefitImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc);
	}
}
