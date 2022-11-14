package ch.lombardi.spai.commons.rec;

import java.util.Arrays;
import java.util.Objects;

/**
 * Java Class: AnnuncioFotoImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class AnnuncioFotoImpl implements AnnuncioFoto {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 8297759014733666276L;

	// VARIABLES
	private Integer fotoId;
	private Integer societaId;
	private Integer annuncioId;
	private String attivo;
	private byte[] foto;
	private String codice;
	private String desc;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioFotoImpl() {
		super();
	}

	/**
	 * Costructor of the foto needed for an annuncio.
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

	/**
	 * Gets the ID_FOTO.
	 */
	public Integer getFotoId() {
		return fotoId;
	}

	/**
	 * Gets the ID_SOCIETA.
	 */
	public Integer getSocietaId() {
		return societaId;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ATTIVO.
	 */
	public String getAttivo() {
		return attivo;
	}

	/**
	 * Gets the FOTO.
	 */
	public byte[] getFoto() {
		return foto;
	}

	/**
	 * Gets the CODICE.
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the ID_FOTO.
	 * 
	 * @param fotoId: the ID_FOTO.
	 */
	public void setFotoId(Integer fotoId) {
		this.fotoId = fotoId;
	}

	/**
	 * Sets the ID_SOCIETA.
	 * 
	 * @param societaId: the ID_SOCIETA.
	 */
	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	/**
	 * Sets the ID_ANNUNCIO.
	 * 
	 * @param annuncioId: the ID_ANNUNCIO.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the ATTIVO.
	 * 
	 * @param attivo: the ATTIVO.
	 */
	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}

	/**
	 * Sets the FOTO.
	 * 
	 * @param foto: the FOTO.
	 */
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	/**
	 * Sets the CODICE.
	 * 
	 * @param codice: the CODICE.
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param desc: the DESCRIZIONE.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + Objects.hash(annuncioId, attivo, codice, desc, fotoId, societaId);
		return result;
	}

	/**
	 * Compares the IDs to see if the values are exactly the same Object.
	 */
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