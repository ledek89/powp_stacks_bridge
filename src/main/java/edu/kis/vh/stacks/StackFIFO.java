package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStack stackList) {
		super(stackList);
		// TODO Auto-generated constructor stub
	}

	//najlepsza bedzie StackList ze względu na mechanizm usuwania elementów
	private final Stack temp = new Stack(new StackList());
	
	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		
		int poppedOutValue = temp.pop();
		
		while (!temp.isEmpty())
			push(temp.pop());
		
		return poppedOutValue;
	}
}
