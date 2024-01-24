package pkg202401;

import java.util.NoSuchElementException;

public class LinkedList {
  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node first;
  private Node last;
  private int size;

  public int getKthFromLast(int k) {
    if (isEmpty())
      throw new IllegalStateException();
    // if (k < 1 || k > size)
    // throw new IllegalArgumentException();

    Node a = first;
    Node b = a;
    for (int i = 0; i < k - 1; i++) {
      b = b.next;
      if (b == null)
        throw new IllegalArgumentException();
    }

    // System.out.println(a.value);
    // System.out.println(b.value);
    while (b != last) {
      a = a.next;
      b = b.next;
    }
    return a.value;
  }

  public void reverse() {
    if (isEmpty())
      return;

    Node previous = first;
    Node current = first.next;

    while (current != null) {
      Node next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    last = first;
    last.next = null;
    first = previous;
  }

  public void removeFirst() {
    if (isEmpty())
      throw new NoSuchElementException();

    if (first == last)
      first = last = null;
    else {
      Node second = first.next;
      first.next = null;
      first = second;
    }
    size--;
  }

  public void removeLast() {
    if (isEmpty())
      throw new NoSuchElementException();

    if (first == last)
      first = last = null;
    else {
      Node secondLast = getPrevious(last);
      last = secondLast;
      last.next = null;
    }
    size--;
  }

  private Node getPrevious(Node node) {
    Node current = first;
    while (current != null) {
      if (current.next == node)
        return current;
      else
        current = current.next;
    }
    return null;
  }

  public int indexOf(int item) {
    int index = 0;
    Node current = first;
    while (current != null) {
      if (current.value == item)
        return index;
      index++;
      current = current.next;
    }
    return -1;
  }

  public boolean contains(int item) {
    return this.indexOf(item) != -1;
  }

  public void addLast(int item) {
    var node = new Node(item);

    if (isEmpty())
      first = last = node;
    else {
      last.next = node;
      last = node;
    }
    size++;
  }

  public void addFirst(int item) {
    var node = new Node(item);

    if (isEmpty())
      first = last = node;
    else {
      node.next = first;
      first = node;
    }
    size++;
  }

  public int size() {
    return size;
  }

  private boolean isEmpty() {
    return first == null;
  }

  public int[] toArray() {
    int[] array = new int[size];
    int index = 0;
    Node current = first;
    while (current != null) {
      array[index++] = current.value;
      current = current.next;
    }
    return array;
  }

  public void print() {
    Node current = first;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }
}
