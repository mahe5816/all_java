import java.util.*;
public class countsos {
    static int count(int[] arr,int tar,int start){
        if(tar==0)
        return 1;
        if(tar<0)
        return 0;
        if(start>=arr.length)
        return 0;
        return count(arr,tar-arr[start],start+1)+count(arr,tar,start+1);
    }
    static void another(int[] arr){
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        for(int i=0;i<(1<<arr.length-1);i++){
            List<Integer> b=new ArrayList<Integer>();
            for(int j=0;j<arr.length;j++){
                if(((i>>j)&1)==1)
                b.add(arr[j]);
            }
            a.add(b);
        }
        System.out.println(a);
    }
    static void backtrack(List<List<Integer>> list,List<Integer> a,int tar,int start,int[] arr){
        if(tar<0)
        return;
        else if(tar==0){
         if(!list.contains(a))
          list.add(a);
        }
        else{
            for(int i = start; i < arr.length; i++){
                a.add(arr[i]);
                backtrack(list,a,tar-arr[i],i,arr);
                a.remove(a.size() - 1);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] a={20,10,15,5,25};
        System.out.println(count(a,25,0));
        another(a);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> b=new ArrayList<Integer>();
        backtrack(list,b,25,0,a);
    }
}
