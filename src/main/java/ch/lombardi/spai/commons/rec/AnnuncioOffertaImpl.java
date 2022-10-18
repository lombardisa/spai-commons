package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class AnnuncioOffertaImpl implements AnnuncioOfferta {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1633804424445767997L;

	// VARIABILI
	private Integer annuncioId;
	private Integer offertaId;
	private String desc;
	private String titolo;

	/**
	 * 
	 */
	public AnnuncioOffertaImpl() {
		super();
	}

	/**
	 * 
	 * @param annuncioId
	 * @param offertaId
	 * @param desc
	 * @param titolo
	 */
	public AnnuncioOffertaImpl(Integer annuncioId, Integer offertaId, String desc, String titolo) {
		super();
		this.annuncioId = annuncioId;
		this.offertaId = offertaId;
		this.desc = desc;
		this.titolo = titolo;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public Integer getOffertaId() {
		return offertaId;
	}

	public String getDesc() {
		return desc;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setOffertaId(Integer offertaId) {
		this.offertaId = offertaId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, desc, offertaId, titolo);
	}

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
