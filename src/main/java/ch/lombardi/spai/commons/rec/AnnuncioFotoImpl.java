package ch.lombardi.spai.commons.rec;

import java.util.Arrays;
import java.util.Objects;

public class AnnuncioFotoImpl implements AnnuncioFoto {

	private static final long serialVersionUID = 8297759014733666276L;

	// VARIABILI
	private Integer fotoId;
	private Integer societaId;
	private Integer annuncioId;
	private String attivo;
	private byte[] foto;
	private String codice;
	private String desc;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public AnnuncioFotoImpl() {
		super();
	}

	/**
	 * 
	 * @param fotoId
	 * @param societaId
	 * @param annuncioId
	 * @param attivo
	 * @param foto
	 * @param codice
	 * @param desc
	 */
	public AnnuncioFotoImpl(Integer fotoId, Integer societaId, Integer annuncioId, String attivo, byte[] foto,
			String codice, String desc) {
		super();
		this.fotoId = fotoId;
		this.societaId = societaId;
		this.annuncioId = annuncioId;
		this.attivo = attivo;
		this.foto = foto;
		this.codice = codice;
		this.desc = desc;
	}

	public Integer getFotoId() {
		return fotoId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public String getAttivo() {
		return attivo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public String getCodice() {
		return codice;
	}

	public String getDesc() {
		return desc;
	}

	public void setFotoId(Integer fotoId) {
		this.fotoId = fotoId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + Objects.hash(annuncioId, attivo, codice, desc, fotoId, societaId);
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
		AnnuncioFotoImpl other = (AnnuncioFotoImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(attivo, other.attivo)
				&& Objects.equals(codice, other.codice) && Objects.equals(desc, other.desc)
				&& Arrays.equals(foto, other.foto) && Objects.equals(fotoId, other.fotoId)
				&& Objects.equals(societaId, other.societaId);
	}
}
