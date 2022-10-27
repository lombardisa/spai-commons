package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class SondaggioImpl implements Sondaggio {

	private static final long serialVersionUID = -2393711910011217184L;

	// VARIABILI
	private String chiaveId;
	private String testo;

	/**
	 * 
	 */
	public SondaggioImpl() {
		super();
	}

	public SondaggioImpl(String chiaveId, String testo) {
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
		SondaggioImpl other = (SondaggioImpl) obj;
		return Objects.equals(chiaveId, other.chiaveId) && Objects.equals(testo, other.testo);
	}
}
