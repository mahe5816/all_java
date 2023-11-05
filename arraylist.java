import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
ArrayList<Integer> l=new ArrayList<Integer>();
         l.add(50);
         l.add(10);
         System.out.println(l);
         l.get(1);
         l.add(2,16);
         l.remove(0);
         Collections.sort(l);
         System.out.println(l);
    }
}
