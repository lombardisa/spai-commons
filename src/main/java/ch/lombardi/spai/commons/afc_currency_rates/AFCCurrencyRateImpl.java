package ch.lombardi.spai.commons.afc_currency_rates;

import java.util.Objects;

/**
 * Default {@link Lock} implementation.
 */
public class AFCCurrencyRateImpl implements AFCCurrencyRate {

	private static final long serialVersionUID = 4156318447193686653L;

	private String langDe;
	private String langFr;
	private String langIt;
	private String valuta;
	private Double cambio;

	/**
	 * Default empty constructor (necessary for Jackson serialization)
	 */

	public AFCCurrencyRateImpl() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param owner      The lock owner id (not null)
	 * @param entityName The locked entity name (not null)
	 * @param entityId   The locked entity id (not null)
	 * @param timeStamp  The lock acquisition date and time (not null)
	 */
	public AFCCurrencyRateImpl(String langDe, String langFr, String langIt, String valuta, Double cambio) {
		super();
		this.langDe = langDe;
		this.langFr = langFr;
		this.langIt = langIt;
		this.valuta = valuta;
		this.cambio = cambio;
	}

	@Override
	public String getLandDe() {
		return this.langDe;
	}

	@Override
	public String getLandFr() {
		return this.langFr;
	}

	@Override
	public String getLandIt() {
		return this.langIt;
	}

	@Override
	public String getValuta() {
		return this.valuta;
	}

	@Override
	public Double getCambio() {
		return this.cambio;
	}

	public void setLangDe(String langDe) {
		this.langDe = langDe;
	}

	public void setLangFr(String langFr) {
		this.langFr = langFr;
	}

	public void setLangIt(String langIt) {
		this.langIt = langIt;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public void setCambio(Double cambio) {
		this.cambio = cambio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cambio, langDe, langFr, langIt, valuta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AFCCurrencyRateImpl other = (AFCCurrencyRateImpl) obj;
		return Objects.equals(cambio, other.cambio) && Objects.equals(langDe, other.langDe)
				&& Objects.equals(langFr, other.langFr) && Objects.equals(langIt, other.langIt)
				&& Objects.equals(valuta, other.valuta);
	}

}
