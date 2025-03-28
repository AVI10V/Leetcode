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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        temp.next=head;
        temp=head;
        int x=0;
        for(int i=0;i<len-k-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;

        
    } 
}