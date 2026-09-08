//import java.util.List;
import java.util.ArrayList;

public class ListDemo{
    public static void main(String args[]){
        //List list = new List();
    
        ArrayList list = new ArrayList();
        list.add(21); list.add(68);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}