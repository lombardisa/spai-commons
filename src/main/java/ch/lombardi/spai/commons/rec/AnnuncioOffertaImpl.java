package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: AnnuncioOffertaImpl.java
 * 
 * @author Matteo Maddes
 * @version 04.07.2023
 */
public class AnnuncioOffertaImpl implements AnnuncioOfferta {

	/**
	 * UID: technical internal identification number(serialization).
	 */
	private static final long serialVersionUID = -1633804424445767997L;

	// VARIABLES
	private final Integer STATUS_OK = 200;
	private final Integer STATUS_ERROR = 404;
	private Integer status;
	private Integer annuncioId;
	private Integer offertaId;
	private String desc;
	private String errorDesc;

	/**
	 * Default empty constructor.
	 */
	public AnnuncioOffertaImpl() {
		super();
	}

	/**
	 * Costructor of the offerta included in an annuncio.
	 * 
	 * @param annuncioId: the ID_ANNUNCIO.
	 * @param offertaId:  the ID_OFFERTA.
	 * @param desc:       the DESCRIZIONE.
	 */
	public AnnuncioOffertaImpl(Integer annuncioId, Integer offertaId, String desc) {
		super();
		this.status = STATUS_OK;
		this.annuncioId = annuncioId;
		this.offertaId = offertaId;
		this.desc = desc;
	}

	/**
	 * Method for the error. It uses two Strings.
	 * 
	 * @param errorCode: code of the error.
	 * @param errorDesc: description of the error.
	 */
	public AnnuncioOffertaImpl(String errorDesc) {
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
	 * Gets the ID_OFFERTA.
	 */
	public Integer getOffertaId() {
		return offertaId;
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
	 * @param annuncioId: the ID_ANNUNCIO.
	 */
	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	/**
	 * Sets the ID_OFFERTA.
	 * 
	 * @param offertaId: the ID_OFFERTA.
	 */
	public void setOffertaId(Integer offertaId) {
		this.offertaId = offertaId;
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
		return Objects.hash(annuncioId, desc, offertaId);
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
		AnnuncioOffertaImpl other = (AnnuncioOffertaImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Objects.equals(offertaId, other.offertaId);
	}
}