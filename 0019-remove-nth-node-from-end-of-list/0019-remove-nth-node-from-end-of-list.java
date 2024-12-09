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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int size = 0;
        ListNode ans = head;
        while(ans != null){
            ans = ans.next;
            size++;
        }
        if(size == n){
            return head.next;
        }
        ans = head;
        int count = 0;
        while(count != size-n-1){
            ans = ans.next;
            count++;
        }
        ans.next = ans.next.next;
        return head;
    }
}