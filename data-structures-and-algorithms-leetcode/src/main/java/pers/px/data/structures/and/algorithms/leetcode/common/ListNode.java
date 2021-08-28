package pers.px.data.structures.and.algorithms.leetcode.common;

/**
 * @Author : pengxiang
 * @Date : 2021-08-16 00:38:00
 * @Program : data-structures-and-algorithms
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}