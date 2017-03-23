package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	final int EMPTY_STACK_VALUE = -1;
	final int FULL_STACK_VALUE = 11;

	private final int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_VALUE;
	
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}
		
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total];
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total--];
	}

}
