package Trees;

/**
 * SubtreeOfAnother
 */
public class SubtreeOfAnother {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s== null && t != null)
            return false ;
        
        if (isSameTree(s, t))
            return true;

        else {
            return isSubtree(s.left, t) || isSubtree(s.right, t) ;
        }
  
    }
    
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null)
            return true ;
        else if (p == null|| q == null )
            return false;

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        if (p.val != q.val)
            return false;

        return left && right;

    }
    public static void main(String[] args) {
        // SameTree.isSameTree(p, q)
          TreeNode root = new TreeNode(3,
            new TreeNode(4,
                new TreeNode(1,
                    new TreeNode(0),
                    null), 
                new TreeNode(2)),
            new TreeNode(5, null, null)) ;
            TreeNode toor = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2)) ;
        System.out.println(isSubtree(root, toor))  ;
    }
}