import java.util.HashSet;
import java.util.*;
import java.util.Collections;
public class hash {
    public static void main(String[] args) {
   /*  int sum=0;
    String s="Mahe";
    for(int i=0;i<s.length();i++)
    sum=sum+(int)s.charAt(i);
    System.out.println(sum);
    */
    HashSet s=new HashSet<>();
    s.add(5);
    s.add(6);
    s.add(5);
    s.add(6);
    s.add(1);
    s.add(2);
    System.out.println(s+" "+s.size());
      Iterator it=s.iterator();
    while(it.hasNext()) {
        int n=(int)it.next();
        System.out.println(n);
    }
   // s.remove(1);

  //  Collections.sort(s);
    System.out.println(s+" "+s.size());
  //  ArrayList a=new ArrayList<>(s);
   // Collections.sort(a);
    //System.out.println(a);
 
    }
}
