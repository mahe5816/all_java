import java.util.*;
public class matches {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k,i;
        System.out.println("Enter array suize :");
        k=sc.nextInt();
        int[] m=new int[k];
        for(i=0;i<m.length;i++)
        m[i]=sc.nextInt();
        Arrays.sort(m);
        System.out.println(m[0]);
        int in=0;
       // int[] zi= new int[k];
        for(i=0;i<m.length;i++){
            if(m[i]==m[i+1]){
                in++;
            }
        }
         System.out.println(in);                                                                      

    }
}
