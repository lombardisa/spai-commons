package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SedeImpl.class)
public interface Sede extends Serializable {

	/**
	 * Metodo per ricevere l'ID della sede.
	 * 
	 * @return: l'ID della sede.
	 */
	Integer getSedeId();

	/**
	 * Metodo per ricevere l'ID della societa della sede.
	 * 
	 * @return: l'ID della societa della sede.
	 */
	Integer getSocietaId();

	/**
	 * Metodo per ricevere il codice della sede.
	 * 
	 * @return: il codice della sede.
	 */
	String getCodice();

	/**
	 * Metodo per ricevere la descrizione della sede.
	 * 
	 * @return: la descrizione della sede.
	 */
	String getDescrizione();

	/*
	 * Metodo per ricevere la data d'apertura della sede.
	 * 
	 * @return: la data d'apertura della sede.
	 */
	LocalDateTime getDataApertura();

	/*
	 * Metodo per ricevere la data di chiusura della sede.
	 * 
	 * @return: la data di chiusura della sede.
	 */
	LocalDateTime getDataChiusura();

	/**
	 * Metodo per ricevere l'ID del responsabile della sede.
	 * 
	 * @return: l'ID del responsabile della sede.
	 */
	Integer getResponsabileId();

	/**
	 * Metodo per ricevere la path modello cartella della sede.
	 * 
	 * @return: la path modello cartella della sede.
	 */
	String getPathModelloCartella();

	/**
	 * Metodo per ricevere la path destinazione cartella della sede.
	 * 
	 * @return: la path destinazione cartella della sede.
	 */
	String getPathDestinazioneCartella();

	/**
	 * Metodo per ricevere la conferma (S/N) per i dati completi della sede.
	 * 
	 * @return: la conferma (S/N) per i dati completi della sede.
	 */
	String getDatiCompleti();

	/**
	 * Metodo per ricevere l'ID del responsabile auto della sede.
	 * 
	 * @return: l'ID del responsabile auto della sede.
	 */
	Integer getResponsabileAutoId();

	/**
	 * Metodo per ricevere il nome dell'indirizzo della sede.
	 * 
	 * @return: il nome dell'indirizzo della sede.
	 */
	String getNomeIndirizzo();

	/**
	 * Metodo per ricevere la descrizione dell'indirizzo della sede.
	 * 
	 * @return: la descrizione dell'indirizzo della sede.
	 */
	String getDescIndirizzo();

	/**
	 * Metodo per ricevere il presso CO della sede.
	 * 
	 * @return: il presso CO della sede.
	 */
	String getPressCo();

	/**
	 * Metodo per ricevere l'indirizzo della sede.
	 * 
	 * @return: l'indirizzo della sede.
	 */
	String getIndirizzo();

	/**
	 * Metodo per ricevere la casella postale della sede.
	 * 
	 * @return: la casella postale della sede.
	 */
	String getCasellaPostale();

	/**
	 * Metodo per ricevere il NAP della sede.
	 * 
	 * @return: il NAP della sede.
	 */
	String getNap();

	/**
	 * Metodo per ricevere la località della sede.
	 * 
	 * @return: la località della sede.
	 */
	String getLocalita();

	/**
	 * Metodo per ricevere l'ID della nazione della sede.
	 * 
	 * @return: l'ID della nazione della sede.
	 */
	Integer getNazioneId();

	/**
	 * Metodo per ricevere il numero di telefono della sede.
	 * 
	 * @return: il numero di telefono della sede.
	 */
	String getNoTelefono();

	/**
	 * Metodo per ricevere l'indirizzo e-mail della sede.
	 * 
	 * @return: l'indirizzo e-mail della sede.
	 */
	String getEmail();

	/**
	 * Metodo per ricevere la pagina internet della sede.
	 * 
	 * @return: la pagina internet della sede.
	 */
	String getPaginaInternet();

	/**
	 * Metodo per ricevere il time zone della sede.
	 * 
	 * @return: il time zone della sede.
	 */
	String getTimeZone();

	/**
	 * Metodo per ricevere la descrizione estesa della sede.
	 * 
	 * @return: la descrizione estesa della sede.
	 */
	String getDescrizioneEstesa();

}
