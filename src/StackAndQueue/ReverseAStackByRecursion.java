package StackAndQueue;

import java.util.Stack;

/**
 * Reverse a stack by recursion,
 *
 * i.e. 1, 2, 3, 4, 5 push-> 5, 4, 3, 2, 1 transform-> 1, 2, 3, 4, 5
 */
public class ReverseAStackByRecursion {

    public static void reverse(Stack stack) {

        if (stack.isEmpty()) {
            return;
        }

        int last = getAndRemoveTheLastElement(stack);
        reverse(stack);
        stack.push(last);
    }

    private static int getAndRemoveTheLastElement(Stack stack) {

        int result = (int) stack.pop();

        if (!stack.isEmpty()) {

            int last = getAndRemoveTheLastElement(stack);
            stack.push(result);

            return last;
        }

        return result;
    }
}
