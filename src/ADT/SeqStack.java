/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

class SeqStack {

    int top = -1;
    /* initially, the stack is empty */
    int memSpace[];
    /* storage for integers */
    int limit;
    /* size of memSpace */

    SeqStack() {
        memSpace = new int[10];
        limit = 10;
    }

    SeqStack(int size) {
        memSpace = new int[size];
        limit = size;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == memSpace.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int length() {
        return top + 1;
    }


    boolean push(int value) {
        top++;
        /* check if the stack is full */
        if (top < limit) {
            memSpace[top] = value;
        } else {
            top--;
            return false;
        }
        return true;
    }

    int pop() {
        int temp = -1;
        /* check if the stack is empty */
        if (top >= 0) {
            temp = memSpace[top];
            top--;
        } else {
            return -1;
        }
        return temp;
    }

    public static void main(String args[]) {
        SeqStack myStack = new SeqStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println("Panjang Stack : " + myStack.length());
        System.out.print("{" + myStack.pop() + "}");
        System.out.print("{" + myStack.pop() + "}");
        System.out.print("{" + myStack.pop() + "}");
        System.out.print("{" + myStack.pop() + "}");
        System.out.println("\nPanjang Stack : " + myStack.length());
    }
}
