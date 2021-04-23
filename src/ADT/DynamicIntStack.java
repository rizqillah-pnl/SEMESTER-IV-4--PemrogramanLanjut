/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

class DynamicIntStack {
    private IntStackNode top;

    /* head or top of the stack */
    class IntStackNode {

        /* node class */
        int data;
        IntStackNode next;

        IntStackNode(int n) {
            data = n;
            next = null;
        }
    }

    void push(int n) {
        /* no need to check for overflow */
        IntStackNode node = new IntStackNode(n);
        node.next = top;
        top = node;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
            /* may throw a user-defined exception */
        } else {
            int n = top.data;
            top = top.next;
            return n;
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String args[]) {
        DynamicIntStack myStack = new DynamicIntStack();
        myStack.push(5);
        myStack.push(10);
        /* print elements of the stack */
        IntStackNode currNode = myStack.top;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
