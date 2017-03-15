package edu.kis.vh.stacks;

/**
 * @author Błażej Lewandowski
 *
 */
public class Stack {
	final int EMPTY_STACK_VALUE = -1;//zrobione już wcześniej
	final int FULL_STACK_VALUE = 11;

	private final int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_VALUE;
	
	/**
	 * @return total number of elements
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param i number to be pushed on stack
	 */
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
	/**
	 * @return 'true' if stack is empty
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}
	
	/**
	 * @return 'true' if stack is full
	 */
	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}
		
	/**
	 * @return number from the top of the stack
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total];
	}
			
	/**
	 * @return number from the top of the stack and removes it from the stack
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total--];
	}
				
}
