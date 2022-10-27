package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = CandidatoImpl.class)
public interface Candidato extends Serializable {

	// METHODS-------------------------------------------
	/**
	 * Metodo per ricevere l'ID del candidato.
	 * 
	 * @return l'ID del candidato.
	 */
	Integer getCandidatoId();

	/**
	 * Metodo per ricevere l'ID del sesso del candidato.
	 * 
	 * @return l'ID del sesso del candidato.
	 */
	Integer getSessoId();

	/**
	 * Metodo per ricevere l'ID del sondaggio del candidato.
	 * 
	 * @return l'ID del sondaggio del candidato.
	 */
	Integer getSondaggioId();

	/**
	 * Metodo per ricevere l'ID del link.
	 * 
	 * @return l'ID del link.
	 */
	Integer getLinkId();

	/**
	 * Metodo per ricevere il link.
	 * 
	 * @return il link.
	 */
	String[] getLink();
	
	/**
	 * Metodo per ricevere l'ID della lingua.
	 * 
	 * @return l'ID della lingua.
	 */
	Integer getCandidatoLinguaId();

	/**
	 * Metodo per ricevere l'ID della lingua.
	 * 
	 * @return l'ID della lingua.
	 */
	String[] getLinguaId();

	/**
	 * Metodo per ricevere l'ID della lingua livello.
	 * 
	 * @return l'ID della lingua livello.
	 */
	String[] getLinguaLivelloId();

	/**
	 * Metodo per ricevere la situazione lavorativa del candidato.
	 * 
	 * @return la situazione lavorativa del candidato.
	 */
	Integer getSituazioneLavorativaId();

	/**
	 * Metodo per ricevere l'ID della formazione del candidato.
	 * 
	 * @return l'ID della formazione del candidato.
	 */
	Integer getFormazioneId();

	/**
	 * Metodo per ricevere l'ID dello stato del candidato.
	 * 
	 * @return l'ID dello stato del candidato.
	 */
	Integer getStatoId();

	/**
	 * Metodo per ricevere l'ID dell'annuncio del candidato.
	 * 
	 * @return l'ID dell'annuncio del candidato.
	 */
	Integer getAnnuncioId();

	/**
	 * Metodo per ricevere l'ID della motivazione scarto del candidato.
	 * 
	 * @return l'ID della motivazione scarto del candidato.
	 */
	Integer getMotivazioneScartoId();

	/**
	 * Metodo per ricevere la data di formazione del candidato.
	 * 
	 * @return la data di formazione del candidato.
	 */
	LocalDate getDataFormazione();

	/**
	 * Metodo per ricevere il nome del candidato.
	 * 
	 * @return il nome del candidato.
	 */
	String getNome();

	/**
	 * Metodo per ricevere il cognome del candidato.
	 * 
	 * @return il cognome del candidato.
	 */
	String getCognome();

	/**
	 * Metodo per ricevere la data di nascita del candidato.
	 * 
	 * @return la data di nascita del candidato.
	 */
	LocalDate getNascita();

	/**
	 * Metodo per ricevere l'indirizzo email del candidato.
	 * 
	 * @return l'indirizzo email del candidato.
	 */
	String getEmail();

	/**
	 * Metodo per ricevere il CV del candidato.
	 * 
	 * @return il CV del candidato.
	 */
	byte[] getCv();

	/**
	 * Metodo per ricevere la conferma (S/N) di accettazione termini da parte del
	 * candidato.
	 * 
	 * @return la conferma (S/N) di accettazione termini da parte del candidato.
	 */
	String getCheckTermini();

	/**
	 * Metodo per ricevere la conferma (S/N) di accettazione autorizzazione da parte
	 * del candidato.
	 * 
	 * @return la conferma (S/N) di accettazione autorizzazione da parte del
	 *         candidato.
	 */
	String getCheckAutorizzazione();

	/**
	 * Metodo per ricevere il numero di telefono del candidato.
	 * 
	 * @return il numero di telefono del candidato.
	 */
	String getTelefono();

	/**
	 * Metodo per ricevere il messaggio del candidato.
	 * 
	 * @return il messaggio del candidato.
	 */
	String getMessaggio();

	/**
	 * Metodo per ricevere il messaggio vocale del candidato.
	 * 
	 * @return il messaggio vocale del candidato.
	 */
	byte[] getVocale();

	/**
	 * Metodo per ricevere l'estenzione del CV del candidato.
	 * 
	 * @return l'estenzione del CV del candidato.
	 */
	String getCvEstensione();

	/**
	 * Metodo per ricevere l'estenzione del messaggio vocale del candidato.
	 * 
	 * @return l'estenzione del messaggio vocale del candidato.
	 */
	String getVocaleEstensione();

	/**
	 * Metodo per ricevere la prima valutazione del candidato.
	 * 
	 * @return la prima valutazione del candidato.
	 */
	String getValutazionePrima();

	/**
	 * Metodo per ricevere la seconda valutazione del candidato.
	 * 
	 * @return la seconda valutazione del candidato.
	 */
	String getValutazioneSeconda();

	/**
	 * Metodo per ricevere la seconda valutazione del candidato.
	 * 
	 * @return la seconda valutazione del candidato.
	 */
	String getFeedbackInterno();

	/**
	 * Metodo per ricevere la seconda valutazione del candidato.
	 * 
	 * @return la seconda valutazione del candidato.
	 */
	String getInformato();

	/**
	 * Metodo per ricevere l'ID del candidato.
	 * 
	 * @return l'ID del candidato.
	 */
	Integer getDocumentoId();

	/**
	 * Metodo per ricevere l'ID del sesso del candidato.
	 * 
	 * @return l'ID del sesso del candidato.
	 */
	byte[] getDocumento();

	/**
	 * Metodo per ricevere l'ID del sesso del candidato.
	 * 
	 * @return l'ID del sesso del candidato.
	 */
	String getDocumentoEstensione();

	/**
	 * Metodo per ricevere l'ID del sesso del candidato.
	 * 
	 * @return l'ID del sesso del candidato.
	 */
	String getDescrizioneDocumento();
}
