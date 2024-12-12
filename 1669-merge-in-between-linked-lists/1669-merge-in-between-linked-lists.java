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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1 = list1;
        for(int i=0; i<a-1; i++){
            head1 = head1.next;
        }
        ListNode toRemove = head1;
        for(int i=0; i<(b-a+2); i++){
            toRemove = toRemove.next;
        }
        head1.next = list2;
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = toRemove;
        return list1;
    }
}