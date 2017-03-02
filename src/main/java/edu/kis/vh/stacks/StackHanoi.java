package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void push(int valueToPush) {
		if (!isEmpty() && valueToPush > top())
			totalRejected++;
		else
			super.push(valueToPush);
	}
}
