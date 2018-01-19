package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

/**
 * Min Stack
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 Example:
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.
 */

/**
 * 实现一个栈，可以用单链表实现，也可以用数组实现
 * 在这里，我们选择基于数组实现
 */
public class problem_155 {

}
class MinStack {
    //基于数组实现
    private int[] elements = new int[16];
    private int size = 0;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if((size + 1) > elements.length){
            //需要对数组扩容
            int[] temp = new int[elements.length * 2];
            for(int i = 0; i < elements.length; i++)
                temp[i] = elements[i];
            elements = temp;
        }
        elements[size] = x;
        size++;
    }

    public void pop() {
        size--;
    }

    public int top() {
        return elements[size - 1];
    }

    public int getMin() {
        int min = elements[0];
        for(int i = 1; i < size; i++){
            if(elements[i] < min)
                min = elements[i];
        }
        return min;
    }
}
