package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

//dzięki zmianie możemy wykorzystywać dowolną klasę implementującą intefejs IStack

public class Stack {
	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}
	
	public Stack(){
		this.stackList = new StackList();
	}

	
	private IStack stackList;

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}
			
}
