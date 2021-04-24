package Trees;

import java.util.ArrayList;
import java.util.List;

public class TwoSumFourBst {

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>() ;
        Inorder(root, list);

        int start = 0 , end = list.size() - 1 ;
        while(start < end){
            if(list.get(start) + list.get(end) == k)
                return true ;

           int sum =  k > (list.get(start) + list.get(end)) ? start++ : end-- ;
        }
        
        return false ;
    }

    public static void Inorder(TreeNode root, List<Integer> l) {
        if (root == null)
            return;

        Inorder(root.left, l);
        l.add(root.val);
        Inorder(root.right, l);
    }

    public static boolean search(TreeNode root, int x) {
        if (root == null)
            return false;
        if (root.val == x)
            return true;
        return x < root.val ? search(root.left, x) : search(root.right, x);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        System.out.println(findTarget(root, 3));
    }
}
