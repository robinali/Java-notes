# Table of Contents
**[LinkedList](#LinkedList)**<br>
**[LeetCode](#LeetCode)**<br>

## [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
```java
List list = new LinkedList();
List list = Collections.synchronizedList(new LinkedList(...));
list.add(e); // add to last(tail)
list.addAll(list);
list.addFirst(e);
list.addLast(e);
list.clear(e);
list.contains(e);
list.element(e); // peek first(head)
list.get(idx);
list.getFirst();
list.getLast();
list.indexof();
list.offer(e); // add to last(tail)
list.offerFirst(e); // add to first(head)
list.offerLast(e); // add to last(tail)
list.peek() // peek first(head)
list.peekFirst();
list.peekLast();
list.poll(); // remove first(head)
list.pollFirst(); // remove first(head)
list.pollLast(); // remove last(tail)
list.pop(); // remove first(head)
list.push(e); // add to first(head)
list.remove(); // remove first(head)
list.remove(idx);
list.remove(o);
list.removeFirst();
list.removeFirstOccurrence(o);
list.removeLast();
list.removeLastOccurrentce(o);
list.set(idx, e);
list.size();
list.toArray();
```

## [LeetCode](https://leetcode.com)
## [LeetCode Questions: Amazon](https://leetcode.com/explore/interview/card/amazon/77/linked-list/)

### Notes
#### ListNode
```java
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
ListNode dummy = new ListNode(0);
```

### Solutions
#### [Add Two Numbers](https://leetcode.com/explore/interview/card/amazon/77/linked-list/513/)
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2, cur = dummy;
        
        int carry = 0;
        while(p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
```
#### [Merge Two Sorted Lists](https://leetcode.com/explore/interview/card/amazon/77/linked-list/2976/)
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null? l2 : l1;
        
        return dummy.next;
    }
}
```
