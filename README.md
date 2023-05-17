# Fixed Capacity Queue in Java

This class represents a generic fixed capacity queue in Java, which allows θ(1) insertions at the end, and deletions at the begining. This was a challenge posed to us by our lecturer for Data Structures & Algorithms.

```java
/**
 * A class that represents a fixed-capacity queue. This class
 * has θ(1) removal at the beginning, and θ(1) insertion at the end.
 *
 * This queue works by using two pointers, head and tail
 *
 *  [  ]  [  ]  [  ]  [  ]  [  ]
 *   ^           ^
 *  head       tail
 *
 * head increments on a dequeue operation, and tail increments on an
 * enqueue operation, allowing for θ(1) enqueue and dequeue.
 *
 * The queue is full exactly when (tail - head == maxCapacity - 1) OR (head - tail == 1)
 *
 * @param <Element> : The type of elements this queue can hold
 */
public class FixedCapacityQueue<Element> {
    private final Element[] elements;
    private int head = 0;
    private int tail = 0;
    private final int maxCapacity;
```

To accomplish θ(1) insertions and deletions, I made it so that we use pointers to go through our queue.

### Notes

- Could set queue values to null as we dequeue them as good practise (to allow garbage collection)
- Haven't tested this class as of 16/01/22 due to focusing on exam preparation
