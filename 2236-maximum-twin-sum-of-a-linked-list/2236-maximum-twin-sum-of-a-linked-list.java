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
      ListNode slow = head;                                      
      ListNode fast = head;
      int ind =0;
      Map<Integer , Integer> map = new HashMap<>();  
      int len =0; 
      while(fast!=null && fast.next!=null){
        len++;
        map.put(ind , slow.val);
        ind++;
        slow=slow.next;
        fast= fast.next.next;
      }
      len=ind*2;
      int max =0;
      while(slow!=null){
       int sum =slow.val+map.get(len-ind-1);
       ind++;
       max=Math.max(max , sum);
       slow=slow.next;
      }
      return max;


    }
}