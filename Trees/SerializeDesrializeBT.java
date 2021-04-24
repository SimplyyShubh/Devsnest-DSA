package Trees;

public class SerializeDesrializeBT {

    public static String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString();

    }

    public static void preOrder(TreeNode root, StringBuilder sb) {

        if (root == null)
            sb.append("null,");
        else {
            sb.append(root.val + ",");
            preOrder(root.left, sb);
            preOrder(root.right, sb);
        }

    }

    public static TreeNode Deserialize(String sb) {
        return build(sb.split(","), new int[1]);
    }

    public static TreeNode build(String[] sb, int[] index) {
        String val = sb[index[0]++];

        if (val.equals("null")){
            return null ;            
        }

        TreeNode n = new TreeNode(Integer.parseInt(val));

        n.left = build(sb, index);
        n.right = build(sb, index);

        return n;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, 
                            new TreeNode(12, new TreeNode(6), new TreeNode(14)),
                            new TreeNode(19, new TreeNode(18), new TreeNode(21)));

        System.out.println(serialize(root));
        String n = serialize(root) ;
        TreeNode a = Deserialize(n) ;
        System.out.println();
        // System.out.println(Arrays.deepToString(arr));
    }

}
