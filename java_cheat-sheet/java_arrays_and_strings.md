# Table of Contents
**[Arrays](#Arrays)**<br>
**[String](#String)**<br>

## [Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
```java
// declares an array of integers
int[] anArray;
// create an array of integers
anArray = new int[10];
// use the shortcut syntax to create and initialize an array
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

class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
public static void arraycopy(Object src, int srcPos,
                             Object dest, int destPos, int length)
class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
class ArrayCopyOfDemo {
    public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo));
    }
}
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
