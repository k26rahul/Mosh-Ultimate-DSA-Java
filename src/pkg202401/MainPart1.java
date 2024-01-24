package pkg202401;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

public class MainPart1 {
  public static Character firstNonRepeatedCharacterInString(String input) {
    input = input.toLowerCase();

    HashMap<Character, Integer> hashMap = new HashMap<>();

    var chars = input.toCharArray();
    for (char ch : chars) {
      hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
    }
    for (char ch : chars) {
      if (hashMap.get(ch) == 1) {
        return ch;
      }
    }

    return null;
  }

  public static void main(String[] args) {
    // HashSet<Integer> hashSet = new HashSet<>();
    // int[] numbers = { 1, 2, 5, 3, 42, 1, 2, 1, 332, 332, 332, 1, 2, 2, 332, 21,
    // 221, 4 };
    // for (int num : numbers) {
    // hashSet.add(num);
    // }
    // System.out.println(hashSet);

    // System.out.println(firstNonRepeatedCharacterInString("A Green Apple"));

    // PriorityQueue priorityQueue = new PriorityQueue(5);
    // System.out.println(priorityQueue);
    // priorityQueue.dequeue();

    // priorityQueue.enqueue(10);
    // priorityQueue.enqueue(20);
    // priorityQueue.enqueue(5);
    // priorityQueue.enqueue(12);
    // priorityQueue.enqueue(2);
    // System.out.println(priorityQueue);
    // // priorityQueue.debug();

    // System.out.println(priorityQueue.dequeue());
    // System.out.println(priorityQueue.dequeue());
    // System.out.println(priorityQueue.dequeue());
    // System.out.println(priorityQueue);
    // // priorityQueue.debug();

    // priorityQueue.enqueue(11);
    // priorityQueue.enqueue(13);
    // priorityQueue.enqueue(15);
    // // priorityQueue.enqueue(1500);
    // System.out.println(priorityQueue);
    // priorityQueue.debug();

    // StackQueue queue = new StackQueue();
    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);

    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // queue.enqueue(40);
    // queue.enqueue(50);
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());

    // queue.debug();

    // ArrayQueue queue = new ArrayQueue(5);
    // queue.enqueue(10);
    // queue.enqueue(20);
    // queue.enqueue(30);
    // queue.dequeue();
    // queue.dequeue();
    // queue.dequeue();

    // queue.enqueue(40);
    // queue.enqueue(50);
    // queue.enqueue(60);
    // queue.enqueue(70);
    // queue.enqueue(80);
    // queue.dequeue();
    // queue.dequeue();
    // queue.dequeue();
    // queue.dequeue();

    // queue.enqueue(90);
    // queue.enqueue(100);
    // queue.enqueue(110);

    // queue.debug();
    // System.out.println(queue);

    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());
    // System.out.println(queue.dequeue());

    // Queue<Integer> queue = new ArrayDeque<>();
    // queue.add(10);
    // queue.add(20);
    // queue.add(30);
    // QReverser.reverse(queue);
    // System.out.println(queue);

    // Stack stack = new Stack();
    // System.out.println(stack.isEmpty());
    // stack.push(10);
    // stack.push(20);
    // stack.push(30);
    // System.out.println(stack.isEmpty());
    // System.out.println(stack.peek());
    // stack.pop();
    // System.out.println(stack);

    // System.out.println(new Expression().isBalanced("<<<[((Hello))]>>>"));
    // System.out.println(new StringReverser().reverse("Hello"));

    // var list = new LinkedList();
    // list.addLast(10);
    // list.addLast(20);
    // list.addLast(30);
    // list.addLast(40);
    // list.addLast(50);
    // list.reverse();
    // System.out.println(list.getKthFromLast(1));
    // System.out.println(Arrays.toString(list.toArray()));
    // list.print();
    // list.addFirst(100);
    // list.removeFirst();
    // list.removeLast();
    // System.out.println(list.size());
    // System.out.println(list.size());
    // list.addFirst(100);
    // list.removeLast();
    // list.removeFirst();
    // System.out.println(list.indexOf(300));
    // System.out.println(list.contains(100));

    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(10);
    // list.add(20);
    // list.add(30);
    // list.remove(0);
    // System.out.println(list);
    // System.out.println(list[0]);
    // System.out.println(list.indexOf(20));
    // System.out.println(list.contains(30));
    // System.out.println(list.toArray());
    // System.out.println(Arrays.toString(list.toArray()));

    // Array numbers = new Array(3);
    // numbers.insert(10);
    // numbers.insert(20);
    // numbers.insert(30);
    // numbers.insert(40);
    // numbers.insertAt(0, 80);
    // numbers.insertAt(1, 90);
    // numbers.insertAt(6, 100);
    // numbers.print();

    // numbers.reverse().print();

    // Array numbers2 = new Array(3);
    // numbers2.insert(10);
    // numbers2.insert(20);
    // numbers2.insert(40);
    // numbers2.insert(70);
    // numbers2.insert(80);

    // numbers.intersect(numbers2).print();
    // numbers2.intersect(numbers).print();
    // numbers2.intersect(numbers2).print();

    // System.out.println(numbers2[0]);

    // System.out.println(numbers.max());
    // System.out.println(numbers.indexOf(40));
    // numbers.removeAt(3);
    // numbers.print();

    // System.out.println("Hello, World!");
    // int[] numbers = new int[3];
    // int[] numbers = { 10, 20, 30 };
    // System.out.println(numbers);
    // System.out.println(numbers.length);
    // System.out.println(Arrays.toString(numbers));
  }
}