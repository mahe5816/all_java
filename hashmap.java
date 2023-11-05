import java.util.*;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int arr[] ={1,2,3,1,2,5,6,0};
        for(int i: arr)
        a.put(i,a.getOrDefault(i,0)+1);
        System.out.println(a.get(1));
        System.out.println(a.size());
        System.out.println(a.values());
        System.out.println(a.keySet());
         for(Map.Entry k : a.entrySet()) {
            if((int)k.getValue()>=1)
        System.out.println(k.getKey()+" "+k.getValue());
       }
    }
}
