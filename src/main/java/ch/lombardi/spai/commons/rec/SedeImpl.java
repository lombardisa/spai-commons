package ch.lombardi.spai.commons.rec;

import java.time.LocalDateTime;
import java.util.Objects;

public class SedeImpl implements Sede {

	private static final long serialVersionUID = 4286757739061690872L;

	// VARIABILI
	private Integer sedeId;
	private Integer societaId;
	private String codice;
	private String descrizione;
	private LocalDateTime dataApertura;
	private LocalDateTime dataChiusura;
	private Integer responsabileId;
	private String pathModelloCartella;
	private String pathDestinazioneCartella;
	private String datiCompleti;
	private Integer responsabileAutoId;
	private String nomeIndirizzo;
	private String descIndirizzo;
	private String pressCo;
	private String indirizzo;
	private String casellaPostale;
	private String nap;
	private String localita;
	private Integer nazioneId;
	private String noTelefono;
	private String email;
	private String paginaInternet;
	private String timeZone;
	private String descrizioneEstesa;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public SedeImpl() {
		super();
	}

	/**
	 * 
	 * @param sedeId
	 * @param societaId
	 * @param codice
	 * @param descrizione
	 * @param dataApertura
	 * @param dataChiusura
	 * @param responsabileId
	 * @param pathModelloCartella
	 * @param pathDestinazioneCartella
	 * @param datiCompleti
	 * @param responsabileAutoId
	 * @param nomeIndirizzo
	 * @param descIndirizzo
	 * @param pressCo
	 * @param indirizzo
	 * @param casellaPostale
	 * @param nap
	 * @param localita
	 * @param nazioneId
	 * @param noTelefono
	 * @param email
	 * @param paginaInternet
	 * @param timeZone
	 * @param descrizioneEstesa
	 */
	public SedeImpl(Integer sedeId, Integer societaId, String codice, String descrizione, LocalDateTime dataApertura,
			LocalDateTime dataChiusura, Integer responsabileId, String pathModelloCartella,
			String pathDestinazioneCartella, String datiCompleti, Integer responsabileAutoId, String nomeIndirizzo,
			String descIndirizzo, String pressCo, String indirizzo, String casellaPostale, String nap, String localita,
			Integer nazioneId, String noTelefono, String email, String paginaInternet, String timeZone,
			String descrizioneEstesa) {
		super();
		this.sedeId = sedeId;
		this.societaId = societaId;
		this.codice = codice;
		this.descrizione = descrizione;
		this.dataApertura = dataApertura;
		this.dataChiusura = dataChiusura;
		this.responsabileId = responsabileId;
		this.pathModelloCartella = pathModelloCartella;
		this.pathDestinazioneCartella = pathDestinazioneCartella;
		this.datiCompleti = datiCompleti;
		this.responsabileAutoId = responsabileAutoId;
		this.nomeIndirizzo = nomeIndirizzo;
		this.descIndirizzo = descIndirizzo;
		this.pressCo = pressCo;
		this.indirizzo = indirizzo;
		this.casellaPostale = casellaPostale;
		this.nap = nap;
		this.localita = localita;
		this.nazioneId = nazioneId;
		this.noTelefono = noTelefono;
		this.email = email;
		this.paginaInternet = paginaInternet;
		this.timeZone = timeZone;
		this.descrizioneEstesa = descrizioneEstesa;
	}

