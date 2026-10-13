/* Stack.java implements the stack data structure.
   Stack is Iterable and stores items of generic type. */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> implements Iterable<E>{
   private Node first;   // reference to the first node
   private int n;           // the number of items on this stack

   /* Node is a static nested private helper class. */
   private class Node {
      E data;
      Node next;
   }

   /* adds an item to the top of this stack */
   public void push(E item) {
      // IMPLEMENT THIS METHOD
      Node oldFirst = first;
      first = new Node();
      first.data = item;
      first.next = oldFirst;
      n++;
   }

   /* removes and returns the top element from this stack */
   public E pop() {
      if(isEmpty()) throw new NoSuchElementException("Stack underflow");
      E e = first.data;
      first = first.next;
      n--;
      // IMPLEMENT THIS METHOD
      return e; // CHANGE THIS LINE
   }

   /* returns the top element of this stack without removing it */
   public E peek() {
      if(isEmpty()) throw new NoSuchElementException("Stack underflow");
      // IMPLEMENT THIS METHOD
      return null; // CHANGE THIS LINE
   }

   /* returns true if this stack is empty, false otherwise */
   public boolean isEmpty() { return n == 0; }

   /* returns the number of elements on this stack */
   public int size() { return n; }

   /* Returns an iterator to this stack;
      iterates through the items in LIFO order. */
   public Iterator<E> iterator() { return new StackIterator(first); }

   // stack iterator helper class
   private class StackIterator implements Iterator<E> {
      private Node current;
      public StackIterator(Node first) { current = first; }
      public boolean hasNext() { return current != null; }
      public E next() {
         if (!hasNext()) throw new NoSuchElementException();
         E item = (E) current.data;
         current = current.next;
         return item;
      }
   }

   /* returns a String representation of this stack */
   public String toString() {
      StringBuilder s = new StringBuilder();
      if (isEmpty()) return "This stack is empty ";
      for (E element: this) {
         s.append(element + "  ");
      }
      return s.toString();
   }
}
