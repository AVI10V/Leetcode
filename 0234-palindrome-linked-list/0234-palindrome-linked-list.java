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
        if(head==null || head.next==null)return true;
        ListNode slow =head;
        ListNode fast =head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        slow=slow.next;
        ListNode prev=null;
        ListNode front=slow.next;
        while(slow!=null){
            slow.next=prev;
            prev=slow;
            slow=front;
            if(slow==null){
                continue;
            }
            front=slow.next;
        }
        while(prev!=null){
            if(prev.val!=fast.val)return false;
            prev=prev.next;
            fast=fast.next;
        }
        return true;
        


    }
}