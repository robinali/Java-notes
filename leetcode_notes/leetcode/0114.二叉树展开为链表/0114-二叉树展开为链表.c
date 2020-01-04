/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void converstion_SSL(struct TreeNode* root, struct TreeNode** pre) {
    if(!root) return;
    converstion_SSL(root->left, pre);
    struct TreeNode* tmp = root->right;
    if(root->left) {
        (*pre)->right = root->right;
        root->right = root->left;
        root->left = NULL;
    } else {
        (*pre) = root;
    }
    converstion_SSL(tmp, pre);
}

void flatten(struct TreeNode* root){
    struct TreeNode* prev = NULL;
    converstion_SSL(root, &prev);
}

