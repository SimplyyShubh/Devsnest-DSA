package Trees;

public class LowestCommonAncestor {
    
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null)
            return root;

        if (root.val == p.val || root.val == q.val)
            return root;

        TreeNode left_node = lowestCommonAncestor(root.left, p, q);
        TreeNode right_node = lowestCommonAncestor(root.right, p, q);

        if (left_node != null && right_node != null)
            return root;
        return left_node != null ? left_node : right_node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15,
        new TreeNode(12,
            new TreeNode(6),
            new TreeNode(14)),
        new TreeNode(19,
            new TreeNode(18),
            new TreeNode(21)));

        System.out.println(lowestCommonAncestor(root, root.left.left,root.left.right).val) ;
        
    }

    
}
