package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

/**
 * Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 */

/**
 * 判断给定的一个单链表是否存在环
 */
public class problem_141 {

    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        //给出两个指针，一个每次只走一步，一个每次走两步，如果最后两个指针指向同一个节点，说明存在环
        ListNode slower = head;
        ListNode faster = head;
        while(slower.next != null && faster.next != null && faster.next.next != null ){
            slower = slower.next;
            faster = faster.next.next;
            if(slower == faster){
                return true;
            }

        }
        return false;
    }

}
