import java.util.*;
public class edo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m="";
        for (int i = 0; i < s.length(); i++) {
            if(!m.contains(String.valueOf(s.charAt(i)))) {
                m += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(m);
    }
}
