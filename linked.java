import java.util.*;
public class linked {
    public static void main(String[] args) {
    LinkedList l=new LinkedList<>();
    System.out.println(l);
    l.add(5);
    l.addFirst("Mahe");
    System.out.println(l);
    l.addLast("hemu");
    l.addFirst("Lakshmi");
    System.out.println(l);
    Iterator it=l.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+"->");
    }
    System.out.println("null");
    }
}
