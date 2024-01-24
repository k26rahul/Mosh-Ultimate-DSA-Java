package pkg202401;

import java.util.Arrays;

public class PriorityQueue {
  int[] items;
  int count;

  public PriorityQueue(int capacity) {
    items = new int[capacity];
  }

  public void enqueue(int item) {
    if (count == items.length)
      throw new IllegalStateException();

    items[shiftItemsToInsert(item)] = item;
    count++;
  }

  private int shiftItemsToInsert(int item) {
    int i;
    for (i = count - 1; i >= 0; i--) {
      if (items[i] > item)
        items[i + 1] = items[i];
      else
        break;
    }
    return i + 1;
  }

  public int dequeue() {
    if (count == 0)
      throw new IllegalStateException();

    return items[--count];
  }

  // public void enqueue(int item) {
  // if (count == items.length)
  // throw new IllegalStateException();

  // if (count == 0) {
  // items[count++] = item;
  // return;
  // }

  // for (int i = count - 1; i >= 0; i--) {
  // if (items[i] > item) {
  // items[i + 1] = items[i];
  // if (i == 0) {
  // items[0] = item;
  // count++;
  // }
  // } else {
  // items[i + 1] = item;
  // count++;
  // break;
  // }
  // }
  // }

  // public int dequeue() {
  // if (count == 0)
  // throw new IllegalStateException();

  // int item = items[0];

  // System.arraycopy(items, 1, items, 0, items.length - 1);

  // count--;
  // items[count] = 0;
  // return item;
  // }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOfRange(items, 0, count));
  }

  public void debug() {
    System.out.println("[priorityQueue] [debug] items: " + Arrays.toString(items));
  }
}
