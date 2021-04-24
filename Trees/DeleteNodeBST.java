package Trees;

/**
 * DeleteNodeBST
 */
public class DeleteNodeBST {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null ;

        else if(key < root.val)
            root.left = deleteNode(root.left, key) ;
        else if(key > root.val)
            root.right = deleteNode(root.right, key) ;
        
        else{
            if(root.left == null && root.right == null)
                root = null ;
            else if(root.left == null){
                root = root.right ;
            }
            else if(root.right == null){
                root = root.left ;
            }
            else{
                root.val = findMin(root.right) ;
                root.right =  deleteNode(root.right, root.val) ;
            }
        }
        return root ;
        
    } 

    public static int findMin(TreeNode root) {
            
        while(root.left != null)
            root= root.left ;

        return root.val ;
    }   
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                            new TreeNode(3,
                                new TreeNode(2)
                                ,new TreeNode(4)), 
                            new TreeNode(6,
                                null,
                                new TreeNode(7)));
            
        root = deleteNode(root, 5) ; 
        System.out.println(root.val);

    }   
}