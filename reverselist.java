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
    public ListNode reverseList(ListNode head) {
        
        LinkedList<Integer> list = new LinkedList<>();

        ListNode temp = head;
        int n=0;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
            n++;
        }
        ListNode headd = null;
        int i=0;
        while(n>=1){
            int val = list.get(i);
            ListNode new_node = new ListNode(val);

            if(headd==null){
                headd=new_node;
            }
            else if(headd!=null){
                new_node.next=headd;
                headd=new_node;
            }
            n--;
            i++;
        }
        return headd;
    }
}
