package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueUsingTwoStack {
    static class Queue{
        static Stack<Integer>s1=new Stack<>();
         static Stack<Integer>s2=new Stack<>();
        public static boolean isEmpty(){
            return  s1.isEmpty();
        }
        public static void add(int data){
            while (!isEmpty()){
                s2.push(s1.pop());
            }
            s1.add(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

    }

    public static void main(String[] args) {
        java.util.Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }


}
