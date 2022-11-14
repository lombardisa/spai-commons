package ch.lombardi.spai.commons.rec;

import java.util.Objects;

/**
 * Java Class: LinguaImpl.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
public class LinguaImpl implements Lingua {

	/**
	 * UID: technical internal identification number (serialization).
	 */
	private static final long serialVersionUID = -5639711708140896060L;

	// VARIABLES
	private Integer linguaId;
	private String desc;

	/**
	 * Default empty constructor.
	 */
	public LinguaImpl() {
		super();
	}

	/**
	 * Costructor of the lingue asked to the candidates.
	 * 
	 * @param linguaId: the ID_LINGUA.
	 * @param desc:     the DESCRIZIONE of the ID_LINGUA.
	 */
	public LinguaImpl(Integer linguaId, String desc) {
		super();
		this.linguaId = linguaId;
		this.desc = desc;
	}

	/**
	 * Gets the ID_LINGUA.
	 */
	public Integer getLinguaId() {
		return linguaId;
	}

	/**
	 * Gets the DESCRIZIONE.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the ID_LINGUA.
	 * 
	 * @param linguaId: the ID_LINGUA.
	 */
	public void setLinguaId(Integer linguaId) {
		this.linguaId = linguaId;
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
		return Objects.hash(desc, linguaId);
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
		LinguaImpl other = (LinguaImpl) obj;
		return Objects.equals(desc, other.desc) && Objects.equals(linguaId, other.linguaId);
	}
}