class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int> > vals;
        if(numRows == 0)
            return vals;
            
        vector<int> last(1,1);
        vals.push_back(last);
        
        for(int i = 2; i <= numRows; i ++)
        {// i_th level
            last.push_back(0);
            vector<int> cur = last;
            for(int j = 1; j < i; j ++)
            {
                cur[j] = last[j] + last[j-1];
            }
            vals.push_back(cur);
            last = cur;
        }
        return vals;
        /*
        vector<vector<int> > vals;
        vals.resize(numRows);

        if (numRows >= 1) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            list.add(data);
        }

        if (numRows >= 2) {
            List<Integer> data = new ArrayList<>();
            data.add(1);
            data.add(1);
            list.add(data);
        }

        for(int i = 0; i < numRows; i++) {
            vals[i].resize(i + 1);
            vals[i][0] = 1;
            vals[i][vals[i].size() - 1] = 1;
            for(int j = 1; j < vals[i].size() - 1; j++) {
                vals[i][j] = vals[i - 1][j - 1] + vals[i - 1][j];
            }
        }

        return vals;*/
    }
};