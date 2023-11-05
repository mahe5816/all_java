import java.util.*;
public class bst {
    static class node{
        int data;
        node left,right;
        node(int data){
            this.data=data;
        }
        node(int data,node left,node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    static class tree{
        static node insert(node root,int val){
        if(root==null){
            root=new node(val);
            return root;
        }
        if(root.data>val){
        root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
            
        }
        return root;
    }
    static void inorder(node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
}
static List<node> number(int start,int stop){
        List<node> list=new ArrayList<node>();
        if(start>stop){
         list.add(null);
        return list;
        }
        for(int i=start;i<=stop;i++){
            List<node> left=number(start,i-1);
            List<node> right=number(i+1,stop);
            for(node l:left){
                for(node r:right){
                    node p=new node(i,l,r);
                    list.add(p);
                }
            }
        }
        return list;
    }
    static void printtree(node root,String pre){
        if(root==null)
        return ;
        System.out.println(pre+" "+root.data);
        printtree(root.left,"l--");
        printtree(root.right,"r--");
    }
    static void count(int n){
        List<node> c=number(1,n);
        System.out.println(c.size());
        int k=1;
        for(node p:c){
            System.out.println("Tree : "+k);
            k++;
            printtree(p,"root--");
        }
    }
    public static void main(String[] args) {
        tree a=new tree();
        node root=null;
        tree b=new tree();
        int[] values={5,4,2,7,8,1};
        for(int i=0;i<values.length;i++)
        root=a.insert(root,values[i]);
        System.out.println(root.left.left.data);
        a.inorder(root);
        System.out.print("Enter n value : ");
        Scanner se=new Scanner(System.in);
        int n=se.nextInt();
        count(n);
    }
}
