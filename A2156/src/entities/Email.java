package entities;

public class Email {
	private String email, email2, email3, email4;

	public Email() {

	}

	public Email(String email) {
		this.email = email;
	}

	public Email(String email, String email2) {
		this.email = email;
		this.email2 = email2;
	}

	public Email(String email, String email2, String email3) {
		this.email = email;
		this.email2 = email2;
		this.email3 = email3;
	}

	public Email(String email, String email2, String email3, String email4) {
		this.email = email;
		this.email2 = email2;
		this.email3 = email3;
		this.email4 = email4;
	}

}