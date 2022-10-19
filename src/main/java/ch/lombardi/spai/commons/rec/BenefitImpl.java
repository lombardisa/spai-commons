package ch.lombardi.spai.commons.rec;

import java.util.Arrays;
import java.util.Objects;

public class BenefitImpl implements Benefit {

	private static final long serialVersionUID = 565083839508288574L;

	// VARIABILI
	private Integer annuncioId;
	private String desc;
	private byte[] icona;
	private String iconaCodice;

	/**
	 * 
	 */
	public BenefitImpl() {
		super();
	}

	/**
	 * 
	 * @param annuncioId
	 * @param desc
	 * @param icona
	 * @param iconaCodice
	 */
	public BenefitImpl(Integer annuncioId, String desc, byte[] icona, String iconaCodice) {
		super();
		this.annuncioId = annuncioId;
		this.desc = desc;
		this.icona = icona;
		this.iconaCodice = iconaCodice;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public String getDesc() {
		return desc;
	}

	public byte[] getIcona() {
		return icona;
	}

	public String getIconaCodice() {
		return iconaCodice;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setIcona(byte[] icona) {
		this.icona = icona;
	}

	public void setIconaCodice(String iconaCodice) {
		this.iconaCodice = iconaCodice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(icona);
		result = prime * result + Objects.hash(annuncioId, desc, iconaCodice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenefitImpl other = (BenefitImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(desc, other.desc)
				&& Arrays.equals(icona, other.icona) && Objects.equals(iconaCodice, other.iconaCodice);
	}
}
