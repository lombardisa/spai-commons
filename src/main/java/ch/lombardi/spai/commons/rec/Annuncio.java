package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AnnuncioImpl.class)
public interface Annuncio extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * Returns the job offer's ID.
	 * 
	 * @return the job offer's ID.
	 */
	Integer getAnnuncioId();

	/**
	 * Returns the ID_REF_PRINC of the job offer.
	 * 
	 * @return the ID_REF_PRINC of the job offer.
	 */
	Integer getRefPrincId();

	/**
	 * Returns the first name of the ID_REF_PRINC of the job offer.
	 * 
	 * @return the first name of the ID_REF_PRINC of the job offer.
	 */
	String getNomeRefPrinc();

	/**
	 * Returns the last name of the ID_REF_PRINC of the job offer.
	 * 
	 * @return the last name of the ID_REF_PRINC of the job offer.
	 */
	String getCognomeRefPrinc();

	/**
	 * Returns the picture of the ID_REF_PRINC of the job offer.
	 * 
	 * @return the picture of the ID_REF_PRINC of the job offer.
	 */
	byte[] getFotoRefPrinc();

	/**
	 * Returns the ID_SEDE of the job offer.
	 * 
	 * @return the ID_SEDE of the job offer.
	 */
	Integer getSedeId();

	/**
	 * Returns the DESCRIZIONE of the sede.
	 * 
	 * @return the DESCRIZIONE of the sede.
	 */
	String getDescSede();

	/**
	 * Returns the NOME_INDIRIZZO of the sede.
	 * 
	 * @return the NOME_INDIRIZZO of the sede.
	 */
	String getNomeIndirizzo();

	/**
	 * Returns the DESC_INDIRIZZO of the sede.
	 * 
	 * @return the DESC_INDIRIZZO of the sede.
	 */
	String getDescIndirizzo();

	/**
	 * Returns the INDIRIZZO of the sede.
	 * 
	 * @return the INDIRIZZO of the sede.
	 */
	String getIndirizzo();

	/**
	 * Returns the CASELLA_POSTALE of the sede.
	 * 
	 * @return the CASELLA_POSTALE of the sede.
	 */
	String getCasellaPostale();

	/**
	 * Returns the NAP of the sede.
	 * 
	 * @return the NAP of the sede.
	 */
	String getNap();

	/**
	 * Returns the LOCALITA of the sede.
	 * 
	 * @return the LOCALITA of the sede.
	 */
	String getLocalita();

	/**
	 * Returns the ID_NAZIONE of the sede.
	 * 
	 * @return the ID_NAZIONE of the sede.
	 */
	Integer getNazioneId();

	/**
	 * Returns the DESCRIZIONE of the nazione.
	 * 
	 * @return the DESCRIZIONE of the nazione.
	 */
	String getDescNazione();

	/**
	 * Returns the NO_TELEFONO of the sede.
	 * 
	 * @return the NO_TELEFONO of the sede.
	 */
	String getNoTelefono();

	/**
	 * Returns the E_MAIL_HR of the sede.
	 * 
	 * @return the E_MAIL_HR of the sede.
	 */
	String getEmailHr();

	/**
	 * Returns the PAGINA_INTERNET of the sede.
	 * 
	 * @return the PAGINA_INTERNET of the sede.
	 */
	String getPaginaInternet();

	/**
	 * Returns the PAGINA_LINKEDIN of the sede.
	 * 
	 * @return PAGINA_LINKEDIN of the sede.
	 */
	String getPaginaLinkedin();

	/**
	 * Returns the ID_SEZIONE of the job offer.
	 * 
	 * @return: the ID_SEZIONE of the job offer.
	 */
	Integer getSezioneId();

	/**
	 * Returns the ID_AREA of the job offer.
	 * 
	 * @return: the ID_AREA of the job offer.
	 */
	Integer getAreaId();

	/**
	 * Returns the DESCRIZIONE of the ID_AREA of the job offer.
	 * 
	 * @return the DESCRIZIONE of the ID_AREA of the job offer.
	 */
	String getDescArea();

	/**
	 * Returns the DESCRIZIONE_BREVE of the ID_AREA of the job offer.
	 * 
	 * @return the DESCRIZIONE_BREVE of the ID_AREA of the job offer.
	 */
	String getDescAreaBreve();

	/**
	 * Returns the ID_REF_SECOND of the job offer.
	 * 
	 * @return: the ID_REF_SECOND of the job offer.
	 */
	Integer getRefSecondId();

	/**
	 * Returns the first name of the ID_REF_SECOND of the job offer.
	 * 
	 * @return the first name of the ID_REF_SECOND of the job offer.
	 */
	String getNomeRefSecond();

	/**
	 * Returns the last name of the ID_REF_SECOND of the job offer.
	 * 
	 * @return the last name of the ID_REF_SECOND of the job offer.
	 */
	String getCognomeRefSecond();

	/**
	 * Returns the picture of the ID_REF_SECOND of the job offer.
	 * 
	 * @return the picture of the ID_REF_SECOND of the job offer.
	 */
	byte[] getFotoRefSecond();

	/**
	 * Returns the TITOLO of the job offer.
	 * 
	 * @return: the TITOLO of the job offer.
	 */
	String getTitolo();

	/**
	 * Returns the DESCRIZIONE of the job offer.
	 * 
	 * @return: the DESCRIZIONE of the job offer.
	 */
	String getDescrizione();

	/**
	 * Returns the possibility of home office of the job offer.
	 * 
	 * @return: the possibility of home office of the job offer.
	 */
	String getHomeOffice();

	/**
	 * Returns the minimum percentage of occupancy of the job offer.
	 * 
	 * @return the minimum percentage of occupancy of the job offer.
	 */
	BigDecimal getOccupMin();

	/**
	 * Returns the maximum percentage of occupancy of the job offer.
	 * 
	 * @return the maximum percentage of occupancy of the job offer.
	 */
	BigDecimal getOccupMax();

	/**
	 * Returns the date of publication of the job offer.
	 * 
	 * @return the date of publication of the job offer.
	 */
	LocalDate getInizio();

	/**
	 * Returns the date of removal of the job offer.
	 * 
	 * @return the date of removal of the job offer.
	 */
	LocalDate getFine();

	/*
	 * Returns the contract start date of the job offer.
	 * 
	 * @return: the contract start date of the job offer.
	 */
	LocalDate getDataInizioContratto();

	/*
	 * Returns the contract duration of the job offer.
	 * 
	 * @return: the contract duration of the job offer.
	 */
	Integer getDurataContratto();

	/*
	 * Returns the unit of measurement of the job offer's contract duration.
	 * 
	 * @return: the unit of measurement of the job offer's contract duration.
	 */
	Integer getUnitaDurataContratto();
}