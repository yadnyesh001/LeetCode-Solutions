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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(head != null){
            if(head.next != null && head.next.val == head.val){
                while(head.next != null && head.next.val == head.val){
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}