import java.util.*;
public class inter {
    public static void main(String[] args) {
    HashMap m=new HashMap<>();
    int a[]={1,2,3,4,5};
    int b[]={2,3,4};
    int i;
    for(i=0;i<a.length;i++) 
        m.put(a[i],1);
    for(i=0;i<b.length;i++) {
        if(m.containsKey(b[i]))
        m.put(b[i],m.get((b[i])+1));
    }
    System.out.println(m);
    for(Map.Entry k:m.entrySet()) {
        if((int)k.getValue()>1)
        System.out.println(k.getKey()+" "+k.getValue());
    }
        
    }
}
