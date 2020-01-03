##java class hierarchy

| [object]           |            |        |             |         |               |             |         |            |               |
|--------------------|------------|--------|-------------|---------|---------------|-------------|---------|------------|---------------|
| [AbstractCollection] |            |        |             |         |               | [AbstractMap] |         | [ArrayDeque] | [StringBuilder] |
| [AbstractList]      |            |        | [AbstractSet] |         | [AbstractQueue] | [HashMap]     | [TreeMap] |            |               |
| [ArrayList]          | [LinkedList] | [Vector] | [HashSet]     | [TreeSet] | [PriorityQueue] |             |         |            |               |
|                    |            | [Stack]  |             |         |               |             |         |            |               |

## [Binary Literals](https://docs.oracle.com/javase/8/docs/technotes/guides/language/binary-literals.html)
```java
// An 8-bit 'byte' value:
byte aByte = (byte)0b00100001;

// A 16-bit 'short' value:
short aShort = (short)0b1010000101000101;

// Some 32-bit 'int' values:
int anInt1 = 0b10100001010001011010000101000101;
int anInt2 = 0b101;
int anInt3 = 0B101; // The B can be upper or lower case.

// A 64-bit 'long' value. Note the "L" suffix:
long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;
```

# Java ADT
## [AbstractCollection]
### [AbstractList]
#### [ArrayList]
#### [LinkedList]
#### [Vector]
##### [Stack]
| Modifier and Type | Method and Description |
|-------------------|-------------------------------------------------------------------------------------------------|
| boolean	| empty() # Tests if this stack is empty.|
| E	      | peek() # Looks at the object at the top of this stack without removing it from the stack.|
| E	      | pop() # Removes the object at the top of this stack and returns that object as the value of this function.|
| E	      | push(E item) # Pushes an item onto the top of this stack. |
| int	      | search(Object o) #Returns the 1-based position where an object is on this stack.|

### [AbstractSet]
#### [HashSet]
#### [TreeSet]
### [AbstractQueue]
#### [PriorityQueue]

## [AbstractMap]
### [HashMap]
### [TreeMap]

## [Deque]
### [ArrayDeque]


[object]:https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
[AbstractCollection]: https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html
[AbstractList]: https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html
[ArrayList]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
[LinkedList]: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
[Vector]: https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
[Deque]: https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
[ArrayDeque]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
[Stack]: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
[StringBuilder]: https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
[ArrayDeque]: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
[AbstractSet]: https://docs.oracle.com/javase/8/docs/api/java/util/AbstractSet.html
[HashSet]: https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
[TreeSet]: https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
[AbstractMap]: https://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html
[HashMap]: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
[TreeMap]: https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html
[Queue]: https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
[PriorityQueue]: https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
[AudioInputStream]:https://docs.oracle.com/javase/8/docs/api/javax/sound/sampled/AudioInputStream.html
[AbstractQueue]:https://docs.oracle.com/javase/8/docs/api/java/util/AbstractQueue.html
