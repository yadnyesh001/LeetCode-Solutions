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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head, temp = head, prev=null;
        for(int i=0; i<k; i++, temp=temp.next){
            if(temp==null){
                return head;   
            }
        }
        for(int i=0; i<k; i++){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        head.next = reverseKGroup(cur, k);
        return prev;
    }
}