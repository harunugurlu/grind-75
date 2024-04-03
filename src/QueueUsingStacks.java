import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();

    public QueueUsingStacks() {
    }

    public void push(int x) {
        st1.push(x);
        // System.out.println("pushed x: " + x);
        // for(Integer i : st1) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
    }

    public int pop() {
        while(!st1.empty()) {
            st2.push(st1.pop());
        }
        int x = st2.pop();
        while(!st2.empty()) {
            st1.push(st2.pop());
        }
        // System.out.println("popped x: " + x);
        // for(Integer i : st1) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        return x;
    }

    public int peek() {
        while(!st1.empty()) {
            st2.push(st1.pop());
        }
        int x = st2.peek();
        while(!st2.empty()) {
            st1.push(st2.pop());
        }
        // System.out.println("peeked x: " + x);
        // for(Integer i : st1) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        return x;
    }

    public boolean empty() {
        return st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */