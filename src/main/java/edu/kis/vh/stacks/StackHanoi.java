package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int valueToPush) {
		if (!isEmpty() && valueToPush > top())
			totalRejected++;
		else
			super.push(valueToPush);
	}
}
