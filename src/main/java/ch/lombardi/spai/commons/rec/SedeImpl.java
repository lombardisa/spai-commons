package ch.lombardi.spai.commons.rec;

import java.time.LocalDate;
import java.util.Objects;

public class SedeImpl implements Sede {

	private static final long serialVersionUID = 4286757739061690872L;

	// VARIABILI
	private Integer sedeId;
	private Integer societaId;
	private String descSede;
	private String nomeIndirizzo;
	private String localita;
	private LocalDate dataChiusura;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public SedeImpl() {
		super();
	}

	/**
	 * 
	 * @param sedeId
	 * @param societaId
	 * @param descSede
	 * @param nomeIndirizzo
	 * @param localita
	 * @param dataChiusura
	 */
	public SedeImpl(Integer sedeId, Integer societaId, String descSede, String nomeIndirizzo, String localita,
			LocalDate dataChiusura) {
		super();
		this.sedeId = sedeId;
		this.societaId = societaId;
		this.descSede = descSede;
		this.nomeIndirizzo = nomeIndirizzo;
		this.localita = localita;
		this.dataChiusura = dataChiusura;
	}

	public Integer getSedeId() {
		return sedeId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getDescSede() {
		return descSede;
	}

	public String getNomeIndirizzo() {
		return nomeIndirizzo;
	}

	public String getLocalita() {
		return localita;
	}

	public LocalDate getDataChiusura() {
		return dataChiusura;
	}

	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}

	public void setNomeIndirizzo(String nomeIndirizzo) {
		this.nomeIndirizzo = nomeIndirizzo;
	}

	public void setLocalita(String localita) {
		this.localita = localita;
	}

	public void setDataChiusura(LocalDate dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataChiusura, descSede, localita, nomeIndirizzo, sedeId, societaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SedeImpl other = (SedeImpl) obj;
		return Objects.equals(dataChiusura, other.dataChiusura) && Objects.equals(descSede, other.descSede)
				&& Objects.equals(localita, other.localita) && Objects.equals(nomeIndirizzo, other.nomeIndirizzo)
				&& Objects.equals(sedeId, other.sedeId) && Objects.equals(societaId, other.societaId);
	}
}
