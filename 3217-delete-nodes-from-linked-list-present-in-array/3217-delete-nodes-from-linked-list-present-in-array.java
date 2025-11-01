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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            ans.add(nums[i]);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        while(current != null){
            if(ans.contains(current.val)){
                prev.next = current.next;
            }
            else{
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}