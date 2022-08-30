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
	private Boolean homeOffice;
	private Double occupMin;
	private Double occupMax;
	private LocalDateTime dataInizioContratto;
	private Integer durataContratto;
	private Integer unitaDurataContratto;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public AnnuncioImpl() {
		super();
	}

	/**
	 * Contructor.
	 * 
	 * @param annuncioId
	 * @param refPrincId
	 * @param sedeId
	 * @param sezioneId
	 * @param areaId
	 * @param refSecondId
	 * @param titolo
	 * @param descrizione
	 * @param homeOffice
	 * @param occupMin
	 * @param occupMax
	 * @param dataInizioContratto
	 * @param durataContratto
	 * @param unitaDurataContratto
	 */
	public AnnuncioImpl(Integer annuncioId, Integer refPrincId, Integer sedeId, Integer sezioneId, Integer areaId,
			Integer refSecondId, String titolo, String descrizione, Boolean homeOffice, Double occupMin,
			Double occupMax, LocalDateTime dataInizioContratto, Integer durataContratto, Integer unitaDurataContratto) {
		super();
		this.annuncioId = annuncioId;
		this.refPrincId = refPrincId;
		this.sedeId = sedeId;
		this.sezioneId = sezioneId;
		this.areaId = areaId;
		this.refSecondId = refSecondId;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.homeOffice = homeOffice;
		this.occupMin = occupMin;
		this.occupMax = occupMax;
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

	@Override
	public Integer getSedeId() {
		return sedeId;
	}

	@Override
	public Integer getSezioneId() {
		return sezioneId;
	}

	@Override
	public Integer getAreaId() {
		return areaId;
	}

	@Override
	public Integer getRefSecondId() {
		return refSecondId;
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
	public Boolean getHomeOffice() {
		return homeOffice;
	}

	@Override
	public Double getOccupMin() {
		return occupMin;
	}

	@Override
	public Double getOccupMax() {
		return occupMax;
	}

	@Override
	public LocalDateTime getDataInizioContratto() {
		return dataInizioContratto;
	}

	@Override
	public Integer getDurataContratto() {
		return durataContratto;
	}

	@Override
	public Integer getUnitaDurataContratto() {
		return unitaDurataContratto;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
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

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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
