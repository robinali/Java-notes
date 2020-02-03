class Solution {
public:
    vector<int> findOrder(int numCourses, vector<pair<int, int>>& prerequisites) {
        bool vis[numCourses];
        int inDegree[numCourses];
        vector<int> mp[numCourses], res;
        memset(vis, false, sizeof(vis));
        memset(inDegree, 0, sizeof(inDegree));
        for(int i = 0; i < prerequisites.size(); i ++) {
            mp[prerequisites[i].second].push_back(prerequisites[i].first);
            inDegree[prerequisites[i].first] ++;
        }
        for(int del = 0; del < numCourses; del ++) {
            for(int i = 0; i < numCourses; i ++) {
                if(inDegree[i] == 0 && !vis[i]) {
                    res.push_back(i);
                    vis[i] = true;
                    for(int j = 0; j < mp[i].size(); j ++) {
                        inDegree[mp[i][j]] --;
                    }
                    mp[i].clear();
                    break;
                }
            }
        }
        for(int i = 0; i < numCourses; i ++) {
            if(inDegree[i]) {
                res.clear();
                break;
            }
        }
        return res;
    }
};