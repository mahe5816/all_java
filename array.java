import java.util.*;
public class array {
    public static void main(String[] args) {
       int mv[] = {5,6,7,54,23,58,4,5};
        Arrays.sort(mv);
        for(int i=0;i<mv.length;i++)
       System.out.print(mv[i]+" ");
   //     int[] m=Arrays.copyOf(mv, 2);
        System.out.println(mv.length);
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter array elements");
        Integer arr[]=new Integer[n];
        for(i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr,Collections.reverseOrder());
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

  }
}