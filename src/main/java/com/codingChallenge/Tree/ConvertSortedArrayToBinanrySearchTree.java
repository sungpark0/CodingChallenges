package com.codingChallenge.Tree;

import com.codingChallenge.BinarySearch.BinarySearch;

public class ConvertSortedArrayToBinanrySearchTree extends BinaryTreeInOrderTraversal {

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;

        return insertArrayToBST(nums, 0, nums.length-1);
    }

    public static TreeNode insertArrayToBST(int[] nums, int low, int high){
        if(low > high) return null;

        int mid = (low+high) /2 ;

        TreeNode result = new TreeNode(nums[mid]);

        result.left = insertArrayToBST(nums, low, mid-1);
        result.right = insertArrayToBST(nums,mid+1, high);

        return result;
    }


    public static void main(String[] args) {

    }
}
