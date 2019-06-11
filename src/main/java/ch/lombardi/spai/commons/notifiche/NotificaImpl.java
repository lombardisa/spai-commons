package ch.lombardi.spai.commons.notifiche;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Implementazione di {@link Notifica}.
 */
public class NotificaImpl implements Notifica {

	private static final long serialVersionUID = 5876897266373084585L;

	private int id;
	private CategoriaNotifica categoria;
	private LocalDateTime dataOra;
	private String mittente;
	private TipoMittenteNotifica tipoMittente;
	private String titolo;
	private String titoloMessageCode;
	private String testo;
	private String testoMessageCode;
	private String link;
	private List<DestinatarioNotifica> destinatari;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public CategoriaNotifica getCategoria() {
		return categoria;
	}

	@Override
	public LocalDateTime getDataOra() {
		return dataOra;
	}

	@Override
	public String getMittente() {
		return mittente;
	}

	@Override
	public TipoMittenteNotifica getTipoMittente() {
		return tipoMittente;
	}

	@Override
	public String getTitolo() {
		return titolo;
	}

	@Override
	public Optional<String> getTitoloMessageCode() {
		return Optional.ofNullable(titoloMessageCode);
	}

	@Override
	public String getTesto() {
		return testo;
	}

	@Override
	public Optional<String> getTestoMessageCode() {
		return Optional.ofNullable(testoMessageCode);
	}

	@Override
	public Optional<String> getLink() {
		return Optional.ofNullable(link);
	}

	@Override
	public List<DestinatarioNotifica> getDestinatari() {
		return destinatari;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoria(CategoriaNotifica categoria) {
		this.categoria = categoria;
	}

	public void setDataOra(LocalDateTime dataOra) {
		this.dataOra = dataOra;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}

	public void setTipoMittente(TipoMittenteNotifica tipoMittente) {
		this.tipoMittente = tipoMittente;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setTitoloMessageCode(String titoloMessageCode) {
		this.titoloMessageCode = titoloMessageCode;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public void setTestoMessageCode(String testoMessageCode) {
		this.testoMessageCode = testoMessageCode;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setDestinatari(List<DestinatarioNotifica> destinatari) {
		this.destinatari = destinatari;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		NotificaImpl other = (NotificaImpl) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
