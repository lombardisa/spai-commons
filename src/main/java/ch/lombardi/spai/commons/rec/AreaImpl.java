package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class AreaImpl implements Area {

	private static final long serialVersionUID = -504620104046972018L;

	// VARIABILI
	private String chiaveId;
	private String testo;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public AreaImpl() {
		super();
	}

	public AreaImpl(String chiaveId, String testo) {
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
		AreaImpl other = (AreaImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}
}
