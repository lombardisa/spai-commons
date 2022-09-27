package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class AreaImpl implements Area {

	private static final long serialVersionUID = -504620104046972018L;

	// VARIABILI
	private Integer areaId;
	private Integer societaId;
	private String desc_area;
	private String codice;

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
	 * @param desc_area
	 * @param codice
	 */
	public AreaImpl(Integer areaId, Integer societaId, String desc_area, String codice) {
		super();
		this.areaId = areaId;
		this.societaId = societaId;
		this.desc_area = desc_area;
		this.codice = codice;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getDescArea() {
		return desc_area;
	}

	public String getCodice() {
		return codice;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setDescArea(String descrizione) {
		this.desc_area = descrizione;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaId, codice, desc_area, societaId);
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
		return Objects.equals(areaId, other.areaId) && Objects.equals(codice, other.codice)
				&& Objects.equals(desc_area, other.desc_area) && Objects.equals(societaId, other.societaId);
	}

}
