package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: AnnuncioEsperienzaImpl.java
 * 
 * @author Matteo Maddes
 * @version 04.07.2023
 */
public class AnnuncioEsperienzaImpl implements AnnuncioEsperienza {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = 2676876379619731666L;

	// VARIABLES
	private final Integer STATUS_OK = 200;
	private final Integer STATUS_ERROR = 404;
	private Integer status;
	private Integer annuncioId;
	private Integer esperienzaId;
	private String desc;
	private String errorDesc;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioEsperienzaImpl() {
		super();
	}

	/**
	 * Costructor of the experience needed for an annuncio.
	 * 
	 * @param annuncioId:   the ID of the annuncio.
	 * @param esperienzaId: the ID of the esperienza.
	 * @param desc:         the DESCRIZIONE of the esperienza needed for this
	 *                      annuncio.
	 */
	public AnnuncioEsperienzaImpl(Integer annuncioId, Integer esperienzaId, String desc) {
		super();
		this.status = STATUS_OK;
		this.annuncioId = annuncioId;
		this.esperienzaId = esperienzaId;
		this.desc = desc;
	}

	/**
	 * Method for the error. It uses two Strings.
	 * 
	 * @param errorCode: code of the error.
	 * @param errorDesc: description of the error.
	 */
	public AnnuncioEsperienzaImpl(String errorDesc) {
		this.status = STATUS_ERROR;
		this.errorDesc = errorDesc;
	}

	/**
	 * String for the Error Code
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the Error Code.
	 * 
	 * @param Error Code.
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * String for the Error Desc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}

	/**
	 * Sets the Error Desc.
	 * 
	 * @param Error Desc.
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	/**
	 * Gets the ID_ANNUNCIO.
	 */
	public Integer getAnnuncioId() {
		return annuncioId;
	}

	/**
	 * Gets the ID_ESPERIENZA.
	 */
	public Integer getEsperienzaId() {
		return esperienzaId;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the ID_ANNUNCIO.
	 * 
	 * @param annuncioId: the ID of the annuncio.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the ID_ESPERIENZA.
	 * 
	 * @param esperienzaId: the ID of the esperienza.
	 */
	public void setEsperienzaId(Integer esperienzaId) {
		this.esperienzaId = esperienzaId;
	}

	/**
	 * Sets the DESCRIZIONE.
	 * 
	 * @param desc: the DESCRIZIONE of the esperienza needed for this annuncio.
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
		return Objects.hash(annuncioId, desc, esperienzaId);
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
		AnnuncioEsperienzaImpl other = (AnnuncioEsperienzaImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Objects.equals(esperienzaId, other.esperienzaId);
	}
}