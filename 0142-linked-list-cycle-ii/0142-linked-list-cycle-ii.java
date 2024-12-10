/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while(length > 0){
            first = first.next;
            length--;
        }

        while(first != second){
            first = first.next;
            second = second.next;
        }

        return first;
    }

    public int lengthOfCycle(ListNode abc){
        ListNode temp = abc;
        int length = 0;
        do{
            abc = abc.next;
            length++;
        } while(temp != abc);
        return length;
    }
}