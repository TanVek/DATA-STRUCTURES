import java.util.Queue;
public class QueueClient1 {
   public static void main(String[] args) {
      Queue<String> queue = new Queue<>();
      String[] input = {"to", "be", "or", "not", "to",
            "-", "be", "-", "-", "that",
            "-", "-", "-", "is"};
      for (String s : input) {
         if (!s.equals("-")) queue.enqueue(s);
         else if (!queue.isEmpty())
            System.out.print(queue.dequeue() + " ");
      }
      System.out.print("(" + queue.size() + " left on queue)");
   }
}
