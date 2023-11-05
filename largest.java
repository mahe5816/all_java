import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s; 
        int j,k=0;
        s=sc.nextLine().split(" ");
        int[] m=new int[s.length];
        for(int i=0;i<s.length;i++){
            m[i]=s[i].length();
        }
        for(int i=0;i<m.length;i++){
            for(j=i+1;j<m.length;j++){
                if(m[i]>m[j]){
                    int temp1=m[i];
                    m[i]=m[j];
                    m[j]=temp1;
                    String temp2=s[i];
                    s[i]=s[j];
                    s[j]=temp2;
                }
            }
        }
        for(int i=0;i<m.length;i++)
        System.out.print(m[i]+" ");
        System.out.println(s[s.length-1]+" "+s[s.length-1].length()+" "+s[0]+" "+s[0].length());
    }
}
