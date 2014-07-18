package graph;

import java.util.LinkedList;

public class TransactionHistory {

	protected Person[] personPair;
	protected LinkedList<Transaction> history;
	
	protected TransactionHistory(Person p1, Person p2,
			LinkedList<Transaction> transactions) {
		personPair = new Person[] { p1,	p2 };
		history = transactions;
	}
	
	protected TransactionHistory(Person p1, Person p2) {
		personPair = new Person[] { p1,	p2 };
		history = new LinkedList<Transaction>();
	}
	
}
