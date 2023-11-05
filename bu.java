import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class bu {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a[]=br.readLine().split(",");
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int s=m+n;
        System.out.println(s);
    }
}
