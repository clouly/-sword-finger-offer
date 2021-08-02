package Recursion;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class BuildTree {

    HashMap<Integer, Integer> midMap = new HashMap<>();
    int[] preOrder;

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        this.preOrder = preOrder;
        // 为了提升搜索效率，使用哈希表存储中序遍历的值与索引的映射关系
        for (int i = 0; i < preOrder.length; i++) {
            midMap.put(inOrder[i], i);
        }
        return build(0, 0, inOrder.length - 1);
    }

    public TreeNode build(int preRoot, int inLeft, int inRight) {
        // 终止条件
        if (inLeft > inRight) {
            return null;
        }
        // 构建根节点
        TreeNode root = new TreeNode(this.preOrder[preRoot]);
        // 在中序map中获取根节点的索引
        int inRootIndex = midMap.get(this.preOrder[preRoot]);
        root.left = build(preRoot + 1, inLeft, inRootIndex - 1);
        root.right = build(preRoot + (inRootIndex - inLeft) + 1, inRootIndex + 1, inRight);
        return root;
    }

    public static void main(String[] args) {
        BuildTree t = new BuildTree();

        int[] pre = { 3, 9, 20, 15, 7 };
        int[] in = { 9, 3, 15, 20, 7 };

        TreeNode tn = t.buildTree(pre, in);

        System.out.println(tn.val);
        System.out.println(tn.left.val);
        System.out.println(tn.right.val);

    }

}
