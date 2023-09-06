package ch.lombardi.spai.commons.afc_currency_rates;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Notification.
 */
//@JsonDeserialize(as = NotificationImpl.class)
@XmlRootElement
public interface AFCCurrencyRate extends Serializable {

	String getLandDe();

	String getLandFr();

	String getLandIt();

	String getValuta();

	Double getCambio();

}
