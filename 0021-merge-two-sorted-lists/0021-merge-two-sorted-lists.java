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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=new ListNode(0);
        ListNode temp=curr;
        while(true)
        {
            if(list1==null)
            {
                 temp.next=list2;
                 break;
            }
            if(list2==null){
                 temp.next=list1;
                 break;
            }
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        return curr.next;
    }
}