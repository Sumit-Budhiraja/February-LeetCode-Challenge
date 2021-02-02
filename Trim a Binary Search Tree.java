class Solution {
    // TC O(n)
    // SC O(logn), n are the no of nodes in the tree
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) {
            return null;
        } else {
            if(root.val>=low && root.val <=high){
                root.left = trimBST(root.left, low, high);
                root.right = trimBST(root.right, low, high);
            } else if(root.val<low){
                return trimBST(root.right, low, high);
            } else if(root.val>high){
                return trimBST(root.left, low, high);
            }
            return root;
        }
    }
}