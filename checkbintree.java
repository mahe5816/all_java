public class checkbintree {
    /*class Solution {
    public static boolean isValidBST(TreeNode root) {

        return checkbst(root, null, null);
        
    }

    static boolean checkbst( TreeNode node, TreeNode left, TreeNode right){

        if ( node == null){
            return true;
        }

        else if( left != null && node.val <= left.val ){        // this will evaluated for right subtrees
            return false;
        }
        
        else if( right != null && node.val >= right.val ){     // this will evaluated for left subtrees
            return false;
        }
                                                                 // now recurse for left and right subtrees
                                                                 // for left subtree : boundary will be [current left , current node ]
                                                                 // for right subtree : boundary will be [current node, current right ]
        return checkbst(node.left, left, node ) && checkbst(node.right, node, right);

    }
} */
}
