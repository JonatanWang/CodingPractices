package StackAndQueue;

import java.util.Stack;

/**
 * Implement a special stack,
 * in addition to push&pop operations,
 * which can return the minimal element in it;
 *
 * Time complexity O(1) for push, pop & getMin().
 */
public class StackWithGetMin extends Stack <Integer> {

    private Stack<Integer> minStack;

    public StackWithGetMin() {

        minStack = new Stack<>();
    }

    public Integer push(Integer e) {

        if (minStack.isEmpty()) {
            minStack.push(e);
        }

        if (minStack.peek() >= e) {

            minStack.push(e);
        }

        return super.push(e);
    }

    public Integer pop() {

        if (isEmpty()) {

            throw new RuntimeException("The stack is empty.");
        }
        int rst = super.pop();
        if (rst == minStack.peek()) {

            minStack.pop();
        }

        return rst;
    }

    public Integer getMin() {

        if (minStack.isEmpty()) {

            throw new RuntimeException("The stack is empty.");
        }

        return minStack.peek();
    }
}
