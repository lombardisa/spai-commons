package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class SessoImpl implements Sesso {

	private static final long serialVersionUID = -4377613034232497410L;

	// VARIABILI
	private String chiaveId;
	private String testo;

	/**
	 * 
	 */
	public SessoImpl() {
		super();
	}

	/**
	 * 
	 * @param chiaveId
	 * @param testo
	 */
	public SessoImpl(String chiaveId, String testo) {
		super();
		this.chiaveId = chiaveId;
		this.testo = testo;
	}

	public String getChiaveId() {
		return chiaveId;
	}

	public String getTesto() {
		return testo;
	}

	public void setChiaveId(String chiaveId) {
		this.chiaveId = chiaveId;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chiaveId, testo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SessoImpl other = (SessoImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}
}
