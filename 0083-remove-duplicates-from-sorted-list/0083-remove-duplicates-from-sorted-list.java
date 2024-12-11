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
        if(head == null){
            return null;
        }
        ListNode ans = head;
        while(ans != null && ans.next != null){
            if(ans.next.val == ans.val){
                ans.next = ans.next.next;
            }
            if(ans.next == null){
                return head;
            }
            if(ans.next.val != ans.val){
                ans = ans.next;
            }
        }  
        return head; 
    }
}