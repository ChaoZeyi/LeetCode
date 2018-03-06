package algorithms;

/**
 * @author ChaoZeyi
 * Add Two Numbers
 *You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 hints:由于列表可以非常长，所以不能将数据转成数值来进行计算！！！！！！
 */

/**
 * 之前的做法是把所有的链表数据存储在一个字符串中，然后切分成整型数组，再进行求和
 * 其实可以利用倒序的特点，直接对链表节点求和，逻辑更简单！
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
}
public class problem_02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode a = result;
        int add = 0;
        while(l1 != null || l2 != null) {
            int val1, val2;
            if (l1 == null)
                val1 = 0;
            else
            {val1 = l1.val;
                l1 = l1.next;}
            if (l2 == null)
                val2 = 0;
            else {
                val2 = l2.val;
                l2 = l2.next;
            }

            int temp = val1 + val2 + add;
            add = temp/10;
            ListNode tempList = new ListNode(temp%10);
            a.next = tempList;
            a = tempList;
        }
        if(add == 1){
            ListNode tempList = new ListNode(1);
            a.next = tempList;
        }
        return result.next;

    }

}
