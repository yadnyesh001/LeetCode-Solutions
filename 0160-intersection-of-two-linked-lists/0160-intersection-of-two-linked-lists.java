/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode first = headA;
        ListNode second = headB;
        int size1 = 0;
        int size2 = 0;
        while(first != null){
            size1++;
            first = first.next;
        }
        while(second != null){
            size2++;
            second = second.next;
        }
        first = headA;
        second = headB;
        if(size1 > size2){
            int count = size1 - size2;
            while(count != 0){
                first = first.next;
                count--;
            }
            for(int i=0; i<size2; i++){
                if(first == second){
                    break;
                }
                first = first.next;
                second = second.next;
            }
        }
        else{
            int count = size2 - size1;
            while(count != 0){
                second = second.next;
                count--;
            }
            for(int i=0; i<size1; i++){
                if(first == second){
                    break;
                }
                first = first.next;
                second = second.next;
            }
        }
        return first;
    }
}