package ch.lombardi.spai.commons.gen;

import java.util.Objects;

import ch.lombardi.spai.commons.rec.Lingua;

public class GenLinguaImpl implements Lingua {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -2856257047521472266L;

	// VARIABLES
	private String chiaveId;
	private String testo;

	/**
	 * Default empty constructor.
	 */
	public GenLinguaImpl() {
		super();
	}

	/**
	 * Costructor of the lingue asked to the candidates.
	 * 
	 * @param linguaId: the ID_LINGUA.
	 * @param desc:     the DESCRIZIONE of the ID_LINGUA.
	 */
	public GenLinguaImpl(String chiaveId, String testo) {
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
	 * Returns a hash code value for the object. This method is supported for the
	 * benefit of hash tables such as those provided by HashMap.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(chiaveId, testo);
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
		GenLinguaImpl other = (GenLinguaImpl) obj;
		return Objects.equals(testo, other.testo) && Objects.equals(chiaveId, other.chiaveId);
	}
}