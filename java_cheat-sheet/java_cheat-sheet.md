# Table of Contents
**[java class hierarchy](#java-class-hierarchy)**<br>
**[Binary Literals](#Binary-Literals)**<br>
**[String](#String)**<br>
**[Arrays](#Arrays)**<br>

**[Java ADT](#Java-ADT)**<br>
	**[AbstractCollection](#AbstractCollection)**<br>
		**[AbstractList](#AbstractList)**<br>
			**[ArrayList](#ArrayList)**<br>
			**[LinkedList](#LinkedList)**<br>
			**[Vector](#Vector)**<br>
				**[Stack](#Stack)**<br>
		**[AbstractSet](#AbstractSet)**<br>
			**[HashSet](#HashSet)**<br>
			**[TreeSet](#TreeSet)**<br>
		**[AbstractQueue](#AbstractQueue)**<br>
			**[PriorityQueue](#PriorityQueue)**<br>
		**[AbstractMap](#AbstractMap)**<br>
			**[HashMap](#HashMap)**<br>
			**[TreehMap](#TreehMap)**<br>
	**[Deque](#Deque)**<br>
		**[ArrayDeque](#ArrayDeque)**<br>

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

## [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
```java
toCharArray()
indexOf()
lastIndexOf()
length()
split(String regex)
startsWith(String prefix)
subSequence(int beginIndex, int endIndex)
substring(int beginIndex, int endIndex)
```
[regex](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum)

## [Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
```java
int[] anArray = { 
    100, 200, 300,
    400, 500, 600, 
    700, 800, 900, 1000
};
String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

List<Integer> list = Arrays.asList{100, 200, 300 400, 500, 600};
List<int[]> directions = Arrays.asList(new int[] {0,1}, new int[] {0, -1}, new int[] {1, 0}, new int[] {-1, 0}); 
```

# Java ADT
## [AbstractCollection]
| Modifier and Type    | Method and Description                                                                                                                                           |
|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean              | add\(E e\) \#Ensures that this collection contains the specified element \(optional operation\)\.                                                                |
| boolean              | addAll\(Collection<? extends E> c\) \#Adds all of the elements in the specified collection to this collection \(optional operation\)\.                           |
| void                 | clear\(\) \#Removes all of the elements from this collection \(optional operation\)\.                                                                            |
| boolean              | contains\(Object o\) \#Returns true if this collection contains the specified element\.                                                                          |
| boolean              | containsAll\(Collection<?> c\) \#Returns true if this collection contains all of the elements in the specified collection\.                                      |
| boolean              | isEmpty\(\) \#Returns true if this collection contains no elements\.                                                                                             |
| abstract Iterator<E> | iterator\(\) \#Returns an iterator over the elements contained in this collection\.                                                                              |
| boolean              | remove\(Object o\) \#Removes a single instance of the specified element from this collection, if it is present \(optional operation\)\.                          |
| boolean              | removeAll\(Collection<?> c\) \#Removes all of this collection's elements that are also contained in the specified collection \(optional operation\)\.            |
| boolean              | retainAll\(Collection<?> c\) \#Retains only the elements in this collection that are contained in the specified collection \(optional operation\)\.              |
| abstract int         | size\(\) \#Returns the number of elements in this collection\.                                                                                                   |
| Object\[\]           | toArray\(\) \#Returns an array containing all of the elements in this collection\.                                                                               |
| <T> T\[\]            | toArray\(T\[\] a\) \#Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array\. |
| String               | toString\(\) \#Returns a string representation of this collection\.                                                                                              |

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
| Modifier and Type | Method and Description                                                                                                                                                                                       |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Appends the specified element to the end of this list\.                                                                                                                                         |
| void              | add\(int index, E element\) \#Inserts the specified element at the specified position in this list\.                                                                                                         |
| boolean           | addAll\(Collection<? extends E> c\) \#Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator\.          |
| boolean           | addAll\(int index, Collection<? extends E> c\) \#Inserts all of the elements in the specified collection into this list, starting at the specified position\.                                                |
| void              | clear\(\) \#Removes all of the elements from this list\.                                                                                                                                                     |
| Object            | clone\(\) \#Returns a shallow copy of this ArrayList instance\.                                                                                                                                              |
| boolean           | contains\(Object o\) \#Returns true if this list contains the specified element\.                                                                                                                            |
| void              | ensureCapacity\(int minCapacity\) \#Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument\. |
| void              | forEach\(Consumer<? super E> action\) \#Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception\.                                |
| E                 | get\(int index\) \#Returns the element at the specified position in this list\.                                                                                                                              |
| int               | indexOf\(Object o\) \#Returns the index of the first occurrence of the specified element in this list, or \-1 if this list does not contain the element\.                                                    |
| boolean           | isEmpty\(\) \#Returns true if this list contains no elements\.                                                                                                                                               |
| Iterator<E>       | iterator\(\) \#Returns an iterator over the elements in this list in proper sequence\.                                                                                                                       |
| int               | lastIndexOf\(Object o\) \#Returns the index of the last occurrence of the specified element in this list, or \-1 if this list does not contain the element\.                                                 |
| ListIterator<E>   | listIterator\(\) \#Returns a list iterator over the elements in this list \(in proper sequence\)\.                                                                                                           |
| ListIterator<E>   | listIterator\(int index\) \#Returns a list iterator over the elements in this list \(in proper sequence\), starting at the specified position in the list\.                                                  |
| E                 | remove\(int index\) \#Removes the element at the specified position in this list\.                                                                                                                           |
| boolean           | remove\(Object o\) \#Removes the first occurrence of the specified element from this list, if it is present\.                                                                                                |
| boolean           | removeAll\(Collection<?> c\) \#Removes from this list all of its elements that are contained in the specified collection\.                                                                                   |
| boolean           | removeIf\(Predicate<? super E> filter\) \#Removes all of the elements of this collection that satisfy the given predicate\.                                                                                  |
| protected void    | removeRange\(int fromIndex, int toIndex\) \#Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive\.                                                 |
| void              | replaceAll\(UnaryOperator<E> operator\) \#Replaces each element of this list with the result of applying the operator to that element\.                                                                      |
| boolean           | retainAll\(Collection<?> c\) \#Retains only the elements in this list that are contained in the specified collection\.                                                                                       |
| E                 | set\(int index, E element\) \#Replaces the element at the specified position in this list with the specified element\.                                                                                       |
| int               | size\(\) \#Returns the number of elements in this list\.                                                                                                                                                     |
| void              | sort\(Comparator<? super E> c\) \#Sorts this list according to the order induced by the specified Comparator\.                                                                                               |
| Spliterator<E>    | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this list\.                                                                                                        |
| List<E>           | subList\(int fromIndex, int toIndex\) \#Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive\.                                                      |
| Object\[\]        | toArray\(\) \#Returns an array containing all of the elements in this list in proper sequence \(from first to last element\)\.                                                                               |
| <T> T\[\]         | toArray\(T\[\] a\) \#Returns an array containing all of the elements in this list in proper sequence \(from first to last element\); the runtime type of the returned array is that of the specified array\. |
| void              | trimToSize\(\) \#Trims the capacity of this ArrayList instance to be the list's current size\.                                                                                                               |

#### [LinkedList]
| Modifier and Type | Method and Description                                                                                                                                                                                       |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Appends the specified element to the end of this list\.                                                                                                                                         |
| void              | add\(int index, E element\) \#Inserts the specified element at the specified position in this list\.                                                                                                         |
| boolean           | addAll\(Collection<? extends E> c\) \#Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator\.          |
| boolean           | addAll\(int index, Collection<? extends E> c\) \#Inserts all of the elements in the specified collection into this list, starting at the specified position\.                                                |
| void              | addFirst\(E e\) \#Inserts the specified element at the beginning of this list\.                                                                                                                              |
| void              | addLast\(E e\) \#Appends the specified element to the end of this list\.                                                                                                                                     |
| void              | clear\(\) \#Removes all of the elements from this list\.                                                                                                                                                     |
| Object            | clone\(\) \#Returns a shallow copy of this LinkedList\.                                                                                                                                                      |
| boolean           | contains\(Object o\) \#Returns true if this list contains the specified element\.                                                                                                                            |
| Iterator<E>       | descendingIterator\(\) \#Returns an iterator over the elements in this deque in reverse sequential order\.                                                                                                   |
| E                 | element\(\) \#Retrieves, but does not remove, the head \(first element\) of this list\.                                                                                                                      |
| E                 | get\(int index\) \#Returns the element at the specified position in this list\.                                                                                                                              |
| E                 | getFirst\(\) \#Returns the first element in this list\.                                                                                                                                                      |
| E                 | getLast\(\) \#Returns the last element in this list\.                                                                                                                                                        |
| int               | indexOf\(Object o\) \#Returns the index of the first occurrence of the specified element in this list, or \-1 if this list does not contain the element\.                                                    |
| int               | lastIndexOf\(Object o\) \#Returns the index of the last occurrence of the specified element in this list, or \-1 if this list does not contain the element\.                                                 |
| ListIterator<E>   | listIterator\(int index\) \#Returns a list\-iterator of the elements in this list \(in proper sequence\), starting at the specified position in the list\.                                                   |
| boolean           | offer\(E e\) \#Adds the specified element as the tail \(last element\) of this list\.                                                                                                                        |
| boolean           | offerFirst\(E e\) \#Inserts the specified element at the front of this list\.                                                                                                                                |
| boolean           | offerLast\(E e\) \#Inserts the specified element at the end of this list\.                                                                                                                                   |
| E                 | peek\(\) \#Retrieves, but does not remove, the head \(first element\) of this list\.                                                                                                                         |
| E                 | peekFirst\(\) \#Retrieves, but does not remove, the first element of this list, or returns null if this list is empty\.                                                                                      |
| E                 | peekLast\(\) \#Retrieves, but does not remove, the last element of this list, or returns null if this list is empty\.                                                                                        |
| E                 | poll\(\) \#Retrieves and removes the head \(first element\) of this list\.                                                                                                                                   |
| E                 | pollFirst\(\) \#Retrieves and removes the first element of this list, or returns null if this list is empty\.                                                                                                |
| E                 | pollLast\(\) \#Retrieves and removes the last element of this list, or returns null if this list is empty\.                                                                                                  |
| E                 | pop\(\) \#Pops an element from the stack represented by this list\.                                                                                                                                          |
| void              | push\(E e\) \#Pushes an element onto the stack represented by this list\.                                                                                                                                    |
| E                 | remove\(\) \#Retrieves and removes the head \(first element\) of this list\.                                                                                                                                 |
| E                 | remove\(int index\) \#Removes the element at the specified position in this list\.                                                                                                                           |
| boolean           | remove\(Object o\) \#Removes the first occurrence of the specified element from this list, if it is present\.                                                                                                |
| E                 | removeFirst\(\) \#Removes and returns the first element from this list\.                                                                                                                                     |
| boolean           | removeFirstOccurrence\(Object o\) \#Removes the first occurrence of the specified element in this list \(when traversing the list from head to tail\)\.                                                      |
| E                 | removeLast\(\) \#Removes and returns the last element from this list\.                                                                                                                                       |
| boolean           | removeLastOccurrence\(Object o\) \#Removes the last occurrence of the specified element in this list \(when traversing the list from head to tail\)\.                                                        |
| E                 | set\(int index, E element\) \#Replaces the element at the specified position in this list with the specified element\.                                                                                       |
| int               | size\(\) \#Returns the number of elements in this list\.                                                                                                                                                     |
| Spliterator<E>    | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this list\.                                                                                                        |
| Object\[\]        | toArray\(\) \#Returns an array containing all of the elements in this list in proper sequence \(from first to last element\)\.                                                                               |
| <T> T\[\]         | toArray\(T\[\] a\) \#Returns an array containing all of the elements in this list in proper sequence \(from first to last element\); the runtime type of the returned array is that of the specified array\. |

#### [Vector]
| Modifier and Type | Method and Description                                                                                                                                                                                |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\)\#Appends the specified element to the end of this Vector\.                                                                                                                                 |
| void              | add\(int index, E element\) \#Inserts the specified element at the specified position in this Vector\.                                                                                                |
| boolean           | addAll\(Collection<? extends E> c\) \#Appends all of the elements in the specified Collection to the end of this Vector, in the order that they are returned by the specified Collection's Iterator\. |
| boolean           | addAll\(int index, Collection<? extends E> c\) \#Inserts all of the elements in the specified Collection into this Vector at the specified position\.                                                 |
| void              | addElement\(E obj\) \#Adds the specified component to the end of this vector, increasing its size by one\.                                                                                            |
| int               | capacity\(\) \#Returns the current capacity of this vector\.                                                                                                                                          |
| void              | clear\(\) \#Removes all of the elements from this Vector\.                                                                                                                                            |
| Object            | clone\(\) \#Returns a clone of this vector\.                                                                                                                                                          |
| boolean           | contains\(Object o\) \#Returns true if this vector contains the specified element\.                                                                                                                   |
| boolean           | containsAll\(Collection<?> c\) \#Returns true if this Vector contains all of the elements in the specified Collection\.                                                                               |
| void              | copyInto\(Object\[\] anArray\) \#Copies the components of this vector into the specified array\.                                                                                                      |
| E                 | elementAt\(int index\) \#Returns the component at the specified index\.                                                                                                                               |
| Enumeration<E>    | elements\(\) \#Returns an enumeration of the components of this vector\.                                                                                                                              |
| void              | ensureCapacity\(int minCapacity\) \#Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument\.    |
| boolean           | equals\(Object o\) \#Compares the specified Object with this Vector for equality\.                                                                                                                    |
| E                 | firstElement\(\) \#Returns the first component \(the item at index 0\) of this vector\.                                                                                                               |
| void              | forEach\(Consumer<? super E> action\) \#Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception\.                         |
| E                 | get\(int index\) \#Returns the element at the specified position in this Vector\.                                                                                                                     |
| int               | hashCode\(\) \#Returns the hash code value for this Vector\.                                                                                                                                          |
| int               | indexOf\(Object o\) \#Returns the index of the first occurrence of the specified element in this vector, or \-1 if this vector does not contain the element\.                                         |
| int               | indexOf\(Object o, int index\) \#Returns the index of the first occurrence of the specified element in this vector, searching forwards from index, or returns \-1 if the element is not found\.       |
| void              | insertElementAt\(E obj, int index\) \#Inserts the specified object as a component in this vector at the specified index\.                                                                             |
| boolean           | isEmpty\(\) \#Tests if this vector has no components\.                                                                                                                                                |
| Iterator<E>       | iterator\(\) \#Returns an iterator over the elements in this list in proper sequence\.                                                                                                                |
| E                 | lastElement\(\) \#Returns the last component of the vector\.                                                                                                                                          |
| int               | lastIndexOf\(Object o\) \#Returns the index of the last occurrence of the specified element in this vector, or \-1 if this vector does not contain the element\.                                      |
| int               | lastIndexOf\(Object o, int index\) \#Returns the index of the last occurrence of the specified element in this vector, searching backwards from index, or returns \-1 if the element is not found\.   |
| ListIterator<E>   | listIterator\(\) \#Returns a list iterator over the elements in this list \(in proper sequence\)\.                                                                                                    |
| ListIterator<E>   | listIterator\(int index\) \#Returns a list iterator over the elements in this list \(in proper sequence\), starting at the specified position in the list\.                                           |
| E                 | remove\(int index\) \#Removes the element at the specified position in this Vector\.                                                                                                                  |
| boolean           | remove\(Object o\) \#Removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged\.                                               |
| boolean           | removeAll\(Collection<?> c\) \#Removes from this Vector all of its elements that are contained in the specified Collection\.                                                                          |
| void              | removeAllElements\(\) \#Removes all components from this vector and sets its size to zero\.                                                                                                           |
| boolean           | removeElement\(Object obj\) \#the first \(lowest\-indexed\) occurrence of the argument from this vector\.                                                                                             |
| void              | removeElementAt\(int index\) \#Deletes the component at the specified index\.                                                                                                                         |
| boolean           | removeIf\(Predicate<? super E> filter\) \#all of the elements of this collection that satisfy the given predicate\.                                                                                   |
| protected void    | removeRange\(int fromIndex, int toIndex\) \#Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive\.                                          |
| void              | replaceAll\(UnaryOperator<E> operator\) \#Replaces each element of this list with the result of applying the operator to that element\.                                                               |
| boolean           | retainAll\(Collection<?> c\) \#Retains only the elements in this Vector that are contained in the specified Collection\.                                                                              |
| E                 | set\(int index, E element\) \#Replaces the element at the specified position in this Vector with the specified element\.                                                                              |
| void              | setElementAt\(E obj, int index\) \#the component at the specified index of this vector to be the specified object\.                                                                                   |
| void              | setSize\(int newSize\) \#the size of this vector\.                                                                                                                                                    |
| int               | size\(\) \#Returns the number of components in this vector\.                                                                                                                                          |
| void              | sort\(Comparator<? super E> c\) \#Sorts this list according to the order induced by the specified Comparator\.                                                                                        |
| Spliterator<E>    | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this list\.                                                                                                 |
| List<E>           | subList\(int fromIndex, int toIndex\) \#Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive\.                                                             |
| Object\[\]        | toArray\(\) \#Returns an array containing all of the elements in this Vector in the correct order\.                                                                                                   |
| <T> T\[\]         | toArray\(T\[\] a\) \#Returns an array containing all of the elements in this Vector in the correct order; the runtime type of the returned array is that of the specified array\.                     |
| String            | toString\(\) \#Returns a string representation of this Vector, containing the String representation of each element\.                                                                                 |
| void              | trimToSize\(\) \#Trims the capacity of this vector to be the vector's current size\.                                                                                                                  |

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
| Modifier and Type | Method and Description                                                                                |
|-------------------|-------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Adds the specified element to this set if it is not already present\.                    |
| void              | clear\(\) \#Removes all of the elements from this set\.                                               |
| Object            | clone\(\) \#Returns a shallow copy of this HashSet instance: the elements themselves are not cloned\. |
| boolean           | contains\(Object o\) \#Returns true if this set contains the specified element\.                      |
| boolean           | isEmpty\(\) \#Returns true if this set contains no elements\.                                         |
| Iterator<E>       | iterator\(\) \#Returns an iterator over the elements in this set\.                                    |
| boolean           | remove\(Object o\) \#Removes the specified element from this set if it is present\.                   |
| int               | size\(\) \#Returns the number of elements in this set \(its cardinality\)\.                           |
| Spliterator<E>    | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this set\.  |

#### [TreeSet]
| Modifier and Type     | Method and Description                                                                                                                                                            |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean               | add\(E e\) \#Adds the specified element to this set if it is not already present\.                                                                                                |
| boolean               | addAll\(Collection<? extends E> c\) \#Adds all of the elements in the specified collection to this set\.                                                                          |
| E                     | ceiling\(E e\) \#Returns the least element in this set greater than or equal to the given element, or null if there is no such element\.                                          |
| void                  | clear\(\) \#Removes all of the elements from this set\.                                                                                                                           |
| Object                | clone\(\) \#Returns a shallow copy of this TreeSet instance\.                                                                                                                     |
| Comparator<? super E> | comparator\(\) \#Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements\.                                   |
| boolean               | contains\(Object o\) \#Returns true if this set contains the specified element\.                                                                                                  |
| Iterator<E>           | descendingIterator\(\) \#Returns an iterator over the elements in this set in descending order\.                                                                                  |
| NavigableSet<E>       | descendingSet\(\) \#Returns a reverse order view of the elements contained in this set\.                                                                                          |
| E                     | first\(\) \#Returns the first \(lowest\) element currently in this set\.                                                                                                          |
| E                     | floor\(E e\) \#Returns the greatest element in this set less than or equal to the given element, or null if there is no such element\.                                            |
| SortedSet<E>          | headSet\(E toElement\) \#Returns a view of the portion of this set whose elements are strictly less than toElement\.                                                              |
| NavigableSet<E>       | headSet\(E toElement, boolean inclusive\) \#Returns a view of the portion of this set whose elements are less than \(or equal to, if inclusive is true\) toElement\.              |
| E                     | higher\(E e\) \#Returns the least element in this set strictly greater than the given element, or null if there is no such element\.                                              |
| boolean               | isEmpty\(\) \#Returns true if this set contains no elements\.                                                                                                                     |
| Iterator<E>           | iterator\(\) \#Returns an iterator over the elements in this set in ascending order\.                                                                                             |
| E                     | last\(\) \#Returns the last \(highest\) element currently in this set\.                                                                                                           |
| E                     | lower\(E e\) \#Returns the greatest element in this set strictly less than the given element, or null if there is no such element\.                                               |
| E                     | pollFirst\(\) \#Retrieves and removes the first \(lowest\) element, or returns null if this set is empty\.                                                                        |
| E                     | pollLast\(\) \#Retrieves and removes the last \(highest\) element, or returns null if this set is empty\.                                                                         |
| boolean               | remove\(Object o\) \#Removes the specified element from this set if it is present\.                                                                                               |
| int                   | size\(\) \#Returns the number of elements in this set \(its cardinality\)\.                                                                                                       |
| Spliterator<E>        | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this set\.                                                                              |
| NavigableSet<E>       | subSet\(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive\) \#Returns a view of the portion of this set whose elements range from fromElement to toElement\. |
| SortedSet<E>          | subSet\(E fromElement, E toElement\) \#Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive\.                      |
| SortedSet<E>          | tailSet\(E fromElement\) \#Returns a view of the portion of this set whose elements are greater than or equal to fromElement\.                                                    |
| NavigableSet<E>       | tailSet\(E fromElement, boolean inclusive\) \#Returns a view of the portion of this set whose elements are greater than \(or equal to, if inclusive is true\) fromElement\.       |

### [AbstractQueue]
| Modifier and Type | Method and Description                                                                                                                                                                                                                            |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available\. |
| boolean           | addAll\(Collection<? extends E> c\) \#Adds all of the elements in the specified collection to this queue\.                                                                                                                                        |
| void              | clear\(\) \#Removes all of the elements from this queue\.                                                                                                                                                                                         |
| E                 | element\(\) \#Retrieves, but does not remove, the head of this queue\.                                                                                                                                                                            |
| E                 | remove\(\) \#Retrieves and removes the head of this queue\.                                                                                                                                                                                       |

#### [PriorityQueue]


## [PriorityQueue]
```java
    PriorityQueue<List<Integer>> pq = new PriorityQueue<>(); // Min heap
    pq.add(1);
    pq.offer(2);
    pq.peek();
    pq.size();
    pq.keySet();
    pq.toArray();
    
    PriorityQueue<Long> smallQueue = new PriorityQueue<>(); // Min heap, Smallest item on top
    PriorityQueue<Long> largeQueue = new PriorityQueue<>(Collections.reverseOrder()); // Max heap, Largest item on top
    
    PriorityQueue<int[]> pq = new PriorityQueue<>(k, (int[] l1, int[] l2) -> l1[0] -l2[0]);
    int[] list = new int[]{0, 1};
    if(!pq.isEmpty() && pq.comparator().compare(list, pq.peek()) > 0) {
    	pq.remove();
    	pq.add(list);
    } else{
    	pq.add(list);
    }
    
    PriorityQueue<List<Integer>> pq = new PriorityQueue<>(k, (List<Integer> l1, List<Integer>l2) -> l1.get(0).compareTo(l2.get(0)));
    List<Integer> list = new ArrayList<>(Arrays.asList(0,1));
    pq.add(list);
    if(pq.comparator().compare(list, pq.peek()) > 0 ){ // Add if new begining larger than current one
    	pq.remove();
    	pq.add(list);
    }
```
| Constructor and Description                                                                                                                                                                           |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| PriorityQueue\(\) \#Creates a PriorityQueue with the default initial capacity \(11\) that orders its elements according to their natural ordering\.                                                   |
| PriorityQueue\(Collection<? extends E> c\) \#Creates a PriorityQueue containing the elements in the specified collection\.                                                                            |
| PriorityQueue\(Comparator<? super E> comparator\) \#Creates a PriorityQueue with the default initial capacity and whose elements are ordered according to the specified comparator\.                  |
| PriorityQueue\(int initialCapacity\) \#Creates a PriorityQueue with the specified initial capacity that orders its elements according to their natural ordering\.                                     |
| PriorityQueue\(int initialCapacity, Comparator<? super E> comparator\) \#Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator\. |
| PriorityQueue\(PriorityQueue<? extends E> c\) \#Creates a PriorityQueue containing the elements in the specified priority queue\.                                                                     |
| PriorityQueue\(SortedSet<? extends E> c\) \#Creates a PriorityQueue containing the elements in the specified sorted set\.                                                                             |

| Modifier and Type     | Method and Description                                                                                                                                                |
|-----------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean               | add\(E e\) \#Inserts the specified element into this priority queue\.                                                                                                 |
| void                  | clear\(\) \#Removes all of the elements from this priority queue\.                                                                                                    |
| Comparator<? super E> | comparator\(\) \#Returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements\. |
| boolean               | contains\(Object o\) \#Returns true if this queue contains the specified element\.                                                                                    |
| Iterator<E>           | iterator\(\) \#Returns an iterator over the elements in this queue\.                                                                                                  |
| boolean               | offer\(E e\) \#Inserts the specified element into this priority queue\.                                                                                               |
| E                     | peek\(\) \#Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty\.                                                           |
| E                     | poll\(\) \#Retrieves and removes the head of this queue, or returns null if this queue is empty\.                                                                     |
| boolean               | remove\(Object o\) \#Removes a single instance of the specified element from this queue, if it is present\.                                                           |
| int                   | size\(\) \#Returns the number of elements in this collection\.                                                                                                        |
| Spliterator<E>        | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this queue\.                                                                |
| Object\[\]            | toArray\(\) \#Returns an array containing all of the elements in this queue\.                                                                                         |
| <T> T\[\]             | toArray\(T\[\] a\) \#Returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array\.           |


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
| Modifier and Type | Method and Description                                                                                                                                                                                        |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean           | add\(E e\) \#Inserts the specified element at the end of this deque\.                                                                                                                                         |
| void              | addFirst\(E e\) \#Inserts the specified element at the front of this deque\.                                                                                                                                  |
| void              | addLast\(E e\) \#Inserts the specified element at the end of this deque\.                                                                                                                                     |
| void              | clear\(\) \#Removes all of the elements from this deque\.                                                                                                                                                     |
| ArrayDeque<E>     | clone\(\) \#Returns a copy of this deque\.                                                                                                                                                                    |
| boolean           | contains\(Object o\) \#Returns true if this deque contains the specified element\.                                                                                                                            |
| Iterator<E>       | descendingIterator\(\) \#Returns an iterator over the elements in this deque in reverse sequential order\.                                                                                                    |
| E                 | element\(\) \#Retrieves, but does not remove, the head of the queue represented by this deque\.                                                                                                               |
| E                 | getFirst\(\) \#Retrieves, but does not remove, the first element of this deque\.                                                                                                                              |
| E                 | getLast\(\) \#Retrieves, but does not remove, the last element of this deque\.                                                                                                                                |
| boolean           | isEmpty\(\) \#Returns true if this deque contains no elements\.                                                                                                                                               |
| Iterator<E>       | iterator\(\) \#Returns an iterator over the elements in this deque\.                                                                                                                                          |
| boolean           | offer\(E e\) \#Inserts the specified element at the end of this deque\.                                                                                                                                       |
| boolean           | offerFirst\(E e\) \#Inserts the specified element at the front of this deque\.                                                                                                                                |
| boolean           | offerLast\(E e\) \#Inserts the specified element at the end of this deque\.                                                                                                                                   |
| E                 | peek\(\) \#Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty\.                                                                          |
| E                 | peekFirst\(\) \#Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty\.                                                                                     |
| E                 | peekLast\(\) \#Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty\.                                                                                       |
| E                 | poll\(\) \#Retrieves and removes the head of the queue represented by this deque \(in other words, the first element of this deque\), or returns null if this deque is empty\.                                |
| E                 | pollFirst\(\) \#Retrieves and removes the first element of this deque, or returns null if this deque is empty\.                                                                                               |
| E                 | pollLast\(\) \#Retrieves and removes the last element of this deque, or returns null if this deque is empty\.                                                                                                 |
| E                 | pop\(\) \#Pops an element from the stack represented by this deque\.                                                                                                                                          |
| void              | push\(E e\) \#Pushes an element onto the stack represented by this deque\.                                                                                                                                    |
| E                 | remove\(\) \#Retrieves and removes the head of the queue represented by this deque\.                                                                                                                          |
| boolean           | remove\(Object o\) \#Removes a single instance of the specified element from this deque\.                                                                                                                     |
| E                 | removeFirst\(\) \#Retrieves and removes the first element of this deque\.                                                                                                                                     |
| boolean           | removeFirstOccurrence\(Object o\) \#Removes the first occurrence of the specified element in this deque \(when traversing the deque from head to tail\)\.                                                     |
| E                 | removeLast\(\) \#Retrieves and removes the last element of this deque\.                                                                                                                                       |
| boolean           | removeLastOccurrence\(Object o\) \#Removes the last occurrence of the specified element in this deque \(when traversing the deque from head to tail\)\.                                                       |
| int               | size\(\) \#Returns the number of elements in this deque\.                                                                                                                                                     |
| Spliterator<E>    | spliterator\(\) \#Creates a late\-binding and fail\-fast Spliterator over the elements in this deque\.                                                                                                        |
| Object\[\]        | toArray\(\) \#Returns an array containing all of the elements in this deque in proper sequence \(from first to last element\)\.                                                                               |
| <T> T\[\]         | toArray\(T\[\] a\) \#Returns an array containing all of the elements in this deque in proper sequence \(from first to last element\); the runtime type of the returned array is that of the specified array\. |



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
