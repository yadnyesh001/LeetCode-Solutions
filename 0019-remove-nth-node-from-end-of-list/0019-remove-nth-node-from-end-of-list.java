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
        ListNode ans = head;
        if(ans.next == null){
            return null;
        }

        int size = 0;
        while(ans != null){
            ans = ans.next;
            size++;
        } 

        if(size == n){ 
            return head.next;
        }
        ListNode fans = head;
        int count = 0;
        while(count < size-n-1){
            fans = fans.next;
            count++;
        }
        fans.next = fans.next.next;
        return head;
    }
}