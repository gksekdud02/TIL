
class Stack{
    	 int top;
    	 int[] stack;
    	 int size;
    	 public Stack(int size) {
    		 this.size =size;
    		 stack  = new int[size];
    		 top=-1;
    	 }
    	 public void push(int item) {
    		 stack[++top] = item;
    		 System.out.println(stack[top] + " push");
    	 }
    	 public void peek() {
    		 if(size != 0) {
    			 System.out.println(stack[top] + " peek");
    		 }
    	 }
    	 public void pop() {
    		 if(size != 0) {
    			 System.out.println(stack[top] + " pop");
    			 stack[top--] =0;
    		 }
    	 }
    	 public int sizeof() {
    		 return top+1;
    	 }
}

public class h2 {
     public static void main(String[] args) {
    	 Stack S = new Stack(5);
    	 S.push(7);
    	 S.push(6);
    	 S.push(9);
    	 S.push(1);
    	 S.push(5);
    	 S.peek();
    	 S.pop();
    	 System.out.println(S.sizeof()); 
    }
}
