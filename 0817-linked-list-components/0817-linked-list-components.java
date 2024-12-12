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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            ans.add(nums[i]);
        }
        int count = 0;
        boolean inComponent = false;
        while(head != null){
            if(ans.contains(head.val)){
                if(!inComponent){
                    count++;
                    inComponent = true;
                }
            } 
            else{
                inComponent = false;
            }
            head = head.next;
        }
        return count;
    }
}