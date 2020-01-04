class MyLinkedList {
    
    static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    Node head = null;
    private int length = 0;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    public int length() {
        return length;
    }
    
    private Node findAtIndex (int index) {
        if(length == 0 || index > length - 1)
            return null;
        if(index <= 0)
            return head;
        
        Node result = head.next;
        int idx = 1;
        while (idx < index) {
            result = result.next;
            idx++;
        }
        return result;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node result = findAtIndex(index);
        return result != null ? result.value : -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(length, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > length)
            return;
        
        Node nodeAtIndex = findAtIndex(index - 1);
        Node node = new Node(val);
        if(nodeAtIndex == null)
            head = node;
        else if(index == 0) {
            node.next = head;
            head = node;
        }
        else {
            node.next = nodeAtIndex.next;
            nodeAtIndex.next = node;
        }
        length++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(length == 0 || index > length - 1 || index < 0)
            return;
        
        if(index == 0)
            head = head.next;
        else {
            Node nodeAtIndex = findAtIndex(index - 1);
            if(nodeAtIndex.next != null)
                nodeAtIndex.next = nodeAtIndex.next.next;
        }
        length--;
    }
    
    public String toString() {
        String result = "";
        if(head == null)
            return result;
        
        Node node = head;
        while (node != null) {
            if(result == "")
                result += head.value;
            else
                result += "->" + node.value;
            node = node.next;
        }
        return result;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */