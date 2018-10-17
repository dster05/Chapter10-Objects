import java.util.*;
public class TestStackOfInts {
	
	public static void main(String[] args) {
		StackOfInts stack = new StackOfInts();
		//push numbers from 0 - 9 on to stack
		for(int i = 0; i < 10 ; i++) {
			stack.push(i);
		}
		//pop number from 9-0 from stack lifo
		while((!stack.empty()))
			System.out.print(stack.pop()+  " ");
	}

}
