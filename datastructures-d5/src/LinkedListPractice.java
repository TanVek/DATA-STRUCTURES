public class LinkedListPractice {
    Node first; // reference to the first node
    class Node {
        Object data;
        Node next;
    }
    /* adds an item to the front of the list */
    void add(Object item) {
        Node oldfirst = first;
        first = new Node();
        first.data = item;
        first.next = oldfirst;
    }
    Node findMiddle(){
        Node increment = first;
        Node increment2 = first;
        while (increment2 != null && increment2.next != null) {
            increment = increment.next;
            increment2 = increment2.next.next;
        }
        return increment;
    }
    void reverse(){
        Node previous = null;
        Node current = first;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }   

        first = previous;

        
    }
    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list.add(8); list.add(6); list.add(1); list.add(2);
        for (Node x = list.first; x != null; x = x.next) System.out.print(x.data + " -> ");
        System.out.print("null\n");

        Node middle = list.findMiddle();
        System.out.println("Middle node: " + middle.data);
        
        list.reverse();
        for (Node x = list.first; x != null; x = x.next) System.out.print(x.data + " -> ");
        System.out.print("null\n");
    }
}
