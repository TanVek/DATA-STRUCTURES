public class NodeTest1 {
    public static void main(String[] args) {
        Node<Integer> five = new Node<>(5);
        Node<Integer> one = new Node<>(1,five);
        Node<Integer> two = new Node<>(2, one);
        for(Node<Integer> current = two; current != null; current = current.next){
            System.out.print(current.data + " -> ");
        } System.out.print("null\n");
    }
}
class Node<E> {
    E data;
    Node<E> next;

    /* Constructor: initializes data to the value e,
    initializes the next Node reference to null */
    Node(E e) { this(e, null); }

    /* Constructor: initializes data to the value e,
    initializes the next Node reference to node */
    Node(E e, Node<E> node) {
        data = e;
        next = node;
    }
 
}