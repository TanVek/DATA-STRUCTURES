import java.util.NoSuchElementException;

public class SimplifiedList<E> {
   private int n;        // size of the list
   private Node first;   // reference to the first list node

   // Private helper Node data type
   private class Node {
      E data;
      Node next;
   }

   // constructor: initializes an empty list
   public SimplifiedList() { first = null; n = 0; }

   // adds an element to the front of the list
   public void addFirst(E value) {
      Node oldfirst = first;
      first = new Node();
      first.data = value;
      first.next = oldfirst;
      n++;
   }       // See Snippet 5.7

   // adds an element to the end of the list
   public void addLast(E value) {
      if (isEmpty()) addFirst(value);
      else {
         Node current = first;
         while (current.next != null)
         current = current.next;
         Node last = new Node();
         last.data = value;
         current.next = last;
         n++;
      }
   }        // See Snippet 5.8
   // removes and returns the first list element
   public E removeFirst() {
      if (isEmpty()) throw new NoSuchElementException("The list is empty");
      E removedValue = first.data;
      first = first.next;
      n--;
      return removedValue;
   } // See Snippet 5.9

   // removes and returns the last list element
   public E removeLast() {
      if (isEmpty()) throw new NoSuchElementException("The list is empty");
      if (n == 1) // if only one node in the list
         return removeFirst();
      else { // else have at least two nodes
         Node current = first;
         while (current.next.next != null) // next to last node
            current = current.next;
         
         E removedValue = current.next.data;
         current.next = null;
         n--;
         return removedValue; 
      }
   } // See Snippet 5.10
   
   // is this list empty?
   public boolean isEmpty() {return n == 0;}

   // the size of this list (the number of its nodes)
   public int size() { return n; }

   // returns a string representation of this list
   public String toString() {
      StringBuilder s = new StringBuilder();
      if (isEmpty()) return "This list is empty ";
      Node current = first;
      while (current != null) {
         s.append(current.data + " -> ");
         current = current.next;
      }
       s.append("null");
      return s.toString();
   }
}
