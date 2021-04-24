package Trees;

import java.util.*;

public class LevelOrderBT {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        int level = MaxDepthBT.maxDepth(root);
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 1; i < level+1; i++) {
            List<Integer> index = new ArrayList<>();
            traverse(index, root, i);
            list.add(index);
        }

        return list;
    }

    public static void traverse(List<Integer> index, TreeNode root, int level) {
        if (root == null)
            return;

        if (level == 1)
            index.add(root.val);
        else if (level > 1) {
            traverse(index, root.left, level - 1);
            traverse(index, root.right, level - 1);
        }
    }
    
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int Ldepth = 1 + maxDepth(root.left);
        int Rdepth = 1 + maxDepth(root.right);

        return Math.max(Ldepth, Rdepth);
    }

    public static void main(String[] args) {
        TreeNode root = 
                        new TreeNode(15, 
                            new TreeNode(12, 
                                new TreeNode(6), new TreeNode(14)),
                            new TreeNode(19, 
                                new TreeNode(18), new TreeNode(21)));
        System.out.println(levelOrder(root));
    }
}
