package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class BenefitCategoriaImpl implements BenefitCategoria {

	private static final long serialVersionUID = 5341574465827396540L;

	// VARIABILI
	private Integer benefitCategoriaId;
	private String titolo;
	private String desc;

	/**
	 * 
	 */
	public BenefitCategoriaImpl() {
		super();
	}

	public BenefitCategoriaImpl(Integer benefitCategoriaId, String titolo, String desc) {
		super();
		this.benefitCategoriaId = benefitCategoriaId;
		this.titolo = titolo;
		this.desc = desc;
	}

	public Integer getBenefitCategoriaId() {
		return benefitCategoriaId;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getDesc() {
		return desc;
	}

	public void setBenefitCategoriaId(Integer benefitCategoriaId) {
		this.benefitCategoriaId = benefitCategoriaId;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(benefitCategoriaId, desc, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenefitCategoriaImpl other = (BenefitCategoriaImpl) obj;
		return Objects.equals(benefitCategoriaId, other.benefitCategoriaId) && Objects.equals(desc, other.desc)
				&& Objects.equals(titolo, other.titolo);
	}
}
