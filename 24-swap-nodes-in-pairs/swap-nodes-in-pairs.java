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
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;

        while(head != null && head.next != null){
            ListNode curr = head;
            ListNode next = head.next;

            tail.next = next;
            curr.next = next.next;
            next.next = curr;

            tail = curr;
            head = curr.next;
        }

        return dummy.next;
    }
}