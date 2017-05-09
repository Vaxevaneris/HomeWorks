package Stack;


import java.util.*;

public class ReverseStack {

//------------------------------------------------------------------------------------------------	
    public static Stack<Integer> reverse(Stack<Integer> initial) {
    	Stack<Integer> reverceStack = new Stack<Integer>();
    	int k=initial.size();
    	for (int i=0;i<k;i++){
    	    int out=initial.pop();
    	    reverceStack.push(out);
    	 }
    return reverceStack;
//-------------------------------------------------------------------------------------------------------       
    }
    
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + (reverse(myStack)));
    }
    
}