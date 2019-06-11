package ch.lombardi.spai.commons.notifiche;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Notifica.
 */
@JsonDeserialize(as = NotificaImpl.class)
public interface Notifica extends Serializable {

	/**
	 * Id notifica.
	 * @return Id notifica
	 */
	int getId();

	/**
	 * Categoria della notifica.
	 * @return Categoria della notifica
	 */
	CategoriaNotifica getCategoria();

	/**
	 * Data e ora della notifica.
	 * @return Data e ora della notifica
	 */
	LocalDateTime getDataOra();

	/**
	 * Mittente della notifica.
	 * @return Mittente della notifica
	 */
	String getMittente();

	/**
	 * Tipo mittente della notifica.
	 * @return Tipo mittente della notifica.
	 */
	TipoMittenteNotifica getTipoMittente();

	/**
	 * Titolo della notifica.
	 * @return Titolo della notifica.
	 */
	String getTitolo();

	/**
	 * Se il titolo è traducibile, message code per il titolo.
	 * @return Message code per il titolo, se presente
	 */
	Optional<String> getTitoloMessageCode();

	/**
	 * Testo della notifica.
	 * @return Testo della notifica.
	 */
	String getTesto();

	/**
	 * Se il testo è traducibile, message code per il testo.
	 * @return Message code per il testo, se presente
	 */
	Optional<String> getTestoMessageCode();

	/**
	 * Link associato alla notifica, se presente.
	 * @return Link associato alla notifica, se presente.
	 */
	Optional<String> getLink();

	/**
	 * Destinatari della notifica.
	 * @return Destinatari della notifica
	 */
	List<DestinatarioNotifica> getDestinatari();

}
