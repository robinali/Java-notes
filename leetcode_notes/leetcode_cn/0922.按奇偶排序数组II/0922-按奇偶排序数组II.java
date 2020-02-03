class Solution {
    public int[] sortArrayByParityII(int[] A) {
        if (A.length <= 1) {
            return A;
        }

        int i = 0;
        int nextEven = 0;
        int nextOdd = 1;
        boolean isEven = false;
        for (i = 0; i<A.length; i++) {
        System.out.println("i is " + i);
        isEven = i % 2 == 0 ? true : false;
            if ((isEven  && A[i] % 2 == 0) ||
                (!isEven  && A[i] % 2 != 0))
            {
                continue;
            }

            // For even idx, loop for next even number on odd idx
            if (isEven) {
                for (nextEven = (nextEven <= i ?  i + 1 : nextEven); nextEven<A.length; nextEven += 2) {
                    if(A[nextEven] % 2 == 0) {
                        int tmp = A[i];
                        A[i] = A[nextEven];
                        A[nextEven] = tmp;
                        break;
                    }
                }
            }
            else {
                for (nextOdd = (nextOdd <= i ?  i + 1 : nextOdd); nextOdd<A.length; nextOdd += 2) {
                    if(A[nextOdd] % 2 != 0) {
                        int tmp = A[i];
                        A[i] = A[nextOdd];
                        A[nextOdd] = tmp;
                        break;
                    }
                }
            }
        }
        return A;
    }
}