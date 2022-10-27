package ch.lombardi.spai.commons.rec;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class CandidatoImpl implements Candidato {

	private static final long serialVersionUID = -2903163788258047228L;

	private Integer candidatoId;
	private Integer sessoId;
	private Integer sondaggioId;
	private Integer situazioneLavorativaId;
	private Integer formazioneId;
	private Integer statoId;
	private Integer annuncioId;
	private LocalDate dataFormazione;
	private String nome;
	private String cognome;
	private LocalDate nascita;
	private String email;
	private byte[] cv;
	private String checkTermini;
	private String checkAutorizzazione;
	private String telefono;
	private String messaggio;
	private byte[] vocale;
	private String cvEstensione;
	private String vocaleEstensione;
	private String valutazionePrima;
	private String valutazioneSeconda;
	private Integer motivazioneScartoId;
	private String feedbackInterno;
	private String informato;
	private Integer documentoId;
	private byte[] documento;
	private String documentoEstensione;
	private String descrizioneDocumento;
	private Integer linkId;
	private String[] link;
	private Integer candidatoLinguaId;
	private String[] linguaId;
	private String[] linguaLivelloId;

	// Questo override non contiene gli array: link, lingua.
	@Override
	public String toString() {
		return getCandidatoId() + ", " + getSessoId() + ", " + getSondaggioId() + ", " + getSituazioneLavorativaId()
				+ ", " + getFormazioneId() + ", " + getStatoId() + ", " + getAnnuncioId() + ", " + getDataFormazione()
				+ ", " + getNome() + ", " + getCognome() + ", " + getNascita() + ", " + getEmail() + ", " + getCv()
				+ ", " + getCheckTermini() + ", " + getCheckAutorizzazione() + ", " + getTelefono() + ", "
				+ getMessaggio() + ", " + getVocale() + ", " + getCvEstensione() + ", " + getVocaleEstensione() + ", "
				+ getValutazionePrima() + ", " + getValutazioneSeconda() + ", " + getMotivazioneScartoId() + ", "
				+ getFeedbackInterno() + ", " + getInformato() + ", " + getDocumentoId() + ", " + getDocumento() + ", "
				+ getDocumentoEstensione() + ", " + getDescrizioneDocumento();
	}

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public CandidatoImpl() {
		super();
	}

	public CandidatoImpl(Integer candidatoId, Integer sessoId, Integer sondaggioId, Integer situazioneLavorativaId,
			Integer formazioneId, Integer statoId, Integer annuncioId, LocalDate dataFormazione, String nome,
			String cognome, LocalDate nascita, String email, byte[] cv, String checkTermini, String checkAutorizzazione,
			String telefono, String messaggio, byte[] vocale, String cvEstensione, String vocaleEstensione,
			String valutazionePrima, String valutazioneSeconda, Integer motivazioneScartoId, String feedbackInterno,
			String informato, Integer documentoId, byte[] documento, String documentoEstensione,
			String descrizioneDocumento, Integer linkId, String[] link, Integer candidatoLinguaId, String[] linguaId,
			String[] linguaLivelloId) {
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
		this.motivazioneScartoId = motivazioneScartoId;
		this.feedbackInterno = feedbackInterno;
		this.informato = informato;
		this.documentoId = documentoId;
		this.documento = documento;
		this.documentoEstensione = documentoEstensione;
		this.descrizioneDocumento = descrizioneDocumento;
		this.linkId = linkId;
		this.link = link;
		this.candidatoLinguaId = candidatoLinguaId;
		this.linguaId = linguaId;
		this.linguaLivelloId = linguaLivelloId;
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

	public LocalDate getDataFormazione() {
		return dataFormazione;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public String getEmail() {
		return email;
	}

	public byte[] getCv() {
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

	public String getMessaggio() {
		return messaggio;
	}

	public byte[] getVocale() {
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

	public Integer getMotivazioneScartoId() {
		return motivazioneScartoId;
	}

	public String getFeedbackInterno() {
		return feedbackInterno;
	}

	public String getInformato() {
		return informato;
	}

	public Integer getDocumentoId() {
		return documentoId;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public String getDocumentoEstensione() {
		return documentoEstensione;
	}

	public String getDescrizioneDocumento() {
		return descrizioneDocumento;
	}

	public Integer getLinkId() {
		return linkId;
	}

	public String[] getLink() {
		return link;
	}

	public Integer getCandidatoLinguaId() {
		return candidatoLinguaId;
	}

	public String[] getLinguaId() {
		return linguaId;
	}

	public String[] getLinguaLivelloId() {
		return linguaLivelloId;
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

	public void setDataFormazione(LocalDate dataFormazione) {
		this.dataFormazione = dataFormazione;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCv(byte[] cv) {
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

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public void setVocale(byte[] vocale) {
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

	public void setMotivazioneScartoId(Integer motivazioneScartoId) {
		this.motivazioneScartoId = motivazioneScartoId;
	}

	public void setFeedbackInterno(String feedbackInterno) {
		this.feedbackInterno = feedbackInterno;
	}

	public void setInformato(String informato) {
		this.informato = informato;
	}

	public void setDocumentoId(Integer documentoId) {
		this.documentoId = documentoId;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	public void setDocumentoEstensione(String documentoEstensione) {
		this.documentoEstensione = documentoEstensione;
	}

	public void setDescrizioneDocumento(String descrizioneDocumento) {
		this.descrizioneDocumento = descrizioneDocumento;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public void setLink(String[] link) {
		this.link = link;
	}

	public void setCandidatoLinguaId(Integer candidatoLinguaId) {
		this.candidatoLinguaId = candidatoLinguaId;
	}

	public void setLinguaId(String[] linguaId) {
		this.linguaId = linguaId;
	}

	public void setLinguaLivelloId(String[] linguaLivelloId) {
		this.linguaLivelloId = linguaLivelloId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cv);
		result = prime * result + Arrays.hashCode(documento);
		result = prime * result + Arrays.hashCode(linguaId);
		result = prime * result + Arrays.hashCode(linguaLivelloId);
		result = prime * result + Arrays.hashCode(link);
		result = prime * result + Arrays.hashCode(vocale);
		result = prime * result + Objects.hash(annuncioId, candidatoId, candidatoLinguaId, checkAutorizzazione,
				checkTermini, cognome, cvEstensione, dataFormazione, descrizioneDocumento, documentoEstensione,
				documentoId, email, feedbackInterno, formazioneId, informato, linkId, messaggio, motivazioneScartoId,
				nascita, nome, sessoId, situazioneLavorativaId, sondaggioId, statoId, telefono, valutazionePrima,
				valutazioneSeconda, vocaleEstensione);
		return result;
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
				&& Objects.equals(candidatoLinguaId, other.candidatoLinguaId)
				&& Objects.equals(checkAutorizzazione, other.checkAutorizzazione)
				&& Objects.equals(checkTermini, other.checkTermini) && Objects.equals(cognome, other.cognome)
				&& Arrays.equals(cv, other.cv) && Objects.equals(cvEstensione, other.cvEstensione)
				&& Objects.equals(dataFormazione, other.dataFormazione)
				&& Objects.equals(descrizioneDocumento, other.descrizioneDocumento)
				&& Arrays.equals(documento, other.documento)
				&& Objects.equals(documentoEstensione, other.documentoEstensione)
				&& Objects.equals(documentoId, other.documentoId) && Objects.equals(email, other.email)
				&& Objects.equals(feedbackInterno, other.feedbackInterno)
				&& Objects.equals(formazioneId, other.formazioneId) && Objects.equals(informato, other.informato)
				&& Arrays.equals(linguaId, other.linguaId) && Arrays.equals(linguaLivelloId, other.linguaLivelloId)
				&& Arrays.equals(link, other.link) && Objects.equals(linkId, other.linkId)
				&& Objects.equals(messaggio, other.messaggio)
				&& Objects.equals(motivazioneScartoId, other.motivazioneScartoId)
				&& Objects.equals(nascita, other.nascita) && Objects.equals(nome, other.nome)
				&& Objects.equals(sessoId, other.sessoId)
				&& Objects.equals(situazioneLavorativaId, other.situazioneLavorativaId)
				&& Objects.equals(sondaggioId, other.sondaggioId) && Objects.equals(statoId, other.statoId)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(valutazionePrima, other.valutazionePrima)
				&& Objects.equals(valutazioneSeconda, other.valutazioneSeconda) && Arrays.equals(vocale, other.vocale)
				&& Objects.equals(vocaleEstensione, other.vocaleEstensione);
	}
}
