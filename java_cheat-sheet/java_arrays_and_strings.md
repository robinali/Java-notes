# Table of Contents
**[Arrays](#Arrays)**<br>
**[String](#String)**<br>
**[LeetCode](#LeetCode)**<br>

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
trim();
```
[regex](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum)

## [LeetCode](https://leetcode.com)
## [LeetCode Questions: Amazon](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/)

### Notes
#### [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)
```java
Integer.MAX_VALUE
Integer.MIN_VALUE
Integer.valueOf(str);
Integer.compare(numX, numY);
Integer.bitCount(num);
num.byteValue();
num.doubleValue();
num.floatValue();
Integer.getInteger(str);
Integer.hashCode();
```
#### [Character](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)
```java
Character.compare(chX, chY);
Character.getNumericValue(ch);
Character.hashCode();
Character.isDigit(ch);
Character.isLetter(ch);
Character.isLowerCase(ch);
Character.isSpaceChar(ch);
Character.isUpperCase(ch);
Character.isWhitespace(ch);
Character.toLowerCase(ch);
Character.toUpperCase(ch);
```
#### [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)
```java
Set<Character> hs = new HashSet<>();
hs.add(key);
hs.remove(key);
hs.contains();
hs.clear();
hs.contains(key);
hs.isEmpty();
hs.iterator();
```
#### [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
```java
Map<Integer, Integer> hm = new HashMap<>();
hm.put(key, value);
hm.putIfAbsent(key, value);
hm.get(key); // return null if not found.
hm.getOrDefaulte(key, value);
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

#### [Longest Substring Without Repeating Characters](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2961/)
```java
// Longest Substring Without Repeating Characters: HashSet + 2 pointers solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        
        Set<Character> set = new HashSet<>();
        int count = 0;
        int i = 0, j = 0;
        while(i < s.length()) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                set.add(s.charAt(i));
                count = Math.max(count, i - j + 1);
                i++;
            }
        }
        return count;
    }
}
```
#### [String to Integer (atoi)](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2962/)
```java
class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        
        if(str == null || str.length() == 0) return 0;
        
        int sign = 1;
        int start = 0;
        long rtn = 0;
        
        if(str.charAt(0) == '+') {
            start++;
        } else if(str.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        
        for(int i = start; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return (int) rtn * sign;
            }
            rtn = rtn * 10 + str.charAt(i) - '0';
            if(sign * rtn > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * rtn < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return sign * (int) rtn;
    }
}
```
#### [Container With Most Water](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2963/)
```java
// Container With Most Water: 2 pointers solution (from both side to central)
class Solution {
    public int maxArea(int[] height) {
        int rtn = 0;
        int l = 0, r = height.length - 1;
        while(l < r) {
            rtn = Math.max(rtn, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return rtn;
    }
}
```
#### [Integer to Roman](https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2964/)
```java
class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++) {
            while(num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}
```
