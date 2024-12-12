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
    public int pairSum(ListNode head) {
        ListNode ans = head;
        int size = 0;
        while(ans != null){
            size++;
            ans = ans.next;
        }
        ans = head;
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = ans.val;
            ans = ans.next;
        }
        int max = -1;
        for(int i=0; i<size; i++){
            int sum = 0;
            sum = arr[i] + arr[size-(i+1)];
            max = Math.max(max, sum);
        }
        return max;
    }
}