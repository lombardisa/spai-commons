package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class SondaggioImpl implements Sondaggio {

	private static final long serialVersionUID = -2393711910011217184L;

	// VARIABILI
	private Integer sondaggioId;
	private Integer societaId;
	private String desc;
	private String attivo;
	private String codice;

	/**
	 * 
	 */
	public SondaggioImpl() {
		super();
	}

	/**
	 * 
	 * @param sondaggioId
	 * @param societaId
	 * @param desc
	 * @param attivo
	 * @param codice
	 */
	public SondaggioImpl(Integer sondaggioId, Integer societaId, String desc, String attivo, String codice) {
		super();
		this.sondaggioId = sondaggioId;
		this.societaId = societaId;
		this.desc = desc;
		this.attivo = attivo;
		this.codice = codice;
	}

	public Integer getSondaggioId() {
		return sondaggioId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getDesc() {
		return desc;
	}

	public String getAttivo() {
		return attivo;
	}

	public String getCodice() {
		return codice;
	}

	public void setSondaggioId(Integer sondaggioId) {
		this.sondaggioId = sondaggioId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attivo, codice, desc, societaId, sondaggioId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SondaggioImpl other = (SondaggioImpl) obj;
		return Objects.equals(attivo, other.attivo) && Objects.equals(codice, other.codice)
				&& Objects.equals(desc, other.desc) && Objects.equals(societaId, other.societaId)
				&& Objects.equals(sondaggioId, other.sondaggioId);
	}
}
