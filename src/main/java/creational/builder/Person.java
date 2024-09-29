package creational.builder;

public class Person {

	private String name;
	private String emailId;

	private Person(Builder builder) {
		this.name = builder.name;
		this.emailId = builder.emailId;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	static class Builder {
		private String name;
		private String emailId;

		public Builder() {

		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public Person build() {
			Person p = new Person(this);
			return p;
		}

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", emailId=" + emailId + "]";
	}
	
}
