public class NodeTest {
    public static void main(String[] args) {
        //Code for example 5.1
        SimplifiedList<Integer> list = new SimplifiedList<>();
        //Add values
        list.addLast(2);
        list.addLast(1);
        list.addLast(5);
        //Print list TEST
        System.out.println(list); //Output 2 -> 1 -> 5 -> null
        int length = list.size();
        for(int i = 0; i < length; i++){
            System.out.print(list.removeFirst());
            System.out.print(" -> ");
        }   System.out.print("null\n");

        // This part just re adds the numbers to the code
        list.addLast(2);
        list.addLast(1);
        list.addLast(5);

        while(list.size() != 0){
            System.out.print(list.removeFirst());
            System.out.print(" -> ");
        }   System.out.print("null\n");

        //Exercise 5.3
        //Assumably that the node.next = node.next.next is in bound, this code 
        // sets the next node to the node following the next node
        
        //Exercise 5.4
        SimplifiedList<Integer> list2 = new SimplifiedList<>();
        list2.addLast(1);
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(4);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(6);
        System.out.println("Before: " + list2);
    }   
}
