/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

class node {     //atau node/simpul

    public int data; // data item
    public node next; // next node link in list
    public node prev; // previous node link in list

    public node(int id) // constructor
    {
        data = id; // initialize data
    } // set to null)

    public void displayLink() // display ourself
    {
        System.out.print("{ " + data + "} ");
    }
} // end class Link

public class StackLinkList {

    private node top; // ref to first link on list
    private node bottom; // ref to last link on list

    public StackLinkList() // constructor
    {
        top = bottom = null; // no items on list yet
    }

    public boolean isEmpty() // true if list is empty
    {
        return (top == null);
    }

    public void push(int id) //node baru selalu di top
    { // make new link
        node newitem = new node(id);
        if (top == null) // the first node created
        {
            top = bottom = newitem; // first –> newLink
        } else // the second node and the next node
        {
            top.next = newitem; //next dr top (awal) diarahkan ke node baru
            newitem.prev = top; //prev dr node baru diarahkan ke tail (awal)
            top = newitem; //top (baru) diarahkan ke node baru
        }
    }

    public node pop() // delete first item
    {
        node temp = null;
        if (top == null) // stack is empty
        {
            System.out.println("Stack is empty");
        } else if (top == bottom) { // stack is only one data
            temp = top;
            top = bottom = null;
        } else { // stack has more than one data
            temp = top; // save reference to link
            top = top.prev; // delete it: first–>old next
            top.next = null;
        }
        return temp;
    }

    public void display() {
        node current = bottom; // start from the first data
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
} // end class LinkList

class StackLinkListApp {

    public static void main(String[] args) {
        StackLinkList theStack = new StackLinkList(); // make new list
        System.out.println("Initializing Stack...");
        theStack.push(22); // insert four items
        theStack.push(44);
        theStack.push(66);
        theStack.push(88);
        System.out.println("Display Forward :");
        theStack.display(); // display list
        System.out.println("Delete Stack from Top...");

        while (!theStack.isEmpty()) { // until it’s empty,
            node aLink = theStack.pop(); // delete link
            System.out.print("Deleted "); // display it
            aLink.displayLink();
            System.out.println("");
        }

        theStack.display(); // display list
    } // end main()
}
