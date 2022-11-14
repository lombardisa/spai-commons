package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: SondaggioImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class SondaggioImpl implements Sondaggio {

	/**
	 * UID: technical internal identification number.
	 */
	private static final long serialVersionUID = -2393711910011217184L;

	// VARIABLES
	private String chiaveId;
	private String testo;

	/**
	 * Default empty constructor (necessary for Jackson serialization).
	 */
	public SondaggioImpl() {
		super();
	}

	/**
	 * Costructor of the sondaggio requested to the candidates.
	 * 
	 * @param chiaveId: the ID_CHIAVE.
	 * @param testo:    the TESTO.
	 */
	public SondaggioImpl(String chiaveId, String testo) {
		super();
		this.chiaveId = chiaveId;
		this.testo = testo;
	}

	/**
	 * Gets the ID_CHIAVE.
	 */
	public String getChiaveId() {
		return chiaveId;
	}

	/**
	 * Gets the TESTO.
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * Sets the ID_CHIAVE.
	 * 
	 * @param chiaveId: the ID_CHIAVE.
	 */
	public void setChiaveId(String chiaveId) {
		this.chiaveId = chiaveId;
	}

	/**
	 * Sets the TESTO.
	 * 
	 * @param testo: the TESTO.
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(chiaveId, testo);
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SondaggioImpl other = (SondaggioImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}
}