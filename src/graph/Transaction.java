package graph;

public class Transaction {

	protected Person from;
	protected Person to;
	protected float amount; // This is only in dollars (currently)
	
	/**
	 * Create a transaction between two persons
	 * @param from The person who has to pay
	 * @param to The person who has to be paid
	 * @param amount The amount to be paid
	 */
	protected Transaction(Person from, Person to, float amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	
}
