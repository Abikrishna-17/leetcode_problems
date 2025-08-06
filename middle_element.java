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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        int size =0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int i=0;
        ListNode temp2 = head;
    
        while(i<size/2){
            
            temp2 = temp2.next;
            i++;
        }
        return temp2;
    }
}
