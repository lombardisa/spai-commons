package ch.lombardi.spai.commons.rec;

import java.time.LocalDateTime;

public class AnnuncioImpl implements Annuncio {

	private static final long serialVersionUID = 7564964076463242656L;

	// VARIABILI
	private Integer annuncioId;
	private Integer refPrincId;
	private Integer sedeId;
	private Integer sezioneId;
	private Integer areaId;
	private Integer refSecondId;
	private String titolo;
	private String descrizione;
	private Boolean attivo;
	private Boolean homeOffice;
	private Double occupMin;
	private Double occupMax;
	private LocalDateTime inizio;
	private LocalDateTime fine;
	private LocalDateTime dataInizioContratto;
	private Integer durataContratto;
	private Integer unitaDurataContratto;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public AnnuncioImpl() {
		super();
	}

	public AnnuncioImpl(Integer annuncioId, Integer refPrincId, Integer sedeId, Integer sezioneId, Integer areaId,
			Integer refSecondId, String titolo, String descrizione, Boolean attivo, Boolean homeOffice, Double occupMin,
			Double occupMax, LocalDateTime inizio, LocalDateTime fine, LocalDateTime dataInizioContratto,
			Integer durataContratto, Integer unitaDurataContratto) {
		super();
		this.annuncioId = annuncioId;
		this.refPrincId = refPrincId;
		this.sedeId = sedeId;
		this.sezioneId = sezioneId;
		this.areaId = areaId;
		this.refSecondId = refSecondId;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.attivo = attivo;
		this.homeOffice = homeOffice;
		this.occupMin = occupMin;
		this.occupMax = occupMax;
		this.inizio = inizio;
		this.fine = fine;
		this.dataInizioContratto = dataInizioContratto;
		this.durataContratto = durataContratto;
		this.unitaDurataContratto = unitaDurataContratto;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public Integer getRefPrincId() {
		return refPrincId;
	}

	public Integer getSedeId() {
		return sedeId;
	}

	public Integer getSezioneId() {
		return sezioneId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public Integer getRefSecondId() {
		return refSecondId;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Boolean getAttivo() {
		return attivo;
	}

	public Boolean getHomeOffice() {
		return homeOffice;
	}

	public Double getOccupMin() {
		return occupMin;
	}

	public Double getOccupMax() {
		return occupMax;
	}

	public LocalDateTime getInizio() {
		return inizio;
	}

	public LocalDateTime getFine() {
		return fine;
	}

	public LocalDateTime getDataInizioContratto() {
		return dataInizioContratto;
	}

	public Integer getDurataContratto() {
		return durataContratto;
	}

	public Integer getUnitaDurataContratto() {
		return unitaDurataContratto;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setRefPrincId(Integer refPrincId) {
		this.refPrincId = refPrincId;
	}

	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	public void setSezioneId(Integer sezioneId) {
		this.sezioneId = sezioneId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public void setRefSecondId(Integer refSecondId) {
		this.refSecondId = refSecondId;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	public void setHomeOffice(Boolean homeOffice) {
		this.homeOffice = homeOffice;
	}

	public void setOccupMin(Double occupMin) {
		this.occupMin = occupMin;
	}

	public void setOccupMax(Double occupMax) {
		this.occupMax = occupMax;
	}

	public void setInizio(LocalDateTime inizio) {
		this.inizio = inizio;
	}

	public void setFine(LocalDateTime fine) {
		this.fine = fine;
	}

	public void setDataInizioContratto(LocalDateTime dataInizioContratto) {
		this.dataInizioContratto = dataInizioContratto;
	}

	public void setDurataContratto(Integer durataContratto) {
		this.durataContratto = durataContratto;
	}

	public void setUnitaDurataContratto(Integer unitaDurataContratto) {
		this.unitaDurataContratto = unitaDurataContratto;
	}

}
