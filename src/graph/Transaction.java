package graph;

import java.util.Date;

public class Transaction {

	protected Person from;
	protected Person to;
	protected float amount; // This is only in dollars (currently)
	protected Date timestamp;
	
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
		this.timestamp = new Date();
	}
	
	/**
	 * Returns the transaction in human-readable form
	 * @return String representation of this Transaction
	 */
	@Override
	public String toString() {
		String str = this.timestamp.toString() + ": ";
		str += this.from;
		str += "=[" + String.format("%.2f", this.amount) + "]=>";
		str += this.to;
		return str;
	}
	
	/**
	 * Returns whether two Transactions refer to the same event
	 * @param that the other Transaction being compared
	 * @return true if the transactions refer to the same event,
	 * 		false otherwise
	 */
	@Override
	public boolean equals(Object other) {
		if (other instanceof Transaction) {
			Transaction that = (Transaction) other;
			if (this.timestamp.equals(that.timestamp)) {
				if (this.to.equals(that.to) && this.from.equals(this.from)) {
					if (this.amount == that.amount) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
