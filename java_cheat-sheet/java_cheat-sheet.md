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
| Modifier and Type             | Method and Description                                                                                                            |
|-------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| void                          | clear\(\) \#Removes all of the mappings from this map \(optional operation\)\.                                                    |
| protected Object              | clone\(\) \#Returns a shallow copy of this AbstractMap instance: the keys and values themselves are not cloned\.                  |
| boolean                       | containsKey\(Object key\) \#Returns true if this map contains a mapping for the specified key\.                                   |
| boolean                       | containsValue\(Object value\) \#Returns true if this map maps one or more keys to the specified value\.                           |
| abstract Set<Map\.Entry<K,V>> | entrySet\(\) \#Returns a Set view of the mappings contained in this map\.                                                         |
| boolean                       | equals\(Object o\) \#Compares the specified object with this map for equality\.                                                   |
| V                             | get\(Object key\) \#Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key\. |
| int                           | hashCode\(\) \#Returns the hash code value for this map\.                                                                         |
| boolean                       | isEmpty\(\) \#Returns true if this map contains no key\-value mappings\.                                                          |
| Set<K>                        | keySet\(\) \#Returns a Set view of the keys contained in this map\.                                                               |
| V                             | put\(K key, V value\) \#Associates the specified value with the specified key in this map \(optional operation\)\.                |
| void                          | putAll\(Map<? extends K,? extends V> m\) \#Copies all of the mappings from the specified map to this map \(optional operation\)\. |
| V                             | remove\(Object key\) \#Removes the mapping for a key from this map if it is present \(optional operation\)\.                      |
| int                           | size\(\) \#Returns the number of key\-value mappings in this map\.                                                                |
| String                        | toString\(\) \#Returns a string representation of this map\.                                                                      |
| Collection<V>                 | values\(\) \#Returns a Collection view of the values contained in this map\.                                                      |

### [HashMap]
### [TreeMap]

## [Deque]
* Summary of Deque methods

|         | First Element \(Head\) |                 |Last Element \(Tail\) |                |
|---------|------------------------|-----------------|----------------------|----------------|
|         | Throws exception       | Special value   | Throws exception     | Special value  |
| Insert  | addFirst\(e\)          | offerFirst\(e\) | addLast\(e\)         | offerLast\(e\) |
| Remove  | removeFirst\(\)        | pollFirst\(\)   | removeLast\(\)       | pollLast\(\)   |
| Examine | getFirst\(\)           | peekFirst\(\)   | getLast\(\)          | peekLast\(\)   |

* Comparison of Queue and Deque methods

| Queue Method | Equivalent Deque Method |
|--------------|-------------------------|
| add\(e\)     | addLast\(e\)            |
| offer\(e\)   | offerLast\(e\)          |
| remove\(\)   | removeFirst\(\)         |
| poll\(\)     | pollFirst\(\)           |
| element\(\)  | getFirst\(\)            |
| peek\(\)     | peekFirst\(\)           |

* Comparison of Stack and Deque methods

| Stack Method | Equivalent Deque Method |
|--------------|-------------------------|
| push\(e\)    | addFirst\(e\)           |
| pop\(\)      | removeFirst\(\)         |
| peek\(\)     | peekFirst\(\)           |

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
