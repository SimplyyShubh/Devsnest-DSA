package Trees;

import java.util.ArrayList;
import java.util.List;

public class KsmallestElement {
    public static int kthSmallest(TreeNode root, int k) {
       List<Integer> list = new ArrayList<>() ;

        inORder(list,root);
        return list.get(--k) ;
    }

    public static void inORder(List<Integer> list, TreeNode root) {
        if (root == null)
            return ;
        inORder(list, root.left);
        list.add(root.val) ;
        inORder(list, root.right);
    }

    public static void main(String[] args) {

    }
}
