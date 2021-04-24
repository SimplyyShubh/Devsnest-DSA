package Trees;

public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    public static boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;

        if (min != null && root.val <= min)
            return false;
            
        if (max != null && root.val >= max)
            return false;
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(-2147483648, new TreeNode(-2147483648, null, null), null);

        System.out.println(isValidBST(root));
    }
}
