package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.time.LocalDateTime;

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
	 * Metodo per ricevere l'ID della sede.
	 * 
	 * @return: l'ID della sede.
	 */
	Integer getSedeId();

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
	 * Metodo per ricevere l'ID del referente secondario.
	 * 
	 * @return: l'ID del referente secondario.
	 */
	Integer getRefSecondId();

	/**
	 * Metodo per ricevere il titolo dell'annuncio.
	 * 
	 * @return: il titolo dell'annuncio.
	 */
	String getTitolo();

	/**
	 * Metodo per ricevere la descrizione dell'annuncio.
	 * 
	 * @return: la descrizione dell'annuncio.
	 */
	String getDescrizione();

	/**
	 * Metodo per ricevere la possibilità di home office dell'annuncio.
	 * 
	 * @return: la possibilità di home office dell'annuncio.
	 */
	String getHomeOffice();

	/**
	 * Metodo per ricevere la percentuale d'occupazione minima (%) dell'annuncio.
	 * 
	 * @return: la percentuale d'occupazione minima (%) dell'annuncio.
	 */
	Double getOccupMin();

	/**
	 * Metodo per ricevere la percentuale d'occupazione massima (%) dell'annuncio.
	 * 
	 * @return: la percentuale d'occupazione massima (%) dell'annuncio.
	 */
	Double getOccupMax();

	/* Metodo per ricevere la data d'inizio contratto dell'annuncio.
	 * 
	 * @return: la data d'inizio contratto dell'annuncio.
	 */
	LocalDateTime getDataInizioContratto();

	/* Metodo per ricevere la durata contrattuale dell'annuncio.
	 * 
	 * @return: la durata contrattuale dell'annuncio.
	 */
	Integer getDurataContratto();

	/* Metodo per ricevere l'unità di misura della durata contrattuale dell'annuncio.
	 * 
	 * @return: l'unità di misura della durata contrattuale dell'annuncio.
	 */
	Integer getUnitaDurataContratto();

}
