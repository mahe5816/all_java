
import java.util.*;
public class bin {
    public static void main(String[] args) {
        int a=500,r;
        Stack s=new Stack<>();
        while(a>0) {
            r=a%2;
            s.push(r);
            a=a/2;
        }
        System.out.println(s);
        int i,m=0,j=1;
        for(i=s.size()-1;i>=0;i--) {
            m=m+(int)s.pop()*((int)Math.pow(2,i));
        }
        System.out.println(m);
        int k=Integer.parseInt("111110100",2);
        System.out.println(k);
    }
}
