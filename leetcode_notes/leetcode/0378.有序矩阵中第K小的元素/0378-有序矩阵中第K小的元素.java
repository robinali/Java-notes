class Pointer implements Comparable<Pointer> {
    int x, y, val;
    Pointer(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
    
    @Override
    public int hashCode() {
        return this.x + this.y;
    }
    
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Pointer))
            return false;
        Pointer o = (Pointer)other;
        if (this.x == o.x && this.y == o.y)
            return true;
        else
            return false;
    }
    
    @Override
    public int compareTo(Pointer other) {
        if(this.val == other.val) {
            if (this.x == other.x)
                return Integer.compare(this.y, other.y);
            else
                return Integer.compare(this.x, other.x);      
        }
        return Integer.compare(this.val, other.val);
    }
}

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        if (n == 0 || k > n * n) return -1;
        
        PriorityQueue<Pointer> pq= new PriorityQueue<Pointer>();
        
        int count = 0, i = 0, j = 0, v = 0;
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>(n * n);
        Pointer p = new Pointer(i, j, matrix[i][j]);
        pq.offer(p);
        visited.put(i * n + j, p.val);
        
        while(!pq.isEmpty()){
            Pointer min = pq.poll();
            i = min.x;
            j = min.y;
            count++;
            
            if (count == k)
                return matrix[i][j];
            else {
                if(min.x < n - 1){
                    p = new Pointer(min.x + 1, min.y, matrix[min.x + 1][min.y]);
                    int key = p.x * n + p.y;
                    if(!visited.containsKey(key)){
                        visited.put(key, p.val);
                        pq.offer(p); 
                    }               
                }
                if(min.y < n - 1) {                    
                    p = new Pointer(min.x, min.y + 1, matrix[min.x][min.y + 1]);
                    int key = p.x * n + p.y;
                    if(!visited.containsKey(key)){
                        visited.put(key, p.val);
                        pq.offer(p); 
                    }               
                }
            }
        }
        return -1;
    }
}