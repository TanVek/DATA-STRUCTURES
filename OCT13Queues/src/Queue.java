import java.util.NoSuchElementException;

public class Queue<E> {
   private Node first;    // front of queue
   private Node last;     // back of queue
   private int n;         // number of elements on queue

   // helper Node class
   private class Node {
      private E data;
      private Node next;
   }

   /* adds an element to this queue */
   public void enqueue(E data) {
      Node oldlast = last;
      Node last = new Node(); 
      last.data = data;
      last.next = null;
      if(isEmpty()) first = last;
      else oldlast.next = last;
      n++;
   }

   /* removes and returns the element least recently added to this queue */
   public E dequeue() {
      if (isEmpty()) throw new NoSuchElementException("Queue underflow");
      // YOUR CODE HERE
      E e = first.data;
      first = first.next;
      n--;
      return e;
   }

   /* returns true if this queue is empty, false otherwise */
   public boolean isEmpty() { return n == 0; }

   /* returns the number of elements in this queue */
   public int size() { return n; }

   /* returns a string representation of this queue */
   public String toString() {
      if (isEmpty()) return "This queue is empty ";
      StringBuilder s = new StringBuilder();
      for (Node x = first; x != null; x = x.next)
         s.append(x.data + " ");
      return s.toString();
   }
}
