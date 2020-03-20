# Table of Contents
**[Trees](#Trees)**<br>
**[Graphs](#Graphs)**<br>
**[LeetCode](#LeetCode)**<br>

## [Trees]
### [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)
```java
```
### [TreehMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreehMap.html)
```java
```

## [Graphs]
```java
```

## [LeetCode](https://leetcode.com)
## [LeetCode Questions: Amazon](https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/)

### Notes
```java
```

### Solutions
#### [Symmetric Tree](https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/507/)
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
    
    private boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isSymmetric(t1.right, t2.left) && isSymmetric(t1.left, t2.right);
    }
}
```
