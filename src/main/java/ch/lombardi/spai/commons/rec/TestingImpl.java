package ch.lombardi.spai.commons.rec;

import java.util.Objects;

public class TestingImpl implements Testing {

	private static final long serialVersionUID = -3956289421486706098L;

	// VARIABILI
	private Integer testingId;
	private String title;
	private String body;

	/**
	 * 
	 */
	public TestingImpl() {
		super();
	}

	/**
	 * 
	 * @param testingId
	 * @param title
	 * @param body
	 */
	public TestingImpl(Integer testingId, String title, String body) {
		super();
		this.testingId = testingId;
		this.title = title;
		this.body = body;
	}

	public Integer getTestingId() {
		return testingId;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public void setTestingId(Integer testingId) {
		this.testingId = testingId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, testingId, title);
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
		return Objects.equals(body, other.body) && Objects.equals(testingId, other.testingId)
				&& Objects.equals(title, other.title);
	}
}
