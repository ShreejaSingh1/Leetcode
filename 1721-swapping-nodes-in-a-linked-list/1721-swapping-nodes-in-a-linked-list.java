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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tempnew=head;
        int c=0;
        while(tempnew!=null){
            c++;
            tempnew=tempnew.next;
            
        }
        ListNode temp1=head;
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        }
        ListNode temp2=head;
        for(int i=1;i<=c-k;i++){
            temp2=temp2.next;
        }
        int temp=temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;
    
    return head;
    }
}