/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

public class StackOrder { // sequential stack

    static int curr = -1; // point to the bottom of the stack
    static int[] stack = new int[10];

    public static void main(String[] args) {
        push(1);
        push(2);
        pop();
        pop();
        pop();
    }

    public static void push(int data) {
        if (curr++ < 9) // Determine if the stack is full
        {
            stack[curr] = data; //Into the stack
        } else {
            System.out.println("out of stack");
        }
    }

    public static void pop() {
        if (curr > -1) { // Determine whether the stack is empty
            System.out.println(stack[curr]); // Pop
            curr--;
        } else {
            System.out.println("null");
        }
    }
}
