class TwoSum {
    // 170
    // Reference: cspiration
    
    private Map<Integer, Integer> map;
    private List<Integer> list;

    /** Initialize your data structure here. */
    public TwoSum() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(!map.containsKey(number)) {
            map.put(number, 1);
            list.add(number);
        } else {
            map.put(number, map.get(number) + 1);
        }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        // Time: O(n)
        for(Integer num1 : list) {
            int num2 = value - num1;
            if(num1 == num2 && map.get(num1) > 1 || (num1 != num2 && map.containsKey(num2))) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */