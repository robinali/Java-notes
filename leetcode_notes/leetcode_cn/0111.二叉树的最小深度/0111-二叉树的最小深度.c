/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


int minDepth(struct TreeNode* root){
    if(!root) return 0;
    if(!root->left) return (!root->right)? 1: minDepth(root->right) + 1;
    else if(!root->right) return minDepth(root->left) + 1;
    
    int lMin, rMin;
    return ((lMin = minDepth(root->left)) < (rMin = minDepth(root->right))) ? lMin + 1 : rMin + 1;
}

