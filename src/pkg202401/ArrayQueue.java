package pkg202401;

import java.util.Arrays;

public class ArrayQueue {
  private int[] items;
  private int front;
  private int rear;
  private int count;

  public ArrayQueue(int capacity) {
    items = new int[capacity];
  }

  public void enqueue(int item) {
    if (items.length == count)
      throw new IllegalStateException();

    items[rear] = item;
    rear = (rear + 1) % items.length;
    count++;
  }

  public int dequeue() {
    if (count == 0)
      throw new IllegalStateException();

    int item = items[front];
    front = (front + 1) % items.length;
    count--;
    return item;
  }

  public void debug() {
    System.out.println(
        "[ArrayQueue] [debug] items: " + Arrays.toString(items)
            + ", front: " + front + ", rear: " + rear + ", count: " + count);
  }

  @Override
  public String toString() {
    int[] newItems = new int[count];
    int index = front;
    for (int i = 0; i < count; i++) {
      newItems[i] = items[index];
      index = (index + 1) % items.length;
    }
    return Arrays.toString(newItems);
  }
}
