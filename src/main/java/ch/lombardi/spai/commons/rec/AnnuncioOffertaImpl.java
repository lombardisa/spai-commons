package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: AnnuncioOffertaImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class AnnuncioOffertaImpl implements AnnuncioOfferta {

	/**
	 * UID: technical internal identification number(serialization).
	 */
	private static final long serialVersionUID = -1633804424445767997L;

	// VARIABLES
	private Integer annuncioId;
	private Integer offertaId;
	private String desc;
	private String titolo;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioOffertaImpl() {
		super();
	}

	/**
	 * Costructor of the offerta included in an annuncio.
	 * 
	 * @param annuncioId: the ID_ANNUNCIO.
	 * @param offertaId:  the ID_OFFERTA.
	 * @param desc:       the DESCRIZIONE.
	 * @param titolo:     the TITOLO.
	 */
	public AnnuncioOffertaImpl(Integer annuncioId, Integer offertaId, String desc, String titolo) {
		super();
		this.annuncioId = annuncioId;
		this.offertaId = offertaId;
		this.desc = desc;
		this.titolo = titolo;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_OFFERTA.
	 */
	public Integer getOffertaId() {
		return offertaId;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Gets the TITOLO.
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Sets the ID_ANNUNCIO.
	 * 
	 * @param annuncioId: the ID_ANNUNCIO.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the ID_OFFERTA.
	 * 
	 * @param offertaId: the ID_OFFERTA.
	 */
	public void setOffertaId(Integer offertaId) {
		this.offertaId = offertaId;
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
	 * Sets the TITOLO.
	 * 
	 * @param titolo: the TITOLO.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, desc, offertaId, titolo);
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
		AnnuncioOffertaImpl other = (AnnuncioOffertaImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Objects.equals(offertaId, other.offertaId) && Objects.equals(titolo, other.titolo);
	}
}