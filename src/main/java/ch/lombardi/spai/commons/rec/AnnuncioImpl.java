package ch.lombardi.spai.commons.rec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class AnnuncioImpl implements Annuncio {

	private static final long serialVersionUID = 7564964076463242656L;

	// VARIABILI
	private Integer annuncioId;
	private Integer refPrincId;
	private String nomeRefPrinc;
	private String conomeRefPrinc;
	private byte[] fotoRefPrinc;

	private Integer sedeId;
	private String descSede;
	private String nomeIndirizzo;
	private String descIndirizzo;
	private String indirizzo;
	private String casellaPostale;
	private String nap;
	private String localita;
	private Integer nazioneId;
	private String descNazione;
	private String noTelefono;
	private String emailHr;
	private String paginaInternet;
	private String paginaLinkedin;

	private Integer sezioneId;

	private Integer areaId;
	private String descArea;

	private Integer refSecondId;
	private String nomeRefSecond;
	private String conomeRefSecond;
	private byte[] fotoRefSecond;

	private String titolo;

	private String descrizione;

	private String homeOffice;

	private BigDecimal occupMin;

	private BigDecimal occupMax;

	private LocalDate inizio;

	private LocalDate fine;

	private LocalDate dataInizioContratto;

	private Integer durataContratto;

	private String unitaDurataContratto;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public AnnuncioImpl() {
		super();
	}

	public AnnuncioImpl(Integer annuncioId, Integer refPrincId, String nomeRefPrinc, String conomeRefPrinc,
			byte[] fotoRefPrinc, Integer sedeId, String descSede, String nomeIndirizzo, String descIndirizzo,
			String indirizzo, String casellaPostale, String nap, String localita, Integer nazioneId, String descNazione,
			String noTelefono, String emailHr, String paginaInternet, String paginaLinkedin, Integer sezioneId,
			Integer areaId, String descArea, Integer refSecondId, String nomeRefSecond, String conomeRefSecond,
			byte[] fotoRefSecond, String titolo, String descrizione, String homeOffice, BigDecimal occupMin,
			BigDecimal occupMax, LocalDate inizio, LocalDate fine, LocalDate dataInizioContratto,
			Integer durataContratto, String unitaDurataContratto) {
		super();
		this.annuncioId = annuncioId;
		this.refPrincId = refPrincId;
		this.nomeRefPrinc = nomeRefPrinc;
		this.conomeRefPrinc = conomeRefPrinc;
		this.fotoRefPrinc = fotoRefPrinc;
		this.sedeId = sedeId;
		this.descSede = descSede;
		this.nomeIndirizzo = nomeIndirizzo;
		this.descIndirizzo = descIndirizzo;
		this.indirizzo = indirizzo;
		this.casellaPostale = casellaPostale;
		this.nap = nap;
		this.localita = localita;
		this.nazioneId = nazioneId;
		this.descNazione = descNazione;
		this.noTelefono = noTelefono;
		this.emailHr = emailHr;
		this.paginaInternet = paginaInternet;
		this.paginaLinkedin = paginaLinkedin;
		this.sezioneId = sezioneId;
		this.areaId = areaId;
		this.descArea = descArea;
		this.refSecondId = refSecondId;
		this.nomeRefSecond = nomeRefSecond;
		this.conomeRefSecond = conomeRefSecond;
		this.fotoRefSecond = fotoRefSecond;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.homeOffice = homeOffice;
		this.occupMin = occupMin;
		this.occupMax = occupMax;
		this.inizio = inizio;
		this.fine = fine;
		this.dataInizioContratto = dataInizioContratto;
		this.durataContratto = durataContratto;
		this.unitaDurataContratto = unitaDurataContratto;
	}

	@Override
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	@Override
	public Integer getRefPrincId() {
		return refPrincId;
	}

	public String getNomeRefPrinc() {
		return nomeRefPrinc;
	}

	public String getConomeRefPrinc() {
		return conomeRefPrinc;
	}

	public byte[] getFotoRefPrinc() {
		return fotoRefPrinc;
	}

	@Override
	public Integer getSedeId() {
		return sedeId;
	}

	public String getDescSede() {
		return descSede;
	}

	public String getNomeIndirizzo() {
		return nomeIndirizzo;
	}

	public String getDescIndirizzo() {
		return descIndirizzo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getCasellaPostale() {
		return casellaPostale;
	}

	public String getNap() {
		return nap;
	}

	public String getLocalita() {
		return localita;
	}

	public Integer getNazioneId() {
		return nazioneId;
	}

	public String getDescNazione() {
		return descNazione;
	}

	public String getNoTelefono() {
		return noTelefono;
	}

	public String getEmailHr() {
		return emailHr;
	}

	public String getPaginaInternet() {
		return paginaInternet;
	}

	public String getPaginaLinkedin() {
		return paginaLinkedin;
	}

	@Override
	public Integer getSezioneId() {
		return sezioneId;
	}

	@Override
	public Integer getAreaId() {
		return areaId;
	}

	public String getDescArea() {
		return descArea;
	}

	@Override
	public Integer getRefSecondId() {
		return refSecondId;
	}

	public String getNomeRefSecond() {
		return nomeRefSecond;
	}

	public String getConomeRefSecond() {
		return conomeRefSecond;
	}

	public byte[] getFotoRefSecond() {
		return fotoRefSecond;
	}

	@Override
	public String getTitolo() {
		return titolo;
	}
	
	@Override
	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public String getHomeOffice() {
		return homeOffice;
	}

	@Override
	public BigDecimal getOccupMin() {
		return occupMin;
	}

	@Override
	public BigDecimal getOccupMax() {
		return occupMax;
	}

	@Override
	public LocalDate getInizio() {
		return inizio;
	}

	@Override
	public LocalDate getFine() {
		return fine;
	}

	@Override
	public LocalDate getDataInizioContratto() {
		return dataInizioContratto;
	}

	@Override
	public Integer getDurataContratto() {
		return durataContratto;
	}

	@Override
	public String getUnitaDurataContratto() {
		return unitaDurataContratto;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setRefPrincId(Integer refPrincId) {
		this.refPrincId = refPrincId;
	}

	public void setNomeRefPrinc(String nomeRefPrinc) {
		this.nomeRefPrinc = nomeRefPrinc;
	}

	public void setConomeRefPrinc(String conomeRefPrinc) {
		this.conomeRefPrinc = conomeRefPrinc;
	}

	public void setFotoRefPrinc(byte[] fotoRefPrinc) {
		this.fotoRefPrinc = fotoRefPrinc;
	}

	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	public void setDescSede(String descSede) {
		this.descSede = descSede;
	}

	public void setNomeIndirizzo(String nomeIndirizzo) {
		this.nomeIndirizzo = nomeIndirizzo;
	}

	public void setDescIndirizzo(String descIndirizzo) {
		this.descIndirizzo = descIndirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setCasellaPostale(String casellaPostale) {
		this.casellaPostale = casellaPostale;
	}

	public void setNap(String nap) {
		this.nap = nap;
	}

	public void setLocalita(String localita) {
		this.localita = localita;
	}

	public void setNazioneId(Integer nazioneId) {
		this.nazioneId = nazioneId;
	}

	public void setDescNazione(String descNazione) {
		this.descNazione = descNazione;
	}

	public void setNoTelefono(String noTelefono) {
		this.noTelefono = noTelefono;
	}

	public void setEmailHr(String emailHr) {
		this.emailHr = emailHr;
	}

	public void setPaginaInternet(String paginaInternet) {
		this.paginaInternet = paginaInternet;
	}

	public void setPaginaLinkedin(String paginaLinkedin) {
		this.paginaLinkedin = paginaLinkedin;
	}

	public void setSezioneId(Integer sezioneId) {
		this.sezioneId = sezioneId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public void setDescArea(String descArea) {
		this.descArea = descArea;
	}

	public void setRefSecondId(Integer refSecondId) {
		this.refSecondId = refSecondId;
	}

	public void setNomeRefSecond(String nomeRefSecond) {
		this.nomeRefSecond = nomeRefSecond;
	}

	public void setConomeRefSecond(String conomeRefSecond) {
		this.conomeRefSecond = conomeRefSecond;
	}

	public void setFotoRefSecond(byte[] fotoRefSecond) {
		this.fotoRefSecond = fotoRefSecond;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setHomeOffice(String homeOffice) {
		this.homeOffice = homeOffice;
	}

	public void setOccupMin(BigDecimal occupMin) {
		this.occupMin = occupMin;
	}

	public void setOccupMax(BigDecimal occupMax) {
		this.occupMax = occupMax;
	}

	public void setInizio(LocalDate inizio) {
		this.inizio = inizio;
	}

	public void setFine(LocalDate fine) {
		this.fine = fine;
	}

	public void setDataInizioContratto(LocalDate dataInizioContratto) {
		this.dataInizioContratto = dataInizioContratto;
	}

	public void setDurataContratto(Integer durataContratto) {
		this.durataContratto = durataContratto;
	}

	public void setUnitaDurataContratto(String unitaDurataContratto) {
		this.unitaDurataContratto = unitaDurataContratto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fotoRefPrinc);
		result = prime * result + Arrays.hashCode(fotoRefSecond);
		result = prime * result + Objects.hash(annuncioId, areaId, casellaPostale, conomeRefPrinc, conomeRefSecond,
				dataInizioContratto, descArea, descIndirizzo, descNazione, descSede, descrizione, durataContratto,
				emailHr, fine, homeOffice, indirizzo, inizio, localita, nap, nazioneId, noTelefono, nomeIndirizzo,
				nomeRefPrinc, nomeRefSecond, occupMax, occupMin, paginaInternet, paginaLinkedin, refPrincId,
				refSecondId, sedeId, sezioneId, titolo, unitaDurataContratto);
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
		AnnuncioImpl other = (AnnuncioImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(areaId, other.areaId)
				&& Objects.equals(casellaPostale, other.casellaPostale)
				&& Objects.equals(conomeRefPrinc, other.conomeRefPrinc)
				&& Objects.equals(conomeRefSecond, other.conomeRefSecond)
				&& Objects.equals(dataInizioContratto, other.dataInizioContratto)
				&& Objects.equals(descArea, other.descArea) && Objects.equals(descIndirizzo, other.descIndirizzo)
				&& Objects.equals(descNazione, other.descNazione) && Objects.equals(descSede, other.descSede)
				&& Objects.equals(descrizione, other.descrizione)
				&& Objects.equals(durataContratto, other.durataContratto) && Objects.equals(emailHr, other.emailHr)
				&& Objects.equals(fine, other.fine) && Arrays.equals(fotoRefPrinc, other.fotoRefPrinc)
				&& Arrays.equals(fotoRefSecond, other.fotoRefSecond) && Objects.equals(homeOffice, other.homeOffice)
				&& Objects.equals(indirizzo, other.indirizzo) && Objects.equals(inizio, other.inizio)
				&& Objects.equals(localita, other.localita) && Objects.equals(nap, other.nap)
				&& Objects.equals(nazioneId, other.nazioneId) && Objects.equals(noTelefono, other.noTelefono)
				&& Objects.equals(nomeIndirizzo, other.nomeIndirizzo)
				&& Objects.equals(nomeRefPrinc, other.nomeRefPrinc)
				&& Objects.equals(nomeRefSecond, other.nomeRefSecond) && Objects.equals(occupMax, other.occupMax)
				&& Objects.equals(occupMin, other.occupMin) && Objects.equals(paginaInternet, other.paginaInternet)
				&& Objects.equals(paginaLinkedin, other.paginaLinkedin) && Objects.equals(refPrincId, other.refPrincId)
				&& Objects.equals(refSecondId, other.refSecondId) && Objects.equals(sedeId, other.sedeId)
				&& Objects.equals(sezioneId, other.sezioneId) && Objects.equals(titolo, other.titolo)
				&& Objects.equals(unitaDurataContratto, other.unitaDurataContratto);
	}
}
