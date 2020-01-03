# Table of Contents
**[java class hierarchy](#java-class-hierarchy)**<br>
**[Binary Literals](#Binary-Literals)**<br>
**[Java ADT](#Java-ADT)**<br>

## java class hierarchy

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
| Modifier and Type | Method and Description                                                                                                                                                     |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Appends the specified element to the end of this list \(optional operation\)\.                                                                                |
| void              | add\(int index, E element\) \#Inserts the specified element at the specified position in this list \(optional operation\)\.                                                |
| boolean           | addAll\(int index, Collection<? extends E> c\) \#Inserts all of the elements in the specified collection into this list at the specified position \(optional operation\)\. |
| void              | clear\(\) \#Removes all of the elements from this list \(optional operation\)\.                                                                                            |
| boolean           | equals\(Object o\) \#Compares the specified object with this list for equality\.                                                                                           |
| abstract E        | get\(int index\) \#Returns the element at the specified position in this list\.                                                                                            |
| int               | hashCode\(\) \#Returns the hash code value for this list\.                                                                                                                 |
| int               | indexOf\(Object o\) \#Returns the index of the first occurrence of the specified element in this list, or \-1 if this list does not contain the element\.                  |
| Iterator<E>       | iterator\(\) \#Returns an iterator over the elements in this list in proper sequence\.                                                                                     |
| int               | lastIndexOf\(Object o\) \#Returns the index of the last occurrence of the specified element in this list, or \-1 if this list does not contain the element\.               |
| ListIterator<E>   | listIterator\(\) \#Returns a list iterator over the elements in this list \(in proper sequence\)\.                                                                         |
| ListIterator<E>   | listIterator\(int index\) \#Returns a list iterator over the elements in this list \(in proper sequence\), starting at the specified position in the list\.                |
| E                 | remove\(int index\) \#Removes the element at the specified position in this list \(optional operation\)\.                                                                  |
| protected void    | removeRange\(int fromIndex, int toIndex\) \#Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive\.               |
| E                 | set\(int index, E element\) \#Replaces the element at the specified position in this list with the specified element \(optional operation\)\.                              |
| List<E>           | subList\(int fromIndex, int toIndex\) \#Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive\.                    |

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
| Modifier and Type | Method and Description                                                                                                                           |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | equals\(Object o\) \#Compares the specified object with this set for equality\.                                                                  |
| int               | hashCode\(\) \#Returns the hash code value for this set\.                                                                                        |
| boolean           | removeAll\(Collection<?> c\) \#Removes from this set all of its elements that are contained in the specified collection \(optional operation\)\. |

#### [HashSet]
#### [TreeSet]
### [AbstractQueue]
| Modifier and Type | Method and Description                                                                                                                                                                                                                            |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available\. |
| boolean           | addAll\(Collection<? extends E> c\) \#Adds all of the elements in the specified collection to this queue\.                                                                                                                                        |
| void              | clear\(\) \#Removes all of the elements from this queue\.                                                                                                                                                                                         |
| E                 | element\(\) \#Retrieves, but does not remove, the head of this queue\.                                                                                                                                                                            |
| E                 | remove\(\) \#Retrieves and removes the head of this queue\.                                                                                                                                                                                       |

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
| Modifier and Type    | Method and Description                                                                                                                                                                                                                                                     |
|----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| void                 | clear\(\) \#Removes all of the mappings from this map\.                                                                                                                                                                                                                    |
| Object               | clone\(\) \#Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned\.                                                                                                                                                               |
| V                    | compute\(K key, BiFunction<? super K,? super V,? extends V> remappingFunction\) \#Attempts to compute a mapping for the specified key and its current mapped value \(or null if there is no current mapping\)\.                                                            |
| V                    | computeIfAbsent\(K key, Function<? super K,? extends V> mappingFunction\) \#If the specified key is not already associated with a value \(or is mapped to null\), attempts to compute its value using the given mapping function and enters it into this map unless null\. |
| V                    | computeIfPresent\(K key, BiFunction<? super K,? super V,? extends V> remappingFunction\) \#If the value for the specified key is present and non\-null, attempts to compute a new mapping given the key and its current mapped value\.                                     |
| boolean              | containsKey\(Object key\) \#Returns true if this map contains a mapping for the specified key\.                                                                                                                                                                            |
| boolean              | containsValue\(Object value\) \#Returns true if this map maps one or more keys to the specified value\.                                                                                                                                                                    |
| Set<Map\.Entry<K,V>> | entrySet\(\) \#Returns a Set view of the mappings contained in this map\.                                                                                                                                                                                                  |
| void                 | forEach\(BiConsumer<? super K,? super V> action\) \#Performs the given action for each entry in this map until all entries have been processed or the action throws an exception\.                                                                                         |
| V                    | get\(Object key\) \#Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key\.                                                                                                                                          |
| V                    | getOrDefault\(Object key, V defaultValue\) \#Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key\.                                                                                                         |
| boolean              | isEmpty\(\) \#Returns true if this map contains no key\-value mappings\.                                                                                                                                                                                                   |
| Set<K>               | keySet\(\) \#Returns a Set view of the keys contained in this map\.                                                                                                                                                                                                        |
| V                    | merge\(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction\) \#If the specified key is not already associated with a value or is associated with null, associates it with the given non\-null value\.                                            |
| V                    | put\(K key, V value\) \#Associates the specified value with the specified key in this map\.                                                                                                                                                                                |
| void                 | putAll\(Map<? extends K,? extends V> m\) \#Copies all of the mappings from the specified map to this map\.                                                                                                                                                                 |
| V                    | putIfAbsent\(K key, V value\) \#If the specified key is not already associated with a value \(or is mapped to null\) associates it with the given value and returns null, else returns the current value\.                                                                 |
| V                    | remove\(Object key\) \#Removes the mapping for the specified key from this map if present\.                                                                                                                                                                                |
| boolean              | remove\(Object key, Object value\) \#Removes the entry for the specified key only if it is currently mapped to the specified value\.                                                                                                                                       |
| V                    | replace\(K key, V value\) \#Replaces the entry for the specified key only if it is currently mapped to some value\.                                                                                                                                                        |
| boolean              | replace\(K key, V oldValue, V newValue\) \#Replaces the entry for the specified key only if currently mapped to the specified value\.                                                                                                                                      |
| void                 | replaceAll\(BiFunction<? super K,? super V,? extends V> function\) \#Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception\.                                  |
| int                  | size\(\) \#Returns the number of key\-value mappings in this map\.                                                                                                                                                                                                         |
| Collection<V>        | values\(\) \#Returns a Collection view of the values contained in this map\.                                                                                                                                                                                               |

### [TreeMap]
| Modifier and Type     | Method and Description                                                                                                                                                                                                                    |
|-----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Map\.Entry<K,V>       | ceilingEntry\(K key\) \#Returns a key\-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key\.                                                                              |
| K                     | ceilingKey\(K key\) \#Returns the least key greater than or equal to the given key, or null if there is no such key\.                                                                                                                     |
| void                  | clear\(\) \#Removes all of the mappings from this map\.                                                                                                                                                                                   |
| Object                | clone\(\) \#Returns a shallow copy of this TreeMap instance\.                                                                                                                                                                             |
| Comparator<? super K> | comparator\(\) \#Returns the comparator used to order the keys in this map, or null if this map uses the natural ordering of its keys\.                                                                                                   |
| boolean               | containsKey\(Object key\) \#Returns true if this map contains a mapping for the specified key\.                                                                                                                                           |
| boolean               | containsValue\(Object value\) \#Returns true if this map maps one or more keys to the specified value\.                                                                                                                                   |
| NavigableSet<K>       | descendingKeySet\(\) \#Returns a reverse order NavigableSet view of the keys contained in this map\.                                                                                                                                      |
| NavigableMap<K,V>     | descendingMap\(\) \#Returns a reverse order view of the mappings contained in this map\.                                                                                                                                                  |
| Set<Map\.Entry<K,V>>  | entrySet\(\) \#Returns a Set view of the mappings contained in this map\.                                                                                                                                                                 |
| Map\.Entry<K,V>       | firstEntry\(\) \#Returns a key\-value mapping associated with the least key in this map, or null if the map is empty\.                                                                                                                    |
| K                     | firstKey\(\) \#Returns the first \(lowest\) key currently in this map\.                                                                                                                                                                   |
| Map\.Entry<K,V>       | floorEntry\(K key\) \#Returns a key\-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key\.                                                                                |
| K                     | floorKey\(K key\) \#Returns the greatest key less than or equal to the given key, or null if there is no such key\.                                                                                                                       |
| void                  | forEach\(BiConsumer<? super K,? super V> action\) \#Performs the given action for each entry in this map until all entries have been processed or the action throws an exception\.                                                        |
| V                     | get\(Object key\) \#Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key\.                                                                                                         |
| SortedMap<K,V>        | headMap\(K toKey\) \#Returns a view of the portion of this map whose keys are strictly less than toKey\.                                                                                                                                  |
| NavigableMap<K,V>     | headMap\(K toKey, boolean inclusive\) \#Returns a view of the portion of this map whose keys are less than \(or equal to, if inclusive is true\) toKey\.                                                                                  |
| Map\.Entry<K,V>       | higherEntry\(K key\) \#Returns a key\-value mapping associated with the least key strictly greater than the given key, or null if there is no such key\.                                                                                  |
| K                     | higherKey\(K key\) \#Returns the least key strictly greater than the given key, or null if there is no such key\.                                                                                                                         |
| Set<K>                | keySet\(\) \#Returns a Set view of the keys contained in this map\.                                                                                                                                                                       |
| Map\.Entry<K,V>       | lastEntry\(\) \#Returns a key\-value mapping associated with the greatest key in this map, or null if the map is empty\.                                                                                                                  |
| K                     | lastKey\(\) \#Returns the last \(highest\) key currently in this map\.                                                                                                                                                                    |
| Map\.Entry<K,V>       | lowerEntry\(K key\) \#Returns a key\-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key\.                                                                                   |
| K                     | lowerKey\(K key\) \#Returns the greatest key strictly less than the given key, or null if there is no such key\.                                                                                                                          |
| NavigableSet<K>       | navigableKeySet\(\) \#Returns a NavigableSet view of the keys contained in this map\.                                                                                                                                                     |
| Map\.Entry<K,V>       | pollFirstEntry\(\) \#Removes and returns a key\-value mapping associated with the least key in this map, or null if the map is empty\.                                                                                                    |
| Map\.Entry<K,V>       | pollLastEntry\(\) \#Removes and returns a key\-value mapping associated with the greatest key in this map, or null if the map is empty\.                                                                                                  |
| V                     | put\(K key, V value\) \#Associates the specified value with the specified key in this map\.                                                                                                                                               |
| void                  | putAll\(Map<? extends K,? extends V> map\) \#Copies all of the mappings from the specified map to this map\.                                                                                                                              |
| V                     | remove\(Object key\) \#Removes the mapping for this key from this TreeMap if present\.                                                                                                                                                    |
| V                     | replace\(K key, V value\) \#Replaces the entry for the specified key only if it is currently mapped to some value\.                                                                                                                       |
| boolean               | replace\(K key, V oldValue, V newValue\) \#Replaces the entry for the specified key only if currently mapped to the specified value\.                                                                                                     |
| void                  | replaceAll\(BiFunction<? super K,? super V,? extends V> function\) \#Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception\. |
| int                   | size\(\) \#Returns the number of key\-value mappings in this map\.                                                                                                                                                                        |
| NavigableMap<K,V>     | subMap\(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive\) \#Returns a view of the portion of this map whose keys range from fromKey to toKey\.                                                                             |
| SortedMap<K,V>        | subMap\(K fromKey, K toKey\) \#Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive\.                                                                                                  |
| SortedMap<K,V>        | tailMap\(K fromKey\) \#Returns a view of the portion of this map whose keys are greater than or equal to fromKey\.                                                                                                                        |
| NavigableMap<K,V>     | tailMap\(K fromKey, boolean inclusive\) \#Returns a view of the portion of this map whose keys are greater than \(or equal to, if inclusive is true\) fromKey\.                                                                           |
| Collection<V>         | values\(\) \#Returns a Collection view of the values contained in this map\.                                                                                                                                                              |


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
[tableconvert]:https://tableconvert.com/
