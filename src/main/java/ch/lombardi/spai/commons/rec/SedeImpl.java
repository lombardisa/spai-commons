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
	private String indirizzo;
	private String localita;
	private LocalDate dataChiusura;
	private String nap;
	private String noTelefono;
	private String eMail;
	private String timeZone;
	private String descEstesa;
	private String eMailHr;
	private Integer nazioneId;
	private String nazione;

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
	 * @param indirizzo
	 * @param localita
	 * @param dataChiusura
	 * @param nap
	 * @param noTelefono
	 * @param eMail
	 * @param timeZone
	 * @param descEstesa
	 * @param eMailHr
	 * @param nazioneId
	 * @param nazione
	 */
	public SedeImpl(Integer sedeId, Integer societaId, String descSede, String nomeIndirizzo, String indirizzo,
			String localita, LocalDate dataChiusura, String nap, String noTelefono, String eMail, String timeZone,
			String descEstesa, String eMailHr, Integer nazioneId, String nazione) {
		super();
		this.sedeId = sedeId;
		this.societaId = societaId;
		this.descSede = descSede;
		this.nomeIndirizzo = nomeIndirizzo;
		this.indirizzo = indirizzo;
		this.localita = localita;
		this.dataChiusura = dataChiusura;
		this.nap = nap;
		this.noTelefono = noTelefono;
		this.eMail = eMail;
		this.timeZone = timeZone;
		this.descEstesa = descEstesa;
		this.eMailHr = eMailHr;
		this.nazioneId = nazioneId;
		this.nazione = nazione;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getLocalita() {
		return localita;
	}

	public LocalDate getDataChiusura() {
		return dataChiusura;
	}

	public String getNap() {
		return nap;
	}

	public String getNoTelefono() {
		return noTelefono;
	}

	public String geteMail() {
		return eMail;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public String getDescEstesa() {
		return descEstesa;
	}

	public String geteMailHr() {
		return eMailHr;
	}

	public Integer getNazioneId() {
		return nazioneId;
	}

	public String getNazione() {
		return nazione;
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

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setLocalita(String localita) {
		this.localita = localita;
	}

	public void setDataChiusura(LocalDate dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public void setNap(String nap) {
		this.nap = nap;
	}

	public void setNoTelefono(String noTelefono) {
		this.noTelefono = noTelefono;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public void setDescEstesa(String descEstesa) {
		this.descEstesa = descEstesa;
	}

	public void seteMailHr(String eMailHr) {
		this.eMailHr = eMailHr;
	}

	public void setNazioneId(Integer nazioneId) {
		this.nazioneId = nazioneId;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataChiusura, descEstesa, descSede, eMail, eMailHr, indirizzo, localita, nap, nazione,
				nazioneId, noTelefono, nomeIndirizzo, sedeId, societaId, timeZone);
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
		return Objects.equals(dataChiusura, other.dataChiusura) && Objects.equals(descEstesa, other.descEstesa)
				&& Objects.equals(descSede, other.descSede) && Objects.equals(eMail, other.eMail)
				&& Objects.equals(eMailHr, other.eMailHr) && Objects.equals(indirizzo, other.indirizzo)
				&& Objects.equals(localita, other.localita) && Objects.equals(nap, other.nap)
				&& Objects.equals(nazione, other.nazione) && Objects.equals(nazioneId, other.nazioneId)
				&& Objects.equals(noTelefono, other.noTelefono) && Objects.equals(nomeIndirizzo, other.nomeIndirizzo)
				&& Objects.equals(sedeId, other.sedeId) && Objects.equals(societaId, other.societaId)
				&& Objects.equals(timeZone, other.timeZone);
	}
}
