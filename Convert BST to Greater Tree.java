class Solution {
    Integer greaterNodeSum = 0;

    // TC : O(n)
    // SC : H = O(logn)
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        convertBST(root.right);
        root.val = root.val + greaterNodeSum;
        greaterNodeSum = root.val;
        convertBST(root.left);
        return root;

    }
}