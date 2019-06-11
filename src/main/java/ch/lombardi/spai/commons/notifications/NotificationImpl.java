package ch.lombardi.spai.commons.notifications;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Default {@link Notification} implementation.
 */
public class NotificationImpl implements Notification {

	private static final long serialVersionUID = 5876897266373084585L;

	private Integer id;
	private Category category;
	private LocalDateTime dateTime;
	private String sender;
	private SenderType senderType;
	private String title;
	private String titleMessageCode;
	private String text;
	private String textMessageCode;
	private String link;
	private List<NotificationAddressee> addressees;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public String getSender() {
		return sender;
	}

	@Override
	public SenderType getSenderType() {
		return senderType;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Optional<String> getTitleMessageCode() {
		return Optional.ofNullable(titleMessageCode);
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public Optional<String> getTextMessageCode() {
		return Optional.ofNullable(textMessageCode);
	}

	@Override
	public Optional<String> getLink() {
		return Optional.ofNullable(link);
	}

	@Override
	public List<NotificationAddressee> getAddressees() {
		if (addressees != null) {
			return addressees;
		}
		return Collections.emptyList();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setSenderType(SenderType senderType) {
		this.senderType = senderType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitleMessageCode(String titleMessageCode) {
		this.titleMessageCode = titleMessageCode;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTextMessageCode(String textMessageCode) {
		this.textMessageCode = textMessageCode;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setAddressees(List<NotificationAddressee> addressees) {
		this.addressees = addressees;
	}

	public void addAddressee(NotificationAddressee addressee) {
		if (addressee != null) {
			if (addressees == null) {
				addressees = new LinkedList<>();
			}
			addressees.add(addressee);
		}
	}

}
