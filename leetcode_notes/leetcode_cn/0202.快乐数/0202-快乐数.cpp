class Solution {
public:
    bool isHappy(int n) {
    int sum = 0;
    int temp1, temp2;

    while (true){
        do{
            temp1 = n / 10;
            temp2 = n % 10;
            n = temp1;
            sum = sum + temp2 * temp2;
        } while (temp1 > 0);

        if (sum == 1){
            return true;
        }
        else{
            if (sum == 4 || sum == 20 || sum == 16 || sum == 37 || sum == 42 || sum == 58 || sum == 89 || sum == 145){
                return false;
            }
        }
        n = sum;
        sum = 0;
        }
    }
};