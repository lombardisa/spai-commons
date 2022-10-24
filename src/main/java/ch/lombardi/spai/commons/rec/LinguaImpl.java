package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class LinguaImpl implements Lingua {

	private static final long serialVersionUID = -5639711708140896060L;

	// VARIABILI
	private Integer linguaId;
	private String desc;

	/**
	 * 
	 */
	public LinguaImpl() {
		super();
	}

	/**
	 * 
	 * @param linguaId
	 * @param desc
	 */
	public LinguaImpl(Integer linguaId, String desc) {
		super();
		this.linguaId = linguaId;
		this.desc = desc;
	}

	public Integer getLinguaId() {
		return linguaId;
	}

	public String getDesc() {
		return desc;
	}

	public void setLinguaId(Integer linguaId) {
		this.linguaId = linguaId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desc, linguaId);
	}

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
