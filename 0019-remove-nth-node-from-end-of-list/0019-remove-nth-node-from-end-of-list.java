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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null || head.next==null)
       return null;
       int k=count(head)-n; 
       ListNode temp=head;
       if(k==0)
       {
           temp=temp.next;
           return temp;
       }
       int i=1;
       while(i!=k)
       {
           temp=temp.next;
           i++;
       }
       temp.next=temp.next.next;
       return head;
    }
    private static int count(ListNode head)
    {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c+=1;
            temp=temp.next;
        }
        return c;
    }
}