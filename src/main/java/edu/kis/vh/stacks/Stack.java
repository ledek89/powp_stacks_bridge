package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

//dzięki zmianie możemy wykorzystywać dowolną klasę implementującą intefejs IStack

//F3 przenosi nas do deklaracji metody w interfejsie
//ctrl + t ukazuje nam interfejsy oraz klasy w ktorych zaimplementowana daną metodę
//po najechaniu kursorem myszy na daną metodę przy wcisniejszym klawiszu ctrl, możemy wybrać czy chcemy przenieść się w miejsce
//gdzie metoda została zadeklarowana, bąd przejrzeć implementacje danej metody w roznych klasach

public class Stack {
	public Stack(IStack stackList) {
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
