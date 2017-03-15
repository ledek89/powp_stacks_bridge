package edu.kis.vh.stacks.list;

public class Node {

	private int value;		//po hermetyzacji pól, dostęp do nich z StackList odbywa się poprzez gettery i settery
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}
	
}
