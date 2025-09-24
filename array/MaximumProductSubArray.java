public class MaximumProductSubArray {

/*  Given an integer array nums, find a
    that has the largest product, and return the product.
    The test cases are generated so that the answer will fit in a 32-bit integer.
*/ 
    static int solution(int []nums){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
             int product = 1;
            for (int j = i; j < nums.length; j++) {
               
                   product = product * nums[j];
                    max = Math.max(max, product);
               
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {2,0,2,3};
        int result = solution(arr);
        System.out.println(result);
    }
}