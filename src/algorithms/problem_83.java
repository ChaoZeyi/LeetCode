package algorithms;

/**
 * Created by chaozeyi on 18/1/15.
 */

/**
 *Remove Duplicates from Sorted List
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */

/**
 * 关键在于链表指针的移动
 */
public class problem_83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;

        while(temp != null){
            if(temp.next == null)
                break;
            if(temp.next.val != temp.val){
                temp = temp.next;

            }
            else{
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}
