package com.datastucture.tree;

/**
 * ClassName: TreeNode
 * Description:
 *  二叉树
 * @Author wggglggg
 * @Create 2023/4/24 19:56
 * @Version 1.0
 */
public class TreeNode {
    private TreeNode parent;    // 父Node是谁
    private TreeNode left;
    private Object data;
    private TreeNode right;

    public TreeNode(Object data) {
        this.data = data;
    }

    public TreeNode(TreeNode left, Object data, TreeNode right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public TreeNode(TreeNode parent, TreeNode left, Object data, TreeNode right) {
        this.parent = parent;
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
