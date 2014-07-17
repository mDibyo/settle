package graph;

public class Person {

	protected String firstName;
	protected String lastName;
	public String userId;
	private String password;
	
	public Person(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	boolean isUser(String password) {
		return this.password.equals(password);
	}
	
}
