package ch.lombardi.spai.commons.notifiche;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Destinario di una notifica.
 */
@JsonDeserialize(as = DestinatarioNotificaImpl.class)
public interface DestinatarioNotifica extends Serializable {

	/**
	 * Progressivo destinatario.
	 * @return Progressivo destinatario
	 */
	int getProgressivo();

	/**
	 * Tipo notifica.
	 * @return Tipo notifica
	 */
	TipoNotifica getTipo();

	/**
	 * Se destinata a tutti gli utenti di una societa, id della societa.
	 * @return Id societa, se presente
	 */
	Optional<Integer> getSocieta();

	/**
	 * Se destinata ad un utente specifico, nome utente.
	 * @return Nome utente, se presente.
	 */
	Optional<String> getUtente();

	/**
	 * Stato della notifica al destinatario.
	 * @return Stato della notifica
	 */
	StatoNotifica getStato();

	/**
	 * Se inviata, la data e ora dell'invio.
	 * @return Data e ora dell'invio, se presente
	 */
	Optional<LocalDateTime> getDataOraInvio();

	/**
	 * Se lo stato e' errore, descrizione dell'errore.
	 * @return Descrizione dell'errore, se presente
	 */
	Optional<String> getErrore();

	/**
	 * Se l'errore è traducibile, message code per la traduzione.
	 * @return Message code per la traduzione dell'errore, se presente.
	 */
	Optional<String> getErroreMessageCode();

}
