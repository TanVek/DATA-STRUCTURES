public class RemoveDups {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;
        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public LinkedList removeDup(LinkedList first) {
        LinkedList current = first;
        while(current.next != null){
            //if the next node's value is the same
            if(current.next.value == current.value){
                current.next = current.next.next;
            } else { //if different
                current = current.next;
            }
        }
        return first;
    }
    public static void main(String[] args) {

    RemoveDups list = new RemoveDups();

    // Create the nodes
    LinkedList first = new LinkedList(1);
    first.next = new LinkedList(1);
    first.next.next = new LinkedList(3);
    first.next.next.next = new LinkedList(4);
    first.next.next.next.next = new LinkedList(4);
    first.next.next.next.next.next = new LinkedList(4);
    first.next.next.next.next.next.next = new LinkedList(5);
    first.next.next.next.next.next.next.next = new LinkedList(6);
    first.next.next.next.next.next.next.next.next = new LinkedList(6);

    // Print original list
    System.out.print("Before: ");
    for (LinkedList current = first; current != null; current = current.next) {
        System.out.print(current.value + " -> ");
    }
    System.out.println("null");

    // Remove duplicates
    first = list.removeDup(first);

    // Print modified list
    System.out.print("After:  ");
    for (LinkedList current = first; current != null; current = current.next) {
        System.out.print(current.value + " -> ");
    }
    System.out.println("null");
}
}