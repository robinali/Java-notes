class Solution {
public:

    void twoSum(vector<int> &numbers, int begin, int first, int second, int target, vector<vector<int>>& ret) {
       if(begin >= numbers.size()-1)
            return;
        int b = begin;
        int e = numbers.size()-1;
        while(b < e)
        {
            int rest = numbers[b]+numbers[e];
            if(rest == target)
            {
                vector<int> tmp_ret;
                tmp_ret.push_back(first);
                tmp_ret.push_back(second);
                tmp_ret.push_back(numbers[b]);
                tmp_ret.push_back(numbers[e]);
                ret.push_back(tmp_ret);
                do{b++;}
                while(b<e && numbers[b] == numbers[b-1]);
                do{e--;}
                while(b<e && numbers[e] == numbers[e+1]);
            }
            else if(rest < target)
                ++b;
            else
                --e;
        }
    }
    vector<vector<int> > fourSum(vector<int> &num, int target) {
        vector<vector<int>> ret;
        if(num.size() <= 3) //invalid corner case check
            return ret;
        sort(num.begin(), num.end()); //cause we need the result in quadruplets should be non-descending
        for(int i = 0; i < num.size()-3; ++i)
        {
            if(i > 0 && num[i] == num[i-1])
                continue;
            for(int j = i+1; j < num.size()-2; ++j)
            {
                if(j > i+1 && num[j] == num[j-1])
                    continue;
                twoSum(num, j+1, num[i], num[j], target-(num[i]+num[j]), ret);
            }
        }
        return ret;
    }
};