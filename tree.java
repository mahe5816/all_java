class node {
    int data;
    node left, right;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}
class BinaryTree {
    node root;

    BinaryTree() {
        root = null;
    }

    void inorder(node x) {
        if (x == null)
            return;
        inorder(x.left);
        System.out.print(x.data + " ");
        
        inorder(x.right);
    }
    void preorder(node x){
        if (x == null)
            return;
         System.out.print(x.data + " ");
         preorder(x.left);
         preorder(x.right);
    }

    void inorder() {
        inorder(root);
    }
}

public class tree {
    public static void main(String[] args) {
        BinaryTree a = new BinaryTree();
        a.root = new node(10);
        a.root.left = new node(15);
        a.root.right = new node(87);
        a.root.left.left=new node(25);
        a.root.left.right=new node(90);
        a.inorder(a.root);
        System.out.println();
        a.preorder(a.root);
    }
}