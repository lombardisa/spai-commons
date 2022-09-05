package ch.lombardi.spai.commons.rec;

import java.time.LocalDateTime;
import java.util.Objects;

public class CandidatoImpl implements Candidato {

	private static final long serialVersionUID = -2903163788258047228L;

	// VARIABILI
	private Integer candidatoId;
	private Integer sessoId;
	private Integer sondaggioId;
	private Integer situazioneLavorativaId;
	private Integer formazioneId;
	private Integer statoId;
	private Integer annuncioId;
	private LocalDateTime dataFormazione;
	private String nome;
	private String cognome;
	private LocalDateTime nascita;
	private String email;
	private Byte cv;
	private String checkTermini;
	private String checkAutorizzazione;
	private String telefono;
	private Byte messaggio;
	private Byte vocale;
	private String cvEstensione;
	private String vocaleEstensione;
	private String valutazionePrima;
	private String valutazioneSeconda;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public CandidatoImpl() {
		super();
	}

	/**
	 * 
	 * @param candidatoId
	 * @param sessoId
	 * @param sondaggioId
	 * @param situazioneLavorativaId
	 * @param formazioneId
	 * @param statoId
	 * @param annuncioId
	 * @param dataFormazione
	 * @param nome
	 * @param cognome
	 * @param nascita
	 * @param email
	 * @param cv
	 * @param checkTermini
	 * @param checkAutorizzazione
	 * @param telefono
	 * @param messaggio
	 * @param vocale
	 * @param cvEstensione
	 * @param vocaleEstensione
	 * @param valutazionePrima
	 * @param valutazioneSeconda
	 */
	public CandidatoImpl(Integer candidatoId, Integer sessoId, Integer sondaggioId, Integer situazioneLavorativaId,
			Integer formazioneId, Integer statoId, Integer annuncioId, LocalDateTime dataFormazione, String nome,
			String cognome, LocalDateTime nascita, String email, Byte cv, String checkTermini,
			String checkAutorizzazione, String telefono, Byte messaggio, Byte vocale, String cvEstensione,
			String vocaleEstensione, String valutazionePrima, String valutazioneSeconda) {
		super();
		this.candidatoId = candidatoId;
		this.sessoId = sessoId;
		this.sondaggioId = sondaggioId;
		this.situazioneLavorativaId = situazioneLavorativaId;
		this.formazioneId = formazioneId;
		this.statoId = statoId;
		this.annuncioId = annuncioId;
		this.dataFormazione = dataFormazione;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.email = email;
		this.cv = cv;
		this.checkTermini = checkTermini;
		this.checkAutorizzazione = checkAutorizzazione;
		this.telefono = telefono;
		this.messaggio = messaggio;
		this.vocale = vocale;
		this.cvEstensione = cvEstensione;
		this.vocaleEstensione = vocaleEstensione;
		this.valutazionePrima = valutazionePrima;
		this.valutazioneSeconda = valutazioneSeconda;
	}

	public Integer getCandidatoId() {
		return candidatoId;
	}

	public Integer getSessoId() {
		return sessoId;
	}

	public Integer getSondaggioId() {
		return sondaggioId;
	}

	public Integer getSituazioneLavorativaId() {
		return situazioneLavorativaId;
	}

	public Integer getFormazioneId() {
		return formazioneId;
	}

	public Integer getStatoId() {
		return statoId;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public LocalDateTime getDataFormazione() {
		return dataFormazione;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public LocalDateTime getNascita() {
		return nascita;
	}

	public String getEmail() {
		return email;
	}

	public Byte getCv() {
		return cv;
	}

	public String getCheckTermini() {
		return checkTermini;
	}

	public String getCheckAutorizzazione() {
		return checkAutorizzazione;
	}

	public String getTelefono() {
		return telefono;
	}

	public Byte getMessaggio() {
		return messaggio;
	}

	public Byte getVocale() {
		return vocale;
	}

	public String getCvEstensione() {
		return cvEstensione;
	}

	public String getVocaleEstensione() {
		return vocaleEstensione;
	}

	public String getValutazionePrima() {
		return valutazionePrima;
	}

	public String getValutazioneSeconda() {
		return valutazioneSeconda;
	}

	public void setCandidatoId(Integer candidatoId) {
		this.candidatoId = candidatoId;
	}

	public void setSessoId(Integer sessoId) {
		this.sessoId = sessoId;
	}

	public void setSondaggioId(Integer sondaggioId) {
		this.sondaggioId = sondaggioId;
	}

	public void setSituazioneLavorativaId(Integer situazioneLavorativaId) {
		this.situazioneLavorativaId = situazioneLavorativaId;
	}

	public void setFormazioneId(Integer formazioneId) {
		this.formazioneId = formazioneId;
	}

	public void setStatoId(Integer statoId) {
		this.statoId = statoId;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setDataFormazione(LocalDateTime dataFormazione) {
		this.dataFormazione = dataFormazione;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNascita(LocalDateTime nascita) {
		this.nascita = nascita;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCv(Byte cv) {
		this.cv = cv;
	}

	public void setCheckTermini(String checkTermini) {
		this.checkTermini = checkTermini;
	}

	public void setCheckAutorizzazione(String checkAutorizzazione) {
		this.checkAutorizzazione = checkAutorizzazione;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setMessaggio(Byte messaggio) {
		this.messaggio = messaggio;
	}

	public void setVocale(Byte vocale) {
		this.vocale = vocale;
	}

	public void setCvEstensione(String cvEstensione) {
		this.cvEstensione = cvEstensione;
	}

	public void setVocaleEstensione(String vocaleEstensione) {
		this.vocaleEstensione = vocaleEstensione;
	}

	public void setValutazionePrima(String valutazionePrima) {
		this.valutazionePrima = valutazionePrima;
	}

	public void setValutazioneSeconda(String valutazioneSeconda) {
		this.valutazioneSeconda = valutazioneSeconda;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annuncioId, candidatoId, checkAutorizzazione, checkTermini, cognome, cv, cvEstensione,
				dataFormazione, email, formazioneId, messaggio, nascita, nome, sessoId, situazioneLavorativaId,
				sondaggioId, statoId, telefono, valutazionePrima, valutazioneSeconda, vocale, vocaleEstensione);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandidatoImpl other = (CandidatoImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(candidatoId, other.candidatoId)
				&& Objects.equals(checkAutorizzazione, other.checkAutorizzazione)
				&& Objects.equals(checkTermini, other.checkTermini) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(cv, other.cv) && Objects.equals(cvEstensione, other.cvEstensione)
				&& Objects.equals(dataFormazione, other.dataFormazione) && Objects.equals(email, other.email)
				&& Objects.equals(formazioneId, other.formazioneId) && Objects.equals(messaggio, other.messaggio)
				&& Objects.equals(nascita, other.nascita) && Objects.equals(nome, other.nome)
				&& Objects.equals(sessoId, other.sessoId)
				&& Objects.equals(situazioneLavorativaId, other.situazioneLavorativaId)
				&& Objects.equals(sondaggioId, other.sondaggioId) && Objects.equals(statoId, other.statoId)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(valutazionePrima, other.valutazionePrima)
				&& Objects.equals(valutazioneSeconda, other.valutazioneSeconda) && Objects.equals(vocale, other.vocale)
				&& Objects.equals(vocaleEstensione, other.vocaleEstensione);
	}
}
