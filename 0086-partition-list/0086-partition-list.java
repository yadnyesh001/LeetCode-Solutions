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
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode back = new ListNode(0);    
        ListNode front = new ListNode(0);   

        ListNode tempback = back;
        ListNode tempfront = front;

        while (head != null) {
            if (head.val < x) {
                tempback.next = head;
                tempback = tempback.next;
            } else {
                tempfront.next = head;
                tempfront = tempfront.next;
            }
            head = head.next;
        }

        tempfront.next = null;           
        tempback.next = front.next;      

        return back.next;
    }
}
