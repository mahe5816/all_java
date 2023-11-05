public class bintree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    node left,right=null;
    static class bin{
        static int ind=-1;
    static node maketree(int[] nodes){
        ind++;
        if(nodes[ind]==-1)
        return null;
        node newnode=new node(nodes[ind]);
        newnode.left=maketree(nodes);
        newnode.right=maketree(nodes);
        return newnode;
    }
    static void preorder(node root){
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static int countnodes(node root){
        if(root==null)
        return 0;
        int countleft=countnodes(root.left);
        int countright=countnodes(root.right);
        return countleft+countright+1;
    }
    static int sumnodes(node root){
        if(root==null)
        return 0;
        int sumleft=sumnodes(root.left);
        int sumright=sumnodes(root.right);
        return sumleft+sumright+root.data;
        }
    }
    public static void main(String[] args) {    
        bin a=new bin();
        int[] m={1,2,4,-1,-1,5,-1,-1,3,7,-1,-1,6,-1,-1};
        node root=a.maketree(m);
        System.out.println(root.data+" ");
        a.preorder(root);
        System.out.print("\nNo of nodes in the tree : "+a.countnodes(root));
        System.out.print("\nsum of all nodes : "+a.sumnodes(root));
    }
}
