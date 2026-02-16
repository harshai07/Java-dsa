package stack;
import  java.util.Stack;

public class stackImp {
    public static void main(String[] args) {
        Stack<Integer>stack= new Stack<>();
        stack.push(10);
        stack.push(3);
        stack.push(35);
        System.out.println("this is stack which i have pushed: "+stack); //[10,3,35]
        System.out.println(stack.peek());//It will print top element in the stack
        System.out.println(stack.pop());//remove top element
        System.out.println(stack.empty()); //return boolean value true or false here it is false because the element is present
        System.out.println(stack.pop());//removes 35 which is top element
    }
}
