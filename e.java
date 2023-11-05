import java.util.Scanner;
class aa extends Exception {
    String m;
aa(String k) {
    super(k);
}
}

public class e {
    public static void mm(int i) throws aa
    {
        if(i>10000) {
             throw new aa("seats are filled");
        }
        else
        System.out.println("U have got a seat");
    }
    public static void main(String[] args) {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rank");
        r=sc.nextInt();
        try {
            mm(r);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
