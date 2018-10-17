import java.util.*;
public class StackOfInts {
	
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	//construct a stack with the default capacity of 16
	public StackOfInts() {
		this(DEFAULT_CAPACITY);
	}
	
	//construct a stack with the specified maximum capacity
	public StackOfInts(int capacity) {
		elements = new int[capacity];
	}
	
	//push a new integer to the top of the stack
	public void push(int value) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = value;
	}
	
	//return and remove the top element rom the stack
	public int pop() {
		return elements[--size];
	}
	
	//return the top element from the stack but do not remove
	public int peek() {
		return elements[size -1];
	}
	//test whether the stack is empty
	public boolean empty() {
		return size ==0;
	}
	
	//return the number of elements in the stack
	public int getSize() {
		return size;
	}

}
