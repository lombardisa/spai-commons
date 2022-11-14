package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: AnnuncioEsperienzaImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class AnnuncioEsperienzaImpl implements AnnuncioEsperienza {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 2676876379619731666L;

	// VARIABLES
	private Integer annuncioId;
	private Integer esperienzaId;
	private String desc;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioEsperienzaImpl() {
		super();
	}

	/**
	 * Costructor of the experience needed for an annuncio.
	 * 
	 * @param annuncioId:   the ID of the annuncio.
	 * @param esperienzaId: the ID of the esperienza.
	 * @param desc:         the DESCRIZIONE of the esperienza needed for this
	 *                      annuncio.
	 */
	public AnnuncioEsperienzaImpl(Integer annuncioId, Integer esperienzaId, String desc) {
		super();
		this.annuncioId = annuncioId;
		this.esperienzaId = esperienzaId;
		this.desc = desc;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_ESPERIENZA.
	 */
	public Integer getEsperienzaId() {
		return esperienzaId;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the ID_ANNUNCIO.
	 * 
	 * @param annuncioId: the ID of the annuncio.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the ID_ESPERIENZA.
	 * 
	 * @param esperienzaId: the ID of the esperienza.
	 */
	public void setEsperienzaId(Integer esperienzaId) {
		this.esperienzaId = esperienzaId;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param desc: the DESCRIZIONE of the esperienza needed for this annuncio.
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
		return Objects.hash(annuncioId, desc, esperienzaId);
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
		AnnuncioEsperienzaImpl other = (AnnuncioEsperienzaImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Objects.equals(esperienzaId, other.esperienzaId);
	}
}