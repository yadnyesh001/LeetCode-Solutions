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
    public boolean isPalindrome(ListNode head) {
        ListNode ans = head;
        int size = 0;
        while(ans != null){
            ans = ans.next;
            size++;
        }
        ans = head;
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = ans.val;
            ans = ans.next;
        }
        for(int i=0; i<size; i++){
            if(arr[i] != arr[size-i-1]){
                return false;
            }
        }
        return true;
    }
}