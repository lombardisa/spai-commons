package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: BenefitCategoriaImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class BenefitCategoriaImpl implements BenefitCategoria {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 5341574465827396540L;

	// VARIABLES
	private Integer benefitCategoriaId;
	private String titolo;
	private String desc;

	/**
	 * Default empty constructor.
	 */
	public BenefitCategoriaImpl() {
		super();
	}

	/**
	 * Costructor of the benefits showed on the website.
	 * 
	 * @param benefitCategoriaId: the ID_BENEFIT_CATEGORIA.
	 * @param titolo:             the TITOLO.
	 * @param desc:               the DESCRIZIONE.
	 */
	public BenefitCategoriaImpl(Integer benefitCategoriaId, String titolo, String desc) {
		super();
		this.benefitCategoriaId = benefitCategoriaId;
		this.titolo = titolo;
		this.desc = desc;
	}

	/**
	 * Gets the ID_BENEFIT_CATEGORIA.
	 */
	public Integer getBenefitCategoriaId() {
		return benefitCategoriaId;
	}

	/**
	 * Gets the TITOLO.
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the ID_BENEFIT_CATEGORIA.
	 * 
	 * @param benefitCategoriaId: the ID_BENEFIT_CATEGORIA.
	 */
	public void setBenefitCategoriaId(Integer benefitCategoriaId) {
		this.benefitCategoriaId = benefitCategoriaId;
	}

	/**
	 * Sets the TITOLO.
	 * 
	 * @param titolo: the TITOLO.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param desc: the DESCRIZIONE.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(benefitCategoriaId, desc, titolo);
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
		BenefitCategoriaImpl other = (BenefitCategoriaImpl) obj;
		return Objects.equals(benefitCategoriaId, other.benefitCategoriaId) && Objects.equals(desc, other.desc)
				&& Objects.equals(titolo, other.titolo);
	}
}