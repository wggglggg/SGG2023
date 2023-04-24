package com.datastucture.tree;

import org.junit.Test;

/**
 * ClassName: TreeTest
 * Description:
 *  二叉树测试
 * @Author wggglggg
 * @Create 2023/4/24 19:57
 * @Version 1.0
 */
public class TreeTest {
    @Test
    public void test1(){
        TreeNode node = new TreeNode(null, null, "AA", null);
        TreeNode leftNode = new TreeNode(node, null, "BB", null);
        TreeNode rightNode = new TreeNode(node, null, "CC", null);

        node.setLeft(leftNode);
        node.setRight(rightNode);

    }
}
