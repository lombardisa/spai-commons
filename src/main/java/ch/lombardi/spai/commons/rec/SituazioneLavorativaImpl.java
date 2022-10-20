package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class SituazioneLavorativaImpl implements SituazioneLavorativa {

	private static final long serialVersionUID = 4345981187877890717L;

	// VARIABILI
	private String chiaveId;
	private String testo;

	/**
	 * 
	 */
	public SituazioneLavorativaImpl() {
		super();
	}

	/**
	 * 
	 * @param chiaveId
	 * @param testo
	 */
	public SituazioneLavorativaImpl(String chiaveId, String testo) {
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
		SituazioneLavorativaImpl other = (SituazioneLavorativaImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}

}
