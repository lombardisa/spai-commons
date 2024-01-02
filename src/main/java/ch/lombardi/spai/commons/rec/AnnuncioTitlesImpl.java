package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class AnnuncioTitlesImpl implements AnnuncioTitles {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -4600029025301335168L;
	
	// VARIABLES
	private Integer annuncioId;
	private String titolo;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioTitlesImpl() {
		super();
	}

	public AnnuncioTitlesImpl(Integer annuncioId, String titolo) {
		super();
		this.annuncioId = annuncioId;
		this.titolo = titolo;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
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
	 * Sets the TITOLO.
	 * 
	 * @param titolo: the TITOLO.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnnuncioTitlesImpl other = (AnnuncioTitlesImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(titolo, other.titolo);
	}
}