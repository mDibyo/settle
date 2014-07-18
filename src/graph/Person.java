package graph;

public class Person {

	protected String firstName;
	protected String lastName;
	public final String userId;
	private String password;
	public String email;
	
	/**
	 * Create a new person in the system
	 * @param userId The userId of the person
	 * @param password The password of the person
	 * @param email The email address of the person
	 */
	protected Person(String userId, String password, String email) {
		this.userId = userId;
		this.password = password;
		this.email = email;
	}
	
	/**
	 * Authenticate the user
	 * @param password The password entered by the user
	 * @return whether the authentication succeeded
	 */
	protected boolean isUser(String password) {
		return this.password.equals(password);
	}
	
	/**
	 * Returns a string representation of the Person
	 * @return userId of a person
	 */
	@Override
	public String toString() {
		return this.userId;
	}
	
	/**
	 * Set first name of person
	 * @param firstName The first name of the person
	 */
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Set last name of person
	 * @param lastName The last name of the person
	 */
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Set email of person
	 * @param email The email of person
	 */
	protected void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Set password of person
	 * @param oldPassword The old password of person
	 * @param newPassword The new password of person
	 * @return Whether the operation succeeded
	 */
	protected boolean setPassword(String oldPassword, String newPassword) {
		if (this.password.equals(oldPassword)) {
			this.password = newPassword;
			return true;
		}
		return false;
	}
	
}
