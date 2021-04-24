package Trees;

public class BTMaxPathSum {
    
    public static int maxPathSum(TreeNode root) {
        MaxSum(root);
        return maxValue;
    }
    public static int maxValue = Integer.MIN_VALUE;
    
    public static int MaxSum(TreeNode root) {
        if (root == null)
            return 0;

        int left = Math.max(0, MaxSum(root.left));
        int right = Math.max(0, MaxSum(root.right));
        maxValue = Math.max(maxValue, left + right + root.val);
        return Math.max(left, right) + root.val;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);

        System.out.println(maxPathSum(root)) ;
    }
}
