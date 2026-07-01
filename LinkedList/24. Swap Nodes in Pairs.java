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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null && temp.next != null){
            ListNode node1 = temp;
            ListNode node2 = temp.next;
            if(prev != null){
            prev.next = node2;
            }else{
                head = node2;
            }
            node1.next = node2.next;
            node2.next = node1;
            prev = node1;
            temp = node1.next;
        }
        return head;
    }
}