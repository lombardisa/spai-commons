package ch.lombardi.spai.commons.notifications;

import java.time.LocalDateTime;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Default {@link NotificationAddresseeGruppi} implementation.
 */
public class NotificationAddresseeGruppiImpl implements NotificationAddresseeGruppi {

	/**
	 * UID
	 */
	private static final long serialVersionUID = -3496036238676939077L;

	// VARIABLES
	private Integer sequence;
	private Type type;
	private Integer company;
	private String mail;
	private Status status;
	private LocalDateTime sentDateTime;
	private String error;
	private String errorMessageCode;
	private String evasa;

	@Override
	public Integer getSequence() {
		return sequence;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public Optional<Integer> getCompany() {
		return Optional.ofNullable(company);
	}

	@Override
	public Optional<String> getMail() {
		return Optional.ofNullable(mail);
	}

	@Override
	public Status getStatus() {
		return status;
	}

	@Override
	public Optional<LocalDateTime> getSentDateTime() {
		return Optional.ofNullable(sentDateTime);
	}

	@Override
	public Optional<String> getError() {
		return Optional.ofNullable(error);
	}

	@Override
	public Optional<String> getErrorMessageCode() {
		return Optional.ofNullable(errorMessageCode);
	}

	@Override
	public Optional<String> getEvasa() {
		return Optional.ofNullable(evasa);
	}

	@JsonProperty("sequence")
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setCompany(Integer company) {
		this.company = company;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setSentDateTime(LocalDateTime sentDateTime) {
		this.sentDateTime = sentDateTime;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setErrorMessageCode(String errorMessageCode) {
		this.errorMessageCode = errorMessageCode;
	}

	public void setEvasa(String evasa) {
		this.evasa = evasa;
	}

}