import java.util.*;
class rotate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,5,7,8};
        int p=3;
        int b[]=new int[arr.length];
        int z=0,m=(arr.length)-1;
        for(int k=p;k>0;k--){
            b[z]=arr[m];
            m--;
            z++;
        }
        for(int k=0;k<b.length;k++)
        System.out.print(b[k]);
    }
}
