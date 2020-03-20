# Table of Contents
**[Arrays](#Arrays)**<br>
**[String](#String)**<br>
**[LeetCode Questions: Amazon](#LeetCode Questions: Amazon)**<br>

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

## [LeetCode Questions: Amazon](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/)

### Notes
#### [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
```java
// Notes:
// HashMap:
Map<Integer, Integer> hm = new HashMap<>();
hm.get(key); // return null if not found.
hm.getOrDefaulte(key, value);
hm.putIfAbsent(key, value);
hm.put(key, value);
hm.remove(key);
hm.replace(key,value);
hm.entrySet();
hm.keySet();
hm.values();
```
### [Hashtable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html)
[HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.](https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/)


### Solutions
#### [Two Sum](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/)
```java
// Two Sum: HashMap solution
class Solution {
    private Map<Integer, Integer> hm;
    
    public int[] twoSum(int[] nums, int target) {
        this.hm = new HashMap<>();
        int idx = 0;
        for(int num: nums) {
            int pair = this.hm.getOrDefault(num, -1);
            if(pair >= 0) return new int[]{pair, idx};
            else {
                this.hm.put(target - num, idx);
            }
            idx++;
        }
        return new int[]{-1, -1};
    }
}
```
