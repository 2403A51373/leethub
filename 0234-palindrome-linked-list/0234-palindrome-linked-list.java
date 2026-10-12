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
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        ListNode p = null;
        ListNode c = s;
        while(c!=null){
            ListNode nn = c.next;
            c.next = p;//turn the pointer back
            p = c;
            c = nn;
        }
        ListNode i = head;
        ListNode j = p;
        while(j!=null){
            if(i.val!=j.val){
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}