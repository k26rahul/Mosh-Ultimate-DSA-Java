package pkg202401;

import java.util.Stack;

public class StackQueue {
  Stack<Integer> enqueueStack = new Stack<>();
  Stack<Integer> dequeueStack = new Stack<>();

  public void enqueue(int item) {
    enqueueStack.push(item);
  }

  public int dequeue() {
    if (enqueueStack.isEmpty() && dequeueStack.isEmpty())
      throw new IllegalStateException();

    if (dequeueStack.isEmpty()) {
      while (!enqueueStack.isEmpty()) {
        dequeueStack.push(enqueueStack.pop());
      }
    }
    return dequeueStack.pop();
  }

  public void debug() {
    System.out.println("[StackQueue] [debug] enqueueStack: " + enqueueStack.toString());
    System.out.println("[StackQueue] [debug] dequeueStack: " + dequeueStack.toString());
  }
}
