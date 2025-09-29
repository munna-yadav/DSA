import java.util.Arrays;

public class RotateArraybyK {

   

    static int[] reverseApproach(int []nums, int k){

        int n = nums.length;
        reverse(nums, 0, n-1);

        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

        return nums;
        
    }

    static void reverse(int []nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int []result = reverseApproach(arr, k);
        System.out.println(Arrays.toString(result));
    }
}