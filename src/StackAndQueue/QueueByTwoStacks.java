package StackAndQueue;

import java.util.Stack;

/**
 * Implement a queue by two stacks,
 * with methods add(), poll(), peek().
 *
 */
public class QueueByTwoStacks {

    private Stack<Integer> data;
    private Stack<Integer> tmp;

    public QueueByTwoStacks() {

        this.data = new Stack<>();
        this.tmp = new Stack<>();
    }

    public void add(Integer e) {

        data.push(e);
    }

    public int poll() {

        if (data.isEmpty()) {

            throw new RuntimeException("The queue is empty.");
        }

        copyToTmp(data, tmp);
        int rst  = tmp.pop();
        copyToTmp(tmp, data);

        return rst;
    }

    public int peek() {

        if (data.isEmpty()) {

            throw new RuntimeException("The queue is empty.");
        }

        copyToTmp(data, tmp);
        int rst  = tmp.peek();
        copyToTmp(tmp, data);

        return rst;
    }

    private void copyToTmp(Stack from, Stack to) {

        to.clear();
        while(!from.isEmpty()) {

            to.push(from.pop());
        }
    }
}
