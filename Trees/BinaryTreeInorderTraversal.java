package Trees;

import java.util.*;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>() ;
        traverse(root, res);
        return res ;

    }

    public static void traverse(TreeNode root, List<Integer> l) {
        if (root == null)
            return ;

        traverse(root.left,l);
        l.add(root.val) ;
        traverse(root.right,l);
    }

    public static void main(String[] args) {

    }
}
