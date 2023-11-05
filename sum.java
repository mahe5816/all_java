import java.util.*;
public class sum {
    static int sum(int m[]) {
        int s=0;
        for(int i=0;i<m.length;i++) {
        s=s+m[i];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter n value");
        r=sc.nextInt();
        int a[]=new int[r];
        for(int t=0;t<r;t++){
            a[t]=sc.nextInt();
        }
        int x=sum(a);
        System.out.println(x);
        Arrays.sort(a);
        for(int z=0;z<a.length;z++)
        System.out.print(a[z]);
    }
}
