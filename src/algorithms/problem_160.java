package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

/**
 * Intersection of Two Linked Lists
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
 ↘
 c1 → c2 → c3
 ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:

 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.
 */

/**
 * 求两个单向链表是否是否有交点，如果有，则返回第一个交点
 */
public class problem_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        //先判断是否相交，如果不相交，则直接返回null，如果相交的话，则最后一个元素肯定相同
        ListNode a = headA;
        ListNode b = headB;
        int aLen = 0;
        int bLen = 0;
        while(a.next != null){
            a = a.next;
            aLen++;

        }
        while(b.next != null){
            b = b.next;
            bLen++;
        }
        if(a != b){
            return null;
        }

        int offset = Math.abs(aLen - bLen);

        if(aLen > bLen){
            a = headA;
            b = headB;
            return helper(offset, a, b);
        }else{
            a = headB;
            b = headA;
            return helper(offset, a, b);
        }

    }
    public ListNode helper(int offset, ListNode a, ListNode b){
        while(offset != 0)
        {
            a = a.next;
            offset--;
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
}
