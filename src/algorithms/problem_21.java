package algorithms;

/**
 * Created by chaozeyi on 18/1/8.
 */


/**
 * Merge Two Sorted Lists
 *
 *Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

 Example:

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */

/**
 * 重点在于考虑到两个链表长度可能不相等的情况
 */
public class problem_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode result = new ListNode(0);
        ListNode a = result;
        while(l1 != null || l2 != null){
            if(l1 == null){
                ListNode temp = new ListNode(l2.val);
                a.next = temp;
                a = temp;
                l2 = l2.next;
                continue;
            }
            if(l2 == null){
                ListNode temp = new ListNode(l1.val);
                a.next = temp;
                a = temp;
                l1 = l1.next;
                continue;
            }

            if(l1.val <= l2.val){
                ListNode temp = new ListNode(l1.val);
                a.next = temp;
                a = temp;
                l1 = l1.next;

            }else{
                ListNode temp = new ListNode(l2.val);
                a.next = temp;
                a = temp;
                l2 = l2.next;
            }
        }

        return result.next;

    }
}



