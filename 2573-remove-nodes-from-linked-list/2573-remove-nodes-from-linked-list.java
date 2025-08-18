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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        int n =0;
        while(temp!=null){
           n++;
           temp=temp.next;
        }
        int[] arr = new int[n];
        int i=0;
        temp=head;
        while(temp!=null){
           arr[i]=temp.val;
           i++;
           temp=temp.next;
        }
        int[] max = new int[n];
        i=n-1;
        while(i>=0){
            if(i==n-1){
                max[i]=arr[i];
                i--;
                continue;
            }
            max[i]=Math.max(arr[i] , max[i+1]);
            i--;

        }
        ListNode newhead = new ListNode();
        temp=newhead;
        i=0;
        while(i<n){
            if(max[i]==arr[i]){
                temp.next=new ListNode(max[i]);
                temp=temp.next;
            }
            i++;
        }
        return newhead.next;


    }
}