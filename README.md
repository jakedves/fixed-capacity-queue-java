# Fixed Capacity Queue in Java

This class represents a generic fixed capacity queue in Java, which allows θ(1) insertions at the end, and deletions at the begining. This was a challenge posed to us by our lecturer for Data Structures & Algorithms.

To accomplish θ(1) insertions and deletions, I made it so that we use pointers to go through our queue.

### Notes

- Could set queue values to null as we dequeue them as good practise (to allow garbage collection)
- Haven't tested this class as of 16/01/22 due to focusing on exam preparation
