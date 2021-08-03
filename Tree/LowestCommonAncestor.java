package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点
 * p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 */
public class LowestCommonAncestor {

    private TreeNode createBinaryTree(int[] array, int index) {

        TreeNode treeNode = null;
        if (index < array.length) {
            treeNode = new TreeNode(array[index]);
            // 对于顺序存储的完全二叉树，如果某个节点的索引为index，其对应的左子树的索引为2*index+1，右子树为2*index+1
            treeNode.left = createBinaryTree(array, 2 * index + 1);
            treeNode.right = createBinaryTree(array, 2 * index + 2);
        }
        return treeNode;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while(true){
            if(root.val > p.val && root.val > q.val){
                root = root.left;
            } else if (root.val< p.val && root.val < q.val) {
                root = root.right;
            } else {
                return root;
            }
        }
    }

    public static void main(String[] args) {
        LowestCommonAncestor l = new LowestCommonAncestor();

        int[] arr={6,2,8,0,4,7,9, -1, -1 ,3,5};
        TreeNode root = l.createBinaryTree(arr, 0);
        
        TreeNode p = l.createBinaryTree(new int[]{2}, 0);
        TreeNode q = l.createBinaryTree(new int[]{8}, 0);

        System.out.println(l.lowestCommonAncestor(root, p , q).val); 
    }



}
