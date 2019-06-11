package ch.lombardi.spai.commons.notifiche;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Implementazione di {@link DestinatarioNotifica}.
 */
public class DestinatarioNotificaImpl implements DestinatarioNotifica {

	private static final long serialVersionUID = -3115079312528103902L;

	private int progressivo;
	private TipoNotifica tipo;
	private Integer societa;
	private String utente;
	private StatoNotifica stato;
	private LocalDateTime dataOraInvio;
	private String errore;
	private String erroreMessageCode;

	@Override
	public int getProgressivo() {
		return progressivo;
	}

	@Override
	public TipoNotifica getTipo() {
		return tipo;
	}

	@Override
	public Optional<Integer> getSocieta() {
		return Optional.ofNullable(societa);
	}

	@Override
	public Optional<String> getUtente() {
		return Optional.ofNullable(utente);
	}

	@Override
	public StatoNotifica getStato() {
		return stato;
	}

	@Override
	public Optional<LocalDateTime> getDataOraInvio() {
		return Optional.ofNullable(dataOraInvio);
	}

	@Override
	public Optional<String> getErrore() {
		return Optional.ofNullable(errore);
	}

	@Override
	public Optional<String> getErroreMessageCode() {
		return Optional.ofNullable(erroreMessageCode);
	}

	public void setProgressivo(int progressivo) {
		this.progressivo = progressivo;
	}

	public void setTipo(TipoNotifica tipo) {
		this.tipo = tipo;
	}

	public void setSocieta(Integer societa) {
		this.societa = societa;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

	public void setStato(StatoNotifica stato) {
		this.stato = stato;
	}

	public void setDataOraInvio(LocalDateTime dataOraInvio) {
		this.dataOraInvio = dataOraInvio;
	}

	public void setErrore(String errore) {
		this.errore = errore;
	}

	public void setErroreMessageCode(String erroreMessageCode) {
		this.erroreMessageCode = erroreMessageCode;
	}

}
