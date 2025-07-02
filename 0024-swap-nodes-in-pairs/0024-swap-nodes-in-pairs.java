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
        ListNode ans = head;
        while(ans != null && ans.next != null){
            int x = ans.val;
            ans.val = ans.next.val;
            ans.next.val = x;
            ans = ans.next.next;
        }
        return head;
    }
}