import java.util.*;
public class excel {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
       int  n=702;
       char c=' ';
        while(n>0){
            n--;
           c=(char)((n%26)+'A');
           s.append(c);
            n=n/26;
        }
        System.out.print(s);
    }
}
 