/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode right = prev;
        ListNode left = head;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(left != null && right != null){
            tail.next = left;
            tail = tail.next;
            left = left.next;
            tail.next = right;
            tail = tail.next;
            right = right.next;
        }

        if(left != null){
            tail.next = left;
        }
        
        if(right != null){
            tail.next = right;
        }

        head = dummy.next;

    }
}