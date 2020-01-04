/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        if(n < 2) return -1;
        int cel = 0;
        for(int i = 1; i < n; i++) {
            if(knows(cel, i)) {
                cel = i;
            }
        }
        for(int i = 0; i < n; i++) {
            if(cel != i && (knows(cel, i) || !knows(i, cel))) {
                return -1;
            }
        }
        return cel;
    }
}