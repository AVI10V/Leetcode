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
    public int getDecimalValue(ListNode head) {
        int size=0;
        ListNode temp=head;
        int nos=0;
        while(temp!=null){
          size++;
          temp=temp.next;
        }
        temp=head;
        while(temp!=null){
           if(temp.val==1){
            nos+=Math.pow(2,size-1);
           }
           else{
            nos+=0;
           }
           size--;
           temp=temp.next;
        }
        return nos;
    }
}