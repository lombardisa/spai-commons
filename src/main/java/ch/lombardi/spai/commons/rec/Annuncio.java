package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AnnuncioImpl.class)
public interface Annuncio extends Serializable {

	/**
	 * Metodo per ricevere l'ID dell'annuncio.
	 * 
	 * @return: l'ID dell'annuncio.
	 */
	Integer getAnnuncioId();

	/**
	 * Metodo per ricevere l'ID del referente principale.
	 * 
	 * @return: l'ID del referente principale.
	 */
	Integer getRefPrincId();

	/**
	 * 
	 * @return
	 */
	String getNomeRefPrinc();

	/**
	 * 
	 * @return
	 */
	String getConomeRefPrinc();

	/**
	 * 
	 * @return
	 */
	byte[] getFotoRefPrinc();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere l'ID della sede.
	 * 
	 * @return: l'ID della sede.
	 */
	Integer getSedeId();

	/**
	 * 
	 * @return
	 */
	String getDescSede();

	/**
	 * 
	 * @return
	 */
	String getNomeIndirizzo();

	/**
	 * 
	 * @return
	 */
	String getDescIndirizzo();

	/**
	 * 
	 * @return
	 */
	String getIndirizzo();

	/**
	 * 
	 * @return
	 */
	String getCasellaPostale();

	/**
	 * 
	 * @return
	 */
	String getNap();

	/**
	 * 
	 * @return
	 */
	String getLocalita();

	/**
	 * 
	 * @return
	 */
	Integer getNazioneId();

	/**
	 * 
	 * @return
	 */
	String getDescNazione();

	/**
	 * 
	 * @return
	 */
	String getNoTelefono();

	/**
	 * 
	 * @return
	 */
	String getEmailHr();

	/**
	 * 
	 * @return
	 */
	String getPaginaInternet();

	/**
	 * 
	 * @return
	 */
	String getPaginaLinkedin();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere l'ID della sezione.
	 * 
	 * @return: l'ID della sezione.
	 */
	Integer getSezioneId();

	/**
	 * Metodo per ricevere l'ID dell'area (settore lavorativo).
	 * 
	 * @return: l'ID dell'area (settore lavorativo).
	 */
	Integer getAreaId();

	/**
	 * 
	 * @return
	 */
	String getDescArea();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere l'ID del referente secondario.
	 * 
	 * @return: l'ID del referente secondario.
	 */
	Integer getRefSecondId();

	/**
	 * 
	 * @return
	 */
	String getNomeRefSecond();

	/**
	 * 
	 * @return
	 */
	String getConomeRefSecond();

	/**
	 * 
	 * @return
	 */
	byte[] getFotoRefSecond();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere il titolo dell'annuncio.
	 * 
	 * @return: il titolo dell'annuncio.
	 */
	String getTitolo();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere la descrizione dell'annuncio.
	 * 
	 * @return: la descrizione dell'annuncio.
	 */
	String getDescrizione();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere la possibilità di home office dell'annuncio.
	 * 
	 * @return: la possibilità di home office dell'annuncio.
	 */
	String getHomeOffice();

	// -------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @return
	 */
	BigDecimal getOccupMin();

	// -------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @return
	 */
	BigDecimal getOccupMax();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere la data di pubblicazione dell'annuncio.
	 * 
	 * @return la data di pubblicazione dell'annuncio.
	 */
	LocalDate getInizio();

	// -------------------------------------------------------------------------------------------------

	/**
	 * Metodo per ricevere la data di rimozione dell'annuncio.
	 * 
	 * @return la data di rimozione dell'annuncio.
	 */
	LocalDate getFine();

	// -------------------------------------------------------------------------------------------------

	/*
	 * Metodo per ricevere la data d'inizio contratto dell'annuncio.
	 * 
	 * @return: la data d'inizio contratto dell'annuncio.
	 */
	LocalDate getDataInizioContratto();

	// -------------------------------------------------------------------------------------------------

	/*
	 * Metodo per ricevere la durata contrattuale dell'annuncio.
	 * 
	 * @return: la durata contrattuale dell'annuncio.
	 */
	Integer getDurataContratto();

	// -------------------------------------------------------------------------------------------------

	/*
	 * Metodo per ricevere l'unità di misura della durata contrattuale
	 * dell'annuncio.
	 * 
	 * @return: l'unità di misura della durata contrattuale dell'annuncio.
	 */
	Integer getUnitaDurataContratto();

	// -------------------------------------------------------------------------------------------------

}
