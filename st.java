import java.util.*;
public class st {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if(!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }   
        System.out.println(result);
    }
}
/*import java.util.*;
class st{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String[] m=new String[10];
        int j=0;
        for(int i=0;i<s.length;i++){
            if(!String.valueOf(m).contains(s[i])){
            m[j]=s[i];
            j++;
            }
        }
        for(j=0;m[j]!=null;j++){
            System.out.println(m[j]);
        }
    }
}
/*import java.util.*;
class st{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet h=new TreeSet();
        String[] s=sc.nextLine().split(" ");
        for(int i=0;i<s.length;i++)
        h.add(s[i]);
        System.out.println(h);
        Iterator it=h.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
*/