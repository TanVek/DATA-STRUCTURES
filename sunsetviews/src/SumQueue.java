import java.util.*;

 public class SumQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5 ; i++)
        queue.add(i);
        System.out.println(queue); // [1, 2, 3, 4, 5]
        System.out.println(sumNew(queue)); // What prints here? Why?
        System.out.println(queue); // What prints here? Why?
        /*
        Queue<Integer> example6a = new LinkedList<>();
        example6a.add(1);
        example6a.add(-2);
        example6a.add(3);
        example6a.add(-4);
        example6a.add(5);
        example6a.add(-6);
        whatDoIDo2(example6a);
        //[ 40, 20, 10, 50, 30, 8, 3, 0 
        Queue<Integer> example6b = new LinkedList<>();
        example6b.add(22);
        example6b.add(-7);
        example6b.add(4);
        example6b.add(17);
        example6b.add(9);
        example6b.add(53);
        whatDoIDo2(example6b);
        Queue<Integer> example6c = new LinkedList<>();
        example6c.add(-40);
        example6c.add(-20);
        example6c.add(10);
        example6c.add(50);
        example6c.add(30);
        example6c.add(-8);
        example6c.add(-3);
        example6c.add(0);
        whatDoIDo2(example6c);*/
        int n = 50;
        Stack<Integer> s = new Stack<>();
        while (n > 0) {
        s.push(n % 2);
        n = n / 2;
        }
        while (!s.isEmpty())
        System.out.print(s.pop());
    }

    public static int sum(Queue<Integer> q) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            int n = q.remove();
            sum += n;
        }
        return sum;
    }
    public static int sumNew(Queue<Integer> q) {
        int sum = 0;
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int n = q.remove();
            sum += n;
        }
        return sum;
    }
    public static void whatDoIDo1(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < q.size(); i++) {
            int b = q.remove();
            if (b % 2 == 0) s.push(b);
            else q.add(b);
        }
        System.out.println(q + " " + s);
    }
    public static void whatDoIDo2(Queue<Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            int b = q.remove();
            if (b > 0) q.add(-b);
        }
        System.out.println(q);
    }
}
