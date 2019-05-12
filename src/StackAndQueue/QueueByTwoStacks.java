package StackAndQueue;

import java.util.Stack;

/**
 * Implement a queue by two stacks,
 * with methods add(), poll(), peek().
 *
 */
public class QueueByTwoStacks {

    // A stack only for push
    private Stack<Integer> pushStack;

    // Another stack only for pop
    private Stack<Integer> popStack;

    public QueueByTwoStacks() {

        this.pushStack = new Stack<>();
        this.popStack = new Stack<>();
    }

    public void add(Integer e) {

        pushStack.push(e);
    }

    /**
     * Push to popStack ONLY when the popStack is empty
     * @return Fifo, first element in the queue
     */
    public int poll() {

        if (pushStack.isEmpty() && popStack.isEmpty()) {

            throw new RuntimeException("The queue is empty.");
        } else if (popStack.isEmpty()) {

            while (!pushStack.isEmpty()) {

                popStack.push(pushStack.pop());
            }
        }

        return popStack.pop();
    }

    public int peek() {

        if (pushStack.isEmpty() && popStack.isEmpty()) {

            throw new RuntimeException("The queue is empty.");
        } else if (popStack.isEmpty()) {

            while (!pushStack.isEmpty()) {

                popStack.push(pushStack.pop());
            }
        }

        return popStack.peek();
    }
}
