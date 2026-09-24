public class circle {
    public static void main(String[] args) {
        SimplifiedList<Integer> list = new SimplifiedList<>();
        for(int i = 1; i < 9; i++)
        {
             list.addLast(i);
        }
        int r;
        while(list.size() != 1){
            for(int j = 0; j < 5; j++)
            {
                r = list.removeFirst();
                list.addLast(r);
            }
            System.out.println(list.removeFirst());
        }
        
    }
}
