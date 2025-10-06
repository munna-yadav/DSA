public class SubArraySumEquals {

    // https://leetcode.com/problems/subarray-sum-equals-k/
    /*
        * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

        A subarray is a contiguous non-empty sequence of elements within an array.
    

            Example 1:

            Input: nums = [1,1,1], k = 2
            Output: 2

     */

    static int solution(int []nums, int k){

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {

            sum += nums[j];
            if(sum == k){
                count ++;
            }
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int []nums = {1,-1,0};
        int result = solution(nums, 0);
        System.out.println(result);
    }
}