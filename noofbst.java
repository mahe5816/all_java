public class noofbst {
 /* List<TreeNode> ways(int start,int end){
        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        if(start>end){
            list.add(null);
            return list;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> left=ways(start,i-1);
            List<TreeNode> right=ways(i+1,end);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode n=new TreeNode(i,l,r);
                    list.add(n);
                }
            }
        }
        return list;
    }
    public List<TreeNode> generateTrees(int n) {
            return ways(1, n); */   
}
