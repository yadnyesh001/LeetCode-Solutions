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
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        if(list.size() == 0){
            return head;
        }
        int a = list.get(list.size()-1);
        ListNode last = new ListNode(a);
        ListNode ans = last;
        for(int i=1; i<list.size(); i++){
            int x = list.get(list.size() - i - 1);
            ListNode prev = new ListNode(x);
            last.next = prev;
            last = last.next;
        }
        return ans;
    }
}