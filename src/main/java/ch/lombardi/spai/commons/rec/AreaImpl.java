package ch.lombardi.spai.commons.rec;

import java.util.Arrays;
import java.util.Objects;

public class AreaImpl implements Area {

	private static final long serialVersionUID = -504620104046972018L;

	// VARIABILI
	private Integer areaId;
	private Integer societaId;
	private String descArea;
	private String descAreaBreve;
	private String codice;
	private byte[] immagine;

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
	 * @param descArea
	 * @param descAreaBreve
	 * @param codice
	 * @param immagine
	 */
	public AreaImpl(Integer areaId, Integer societaId, String descArea, String descAreaBreve, String codice,
			byte[] immagine) {
		super();
		this.areaId = areaId;
		this.societaId = societaId;
		this.descArea = descArea;
		this.descAreaBreve = descAreaBreve;
		this.codice = codice;
		this.immagine = immagine;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getDescArea() {
		return descArea;
	}

	public String getDescAreaBreve() {
		return descAreaBreve;
	}

	public String getCodice() {
		return codice;
	}

	public byte[] getImmagine() {
		return immagine;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setDescArea(String descArea) {
		this.descArea = descArea;
	}

	public void setDescAreaBreve(String descAreaBreve) {
		this.descAreaBreve = descAreaBreve;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(immagine);
		result = prime * result + Objects.hash(areaId, codice, descArea, descAreaBreve, societaId);
		return result;
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
				&& Objects.equals(descArea, other.descArea) && Objects.equals(descAreaBreve, other.descAreaBreve)
				&& Arrays.equals(immagine, other.immagine) && Objects.equals(societaId, other.societaId);
	}
}
