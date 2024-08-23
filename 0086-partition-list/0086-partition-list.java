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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);
        ListNode temp=small;
        ListNode curr=high;
        while(head!=null)
        {
             if(head.val<x)
             {
                 temp.next=head;
                 temp=temp.next;
             }
             else{
             curr.next=head;
             curr=curr.next;
             }
           head=head.next;
        }
              curr.next=null;
              temp.next=high.next;
       
        return small.next;
    }
}