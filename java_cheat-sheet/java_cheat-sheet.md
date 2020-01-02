java hierarchy

| [object](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)             |            |        |             |         |               |             |         |            |               |
|--------------------|------------|--------|-------------|---------|---------------|-------------|---------|------------|---------------|
| AbstractCollection |            |        |             |         |               | AbstractMap |         | ArrayDeque | StringBuilder |
| AbstractList       |            |        | AbstractSet |         | AbstractQueue | HashMap     | TreeMap |            |               |
| ArrayList          | LinkedList | Vector | HashSet     | TreeSet | PriorityQueue |             |         |            |               |
|                    |            | Stack  |             |         |               |             |         |            |               |

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
