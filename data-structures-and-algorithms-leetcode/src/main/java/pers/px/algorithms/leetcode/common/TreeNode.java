package pers.px.algorithms.leetcode.common;

/**
 * @Author : pengxiang
 * @Date : 2021-08-16 00:39:44
 * @Program : data-structures-and-algorithms
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}