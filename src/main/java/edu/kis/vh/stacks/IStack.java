package edu.kis.vh.stacks;

public interface IStack {

	//pomogła, gdyż wystarczyło teraz zmienić jedynie wartosc we wspólnym interfejsie(łatwo, szybko i przyjemnie)
	
	final int EMPTY_STACK_VALUE = 0;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}