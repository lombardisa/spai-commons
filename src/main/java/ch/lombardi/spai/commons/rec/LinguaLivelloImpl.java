package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class LinguaLivelloImpl implements LinguaLivello {

	private static final long serialVersionUID = 7093622546335418840L;

	// VARIABILI
	private Integer linguaLivelloId;
	private String desc;

	/**
	 * 
	 */
	public LinguaLivelloImpl() {
		super();
	}

	/**
	 * 
	 * @param linguaLivelloId
	 * @param desc
	 */
	public LinguaLivelloImpl(Integer linguaLivelloId, String desc) {
		super();
		this.linguaLivelloId = linguaLivelloId;
		this.desc = desc;
	}

	public Integer getLinguaLivelloId() {
		return linguaLivelloId;
	}

	public String getDesc() {
		return desc;
	}

	public void setLinguaLivelloId(Integer linguaLivelloId) {
		this.linguaLivelloId = linguaLivelloId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desc, linguaLivelloId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguaLivelloImpl other = (LinguaLivelloImpl) obj;
		return Objects.equals(desc, other.desc) && Objects.equals(linguaLivelloId, other.linguaLivelloId);
	}
}
