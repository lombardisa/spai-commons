package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class SessoImpl implements Sesso {

	private static final long serialVersionUID = -4377613034232497410L;

	// VARIABILI
	private Integer sessoId;
	private Integer societaId;
	private String desc;
	private String attivo;
	private String codice;

	/**
	 * 
	 */
	public SessoImpl() {
		super();
	}

	/**
	 * 
	 * @param sessoId
	 * @param societaId
	 * @param desc
	 * @param attivo
	 * @param codice
	 */
	public SessoImpl(Integer sessoId, Integer societaId, String desc, String attivo, String codice) {
		super();
		this.sessoId = sessoId;
		this.societaId = societaId;
		this.desc = desc;
		this.attivo = attivo;
		this.codice = codice;
	}

	public Integer getSessoId() {
		return sessoId;
	}

	public Integer getSocietaId() {
		return societaId;
	}

	public String getDesc() {
		return desc;
	}

	public String getAttivo() {
		return attivo;
	}

	public String getCodice() {
		return codice;
	}

	public void setSessoId(Integer sessoId) {
		this.sessoId = sessoId;
	}

	public void setSocietaId(Integer societaId) {
		this.societaId = societaId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setAttivo(String attivo) {
		this.attivo = attivo;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attivo, codice, desc, sessoId, societaId);
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
		return Objects.equals(attivo, other.attivo) && Objects.equals(codice, other.codice)
				&& Objects.equals(desc, other.desc) && Objects.equals(sessoId, other.sessoId)
				&& Objects.equals(societaId, other.societaId);
	}
}
