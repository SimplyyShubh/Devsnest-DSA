package Trees;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null && q != null)
            return false;
        else if (p != null && q == null)
            return false;

        boolean left = isSameTree(p.left, q.left) ;
        boolean right = isSameTree(p.right, q.right) ;

        if (p.val != q.val)
            return false;

        return left && right;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15, new TreeNode(12, new TreeNode(6), new TreeNode(14)),
                new TreeNode(19, new TreeNode(18), new TreeNode(21)));
        TreeNode toor = new TreeNode(15, new TreeNode(12, new TreeNode(6), new TreeNode(14)),
                new TreeNode(19, new TreeNode(18), new TreeNode(21)));

        System.out.println(isSameTree(root, toor));
    }
}
