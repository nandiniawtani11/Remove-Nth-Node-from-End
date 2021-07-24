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
    public int length(ListNode s)
    {
        if(s==null)
        {
            return 0;
        }
        int count=0;
        ListNode current=s;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        if(head.next==null && n==1)
            return null;
        if(n==length(head))
        {
            head=head.next;
            return head;
        }
        while(n>0)
        {
            fast=fast.next;
            n--;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
      
    }
}
