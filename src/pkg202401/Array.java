package pkg202401;

public class Array {
  private int[] items;
  private int count;

  public Array(int length) {
    items = new int[length];
  }

  public Array reverse() {
    int[] newItems = new int[items.length];

    int indexOfLastItem = count - 1;
    for (int i = indexOfLastItem; i >= 0; i--) {
      newItems[indexOfLastItem - i] = items[i];
    }
    items = newItems;
    return this;
  }

  public Array intersect(Array otherArray) {
    Array common = new Array(count);
    for (int i = 0; i < count; i++) {
      if (otherArray.indexOf(items[i]) != -1)
        common.insert(items[i]);
    }
    return common;
  }

  public int max() {
    if (count == 0)
      throw new IllegalStateException();

    int maxi = items[0];
    for (int i = 1; i < count; i++) {
      if (items[i] > maxi)
        maxi = items[i];
    }
    return maxi;
  }

  public int indexOf(int item) {
    for (int i = 0; i < count; i++) {
      if (items[i] == item)
        return i;
    }
    return -1;
  }

  public void removeAt(int index) {
    if (index < 0 || index >= count)
      throw new IllegalArgumentException();

    for (int i = index; i < count; i++) {
      if (i == count - 1)
        continue;
      items[i] = items[i + 1];
    }

    count--;
  }

  public void insertAt(int index, int item) {
    if (index > count)
      throw new IllegalArgumentException();

    ensureCapacityBeforeInsert();

    // for (int i = count - 1; i >= index; i--) {
    // items[i + 1] = items[i];
    // }

    // Use System.arraycopy to efficiently shift elements and make space for the new
    // element
    // This is equivalent to the commented-out loop, but more efficient for array
    // shifting
    // The parameters are as follows:
    // - items: The source array from which elements will be copied
    // - index: The starting index in the source array from which elements will be
    // copied
    // - items: The destination array to which elements will be copied
    // - index + 1: The starting index in the destination array where the copied
    // elements will be placed
    // - count - index: The number of elements to be copied, representing the
    // portion of the array to be shifted to the right
    System.arraycopy(items, index, items, index + 1, count - index);
    items[index] = item;
    count++;
  }

  public void insert(int item) {
    ensureCapacityBeforeInsert();
    items[count++] = item;
  }

  private void ensureCapacityBeforeInsert() {
    // Ensure that the array has sufficient capacity before inserting
    if (items.length == count) {
      int[] newItems = new int[count * 2];

      for (int i = 0; i < count; i++)
        newItems[i] = items[i];

      items = newItems;
    }
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.println(items[i]);
    }
  }
}
