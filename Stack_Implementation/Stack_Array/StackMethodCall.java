package Stack_Array;

import java.util.Stack;

public class StackMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StackOperations stack=new StackOperations(4);
   System.out.println(stack.topOfStack);
   System.out.println(stack.isFull());
   System.out.println(stack.isEmpty());
   stack.push(0);
   stack.push(1);
   stack.push(2);
   stack.push(3);
   stack.peek();
   stack.pop();
   stack.pop();
   stack.peek();
   stack.deleteStack();
   //System.out.println(stack.arr[stack.topOfStack]);
//   System.out.println(stack.topOfStack);
//   stack.push(4);
//   stack.pop();
//   System.out.println(stack.topOfStack);
//   stack.pop();
//   System.out.println(stack.topOfStack);
//   stack.pop();
//   System.out.println(stack.topOfStack);
//   stack.pop();
//   System.out.println(stack.topOfStack);
//   stack.pop();
//   System.out.println(stack.topOfStack);
	}

}
