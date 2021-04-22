package Trees;

public class MaxDepthBT {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int Ldepth = 1 + maxDepth(root.left);
        int Rdepth = 1 + maxDepth(root.right);

        return Math.max(Ldepth, Rdepth);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15, new TreeNode(12, new TreeNode(6), new TreeNode(14)),
                new TreeNode(19, new TreeNode(18), new TreeNode(21)));
    
                System.out.println(maxDepth(root));
    }
}
