package pkg202401;

import java.util.Queue;

public class QReverser {
  public static void reverse(Queue<Integer> queue) {
    // System.out.println(queue);

    Stack stack = new Stack();

    while (!queue.isEmpty()) {
      stack.push(queue.remove());
    }

    while (!stack.isEmpty()) {
      queue.add(stack.pop());
    }
  }
}
