/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if (root == nullptr) {
            return true;
        }
        stack<TreeNode*> sl, sr;
        sl.push(root);
        sr.push(root);
        TreeNode* left = root->left;
        TreeNode* right = root->right;

        while (left != nullptr || !sl.empty() || right != nullptr || !sr.empty()) {
            if ((left == nullptr && right) || (left && right == nullptr)) {
                return false;
            }

            if (left && right) {
                if (left->val != right->val) {
                    return false;
                }
                sl.push(left);
                sr.push(right);
                left = left->left;
                right = right->right;
            } else {
                left = sl.top();
                sl.pop();
                left = left->right;
                right = sr.top();
                sr.pop();
                right = right->left;
            }
        }
        return true;
    }
};
