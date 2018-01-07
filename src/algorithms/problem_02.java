package algorithms;

/**
 * @author ChaoZeyi
 * Add Two Numbers
 *You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 hints:由于列表可以非常长，所以不能将数据转成数值来进行计算！！！！！！
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
}
public class problem_02 {
    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        ListNode res = addTwoNumbers(l1,l2);

        while(res != null)
        {
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = "";
        String str2 = "";
        String res = "";
        while(l1 != null)
        {
            str1 += l1.val;
            l1 = l1.next;
        }
        while(l2 != null)
        {
            str2 += l2.val;
            l2 = l2.next;
        }

       int[] char1 = new int[str1.length()];
        for(int i = 0; i < str1.length(); i++)
        {
            char1[i] = Integer.parseInt(str1.substring(i, i+1));
        }
        int[] char2 = new int[str2.length()];
        for(int i = 0; i < str2.length(); i++)
        {
            char2[i] = Integer.parseInt(str2.substring(i, i+1));
        }
       //可能两个序列长度不一样
       int bonus = 0;    //是否存在进位
        int temp1 = 0;
        int temp2 = 0;
       for(int i = 0; i < Math.max(char1.length, char2.length); i++)
       {
           if(i >= char1.length)
               temp1 = 0;
           else
               temp1 = char1[i];

           if(i >= char2.length)
               temp2 = 0;
           else
               temp2 = char2[i];
           int temp = temp1 + temp2 + bonus;
           res += (temp%10);
           bonus = temp/10;
       }
       if(bonus != 0)
           res += bonus;

        ListNode result = new ListNode(0);
        ListNode a = result;
        for(int i = 0; i < res.length(); i++)
        {
            ListNode newNode = new ListNode(Integer.parseInt(res.substring(i, i+1)));
            a.next = newNode;
            a = newNode;
        }
        return result.next;

    }

}
