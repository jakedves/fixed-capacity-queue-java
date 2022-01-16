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

    // we can suppress this warning as we only will allow insertion of type Element
    @SuppressWarnings("unchecked")
    FixedCapacityQueue(int size) {
        this.elements = (Element[]) new Object[size];
        this.maxCapacity = size;
    }

    /**
     * Adds an element to the end of the queue
     * @param element : The element to be added to the queue
     */
    public void add(Element element) throws QueueIsFullException {
        if (isFull()) {
            throw new QueueIsFullException("This queue is full.\nMaximum capacity: " + maxCapacity + "\n");
        }
        elements[tail] = element;
        tail++;
    }

    /**
     * Returns the element at head, and then increments
     * the head pointer.
     * @return : The next element to be dequeued
     */
    public Element dequeue() throws QueueIsEmptyException {
        if (isEmpty()) {
            throw new QueueIsEmptyException("This queue is empty.\n");
        }
        return this.elements[head++];
    }

    /**
     * Checks whether the queue is full
     * @return : True when the queue is full, false otherwise
     */
    private boolean isFull() {
        return tail - head == maxCapacity - 1 || head - tail == 1;
    }

    /**
     * Checks whether the queue is empty
     * @return : True when the queue is empty
     */
    private boolean isEmpty() {
        return head == tail;
    }

    /**
     * Accessors
     */
    public int size() { return tail + 1; }
    public int getMaxCapacity() { return maxCapacity; }
}
