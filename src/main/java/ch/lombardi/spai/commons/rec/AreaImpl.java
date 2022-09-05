package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class AreaImpl implements Area {

	private static final long serialVersionUID = -504620104046972018L;

	// VARIABILI
	private Integer areaId;
	private Integer societaId;
	private String descrizione;
	private String codice;
	private String attivo;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public AreaImpl() {
		super();
	}

	/**
	 * 
	 * @param areaId
	 * @param societaId
	 * @param descrizione
	 * @param codice
	 * @param attivo
	 */
	public AreaImpl(Integer areaId, Integer societaId, String descrizione, String codice, String attivo) {
		super();
		this.areaId = areaId;
		this.societaId = societaId;
		this.descrizione = descrizione;
		this.codice = codice;
		this.attivo = attivo;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public String getAttivo() {
		return attivo;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaId, attivo, codice, descrizione, societaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AreaImpl other = (AreaImpl) obj;
		return Objects.equals(areaId, other.areaId) && Objects.equals(attivo, other.attivo)
				&& Objects.equals(codice, other.codice) && Objects.equals(descrizione, other.descrizione)
				&& Objects.equals(societaId, other.societaId);
	}

}
