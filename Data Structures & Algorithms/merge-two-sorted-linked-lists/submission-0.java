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
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode outputHead = new ListNode(0);
        ListNode output = outputHead;

        while (list1 != null && list2 != null ) {
            if(list1.val <= list2.val){
                output.next = list1;
                list1 = list1.next;
            }else{
                output.next = list2;
                list2 = list2.next;
            }
            
            output = output.next;
        }

        if(list1!= null){
            output.next = list1;
        }else{
            output.next = list2;
        }

        return outputHead.next;
    }
}