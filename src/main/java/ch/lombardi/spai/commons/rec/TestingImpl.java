package ch.lombardi.spai.commons.rec;

import java.util.Arrays;
import java.util.Objects;

public class TestingImpl implements Testing {

	private static final long serialVersionUID = 2520935777746606343L;

	// VARIABILI
	private Integer annuncioId;
	private Integer refPrincId;
	private String nomeRefPrinc;
	private String conomeRefPrinc;
	private byte[] fotoRefPrinc;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */
	public TestingImpl() {
		super();
	}

	public TestingImpl(Integer annuncioId, Integer refPrincId, String nomeRefPrinc, String conomeRefPrinc,
			byte[] fotoRefPrinc) {
		super();
		this.annuncioId = annuncioId;
		this.refPrincId = refPrincId;
		this.nomeRefPrinc = nomeRefPrinc;
		this.conomeRefPrinc = conomeRefPrinc;
		this.fotoRefPrinc = fotoRefPrinc;
	}

	public Integer getAnnuncioId() {
		return annuncioId;
	}

	public Integer getRefPrincId() {
		return refPrincId;
	}

	public String getNomeRefPrinc() {
		return nomeRefPrinc;
	}

	public String getConomeRefPrinc() {
		return conomeRefPrinc;
	}

	public byte[] getFotoRefPrinc() {
		return fotoRefPrinc;
	}

	public void setAnnuncioId(Integer annuncioId) {
		this.annuncioId = annuncioId;
	}

	public void setRefPrincId(Integer refPrincId) {
		this.refPrincId = refPrincId;
	}

	public void setNomeRefPrinc(String nomeRefPrinc) {
		this.nomeRefPrinc = nomeRefPrinc;
	}

	public void setConomeRefPrinc(String conomeRefPrinc) {
		this.conomeRefPrinc = conomeRefPrinc;
	}

	public void setFotoRefPrinc(byte[] fotoRefPrinc) {
		this.fotoRefPrinc = fotoRefPrinc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fotoRefPrinc);
		result = prime * result + Objects.hash(annuncioId, conomeRefPrinc, nomeRefPrinc, refPrincId);
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
		TestingImpl other = (TestingImpl) obj;
		return Objects.equals(annuncioId, other.annuncioId) && Objects.equals(conomeRefPrinc, other.conomeRefPrinc)
				&& Arrays.equals(fotoRefPrinc, other.fotoRefPrinc) && Objects.equals(nomeRefPrinc, other.nomeRefPrinc)
				&& Objects.equals(refPrincId, other.refPrincId);
	}
}
