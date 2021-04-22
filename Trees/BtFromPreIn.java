package Trees ;

/**
 * BtFromPreIn
 */
public class BtFromPreIn {
    static int preIndex = 0;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1);
    }

    public static TreeNode build(int[] pre, int[] in, int start, int end) {
        if (start > end)
            return null;

        TreeNode node = new TreeNode(pre[preIndex++]) ;
        
        if (start == end)
            return node;
        
        int inOrderindex = search(in, node.val, start, end) ;

        node.left = build(pre, in, start, inOrderindex - 1)  ;
        node.right = build(pre, in, inOrderindex+1,end)  ;

        return node ;
    }

    public static int search(int[] in , int data,int start, int end) {
        for(int i = start ; i <= end; i++){
            if(data == in[i])
                return i ;
        }

        return -1 ;
    }

    public static void main(String[] args) {
        int[] pre = { -1 };
        int[] in = { -1 };
        TreeNode root = buildTree(pre, in);
        System.out.println(root.val);
    }
}