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
        
        ListNode curr=head;
        ListNode aft=head;
        ListNode pre=null;
        while(curr!=null){
            aft=curr.next;
            curr.next=pre;
            pre=curr;
            curr=aft;
        }
        return pre;
        
    }
}