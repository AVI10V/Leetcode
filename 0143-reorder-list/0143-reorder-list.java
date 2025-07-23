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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)return;
        ListNode temp=head;
        ListNode slow =head;
        ListNode fast =head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle=slow.next;
        ListNode right=reverse(middle);
        slow.next=null;
        ListNode rightfront=right.next;
        ListNode left=head;
        ListNode leftfront=left.next;
        while(left!=null && right!=null){
            left.next=right;
            right.next=leftfront;
            left=leftfront;
            right=rightfront;
            if(leftfront!=null)leftfront=leftfront.next;
            if(rightfront!=null)rightfront=rightfront.next;
        }






    }
    public ListNode reverse(ListNode temp){
        ListNode prev=null;
        ListNode front=temp.next;
        while(temp!=null){
            temp.next=prev;
            prev=temp;
            temp=front;
            if(temp==null)continue;
            front=temp.next;
        }
        return prev;
    }
}