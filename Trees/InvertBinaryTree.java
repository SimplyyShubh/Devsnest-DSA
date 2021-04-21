package Trees;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(54, new TreeNode(45), new TreeNode(67));

        invertTree(root) ;
    }
}