	public Integer getSedeId() {
		return sedeId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public LocalDateTime getDataApertura() {
		return dataApertura;
	}

	public LocalDateTime getDataChiusura() {
		return dataChiusura;
	}

	public Integer getResponsabileId() {
		return responsabileId;
	}

	public String getPathModelloCartella() {
		return pathModelloCartella;
	}

	public String getPathDestinazioneCartella() {
		return pathDestinazioneCartella;
	}

	public String getDatiCompleti() {
		return datiCompleti;
	}

	public Integer getResponsabileAutoId() {
		return responsabileAutoId;
	}

	public String getNomeIndirizzo() {
		return nomeIndirizzo;
	}

	public String getDescIndirizzo() {
		return descIndirizzo;
	}

	public String getPressCo() {
		return pressCo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getCasellaPostale() {
		return casellaPostale;
	}

	public String getNap() {
		return nap;
	}

	public String getLocalita() {
		return localita;
	}

	public Integer getNazioneId() {
		return nazioneId;
	}

	public String getNoTelefono() {
		return noTelefono;
	}

	public String getEmail() {
		return email;
	}

	public String getPaginaInternet() {
		return paginaInternet;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public String getDescrizioneEstesa() {
		return descrizioneEstesa;
	}

	public void setSedeId(Integer sedeId) {
		this.sedeId = sedeId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setDataApertura(LocalDateTime dataApertura) {
		this.dataApertura = dataApertura;
	}

	public void setDataChiusura(LocalDateTime dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public void setResponsabileId(Integer responsabileId) {
		this.responsabileId = responsabileId;
	}

	public void setPathModelloCartella(String pathModelloCartella) {
		this.pathModelloCartella = pathModelloCartella;
	}

	public void setPathDestinazioneCartella(String pathDestinazioneCartella) {
		this.pathDestinazioneCartella = pathDestinazioneCartella;
	}

	public void setDatiCompleti(String datiCompleti) {
		this.datiCompleti = datiCompleti;
	}

	public void setResponsabileAutoId(Integer responsabileAutoId) {
		this.responsabileAutoId = responsabileAutoId;
	}

	public void setNomeIndirizzo(String nomeIndirizzo) {
		this.nomeIndirizzo = nomeIndirizzo;
	}

	public void setDescIndirizzo(String descIndirizzo) {
		this.descIndirizzo = descIndirizzo;
	}

	public void setPressCo(String pressCo) {
		this.pressCo = pressCo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setCasellaPostale(String casellaPostale) {
		this.casellaPostale = casellaPostale;
	}

	public void setNap(String nap) {
		this.nap = nap;
	}

	public void setLocalita(String localita) {
		this.localita = localita;
	}

	public void setNazioneId(Integer nazioneId) {
		this.nazioneId = nazioneId;
	}

	public void setNoTelefono(String noTelefono) {
		this.noTelefono = noTelefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPaginaInternet(String paginaInternet) {
		this.paginaInternet = paginaInternet;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public void setDescrizioneEstesa(String descrizioneEstesa) {
		this.descrizioneEstesa = descrizioneEstesa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(casellaPostale, codice, dataApertura, dataChiusura, datiCompleti, descIndirizzo,
				descrizione, descrizioneEstesa, email, indirizzo, localita, nap, nazioneId, noTelefono, nomeIndirizzo,
				paginaInternet, pathDestinazioneCartella, pathModelloCartella, pressCo, responsabileAutoId,
				responsabileId, sedeId, societaId, timeZone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SedeImpl other = (SedeImpl) obj;
		return Objects.equals(casellaPostale, other.casellaPostale) && Objects.equals(codice, other.codice)
				&& Objects.equals(dataApertura, other.dataApertura) && Objects.equals(dataChiusura, other.dataChiusura)
				&& Objects.equals(datiCompleti, other.datiCompleti)
				&& Objects.equals(descIndirizzo, other.descIndirizzo) && Objects.equals(descrizione, other.descrizione)
				&& Objects.equals(descrizioneEstesa, other.descrizioneEstesa) && Objects.equals(email, other.email)
				&& Objects.equals(indirizzo, other.indirizzo) && Objects.equals(localita, other.localita)
				&& Objects.equals(nap, other.nap) && Objects.equals(nazioneId, other.nazioneId)
				&& Objects.equals(noTelefono, other.noTelefono) && Objects.equals(nomeIndirizzo, other.nomeIndirizzo)
				&& Objects.equals(paginaInternet, other.paginaInternet)
				&& Objects.equals(pathDestinazioneCartella, other.pathDestinazioneCartella)
				&& Objects.equals(pathModelloCartella, other.pathModelloCartella)
				&& Objects.equals(pressCo, other.pressCo)
				&& Objects.equals(responsabileAutoId, other.responsabileAutoId)
				&& Objects.equals(responsabileId, other.responsabileId) && Objects.equals(sedeId, other.sedeId)
				&& Objects.equals(societaId, other.societaId) && Objects.equals(timeZone, other.timeZone);
	}
}
