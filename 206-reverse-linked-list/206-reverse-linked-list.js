/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let curr=head
    let aft=head
    let pre=null
    while(curr){
        aft=curr.next
        curr.next=pre
        pre=curr
        curr=aft
    }
    return pre;
    
};