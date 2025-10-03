import java.util.Arrays;

public class PrefixSum {

    static int[] solution(int []nums){

        int n = nums.length;

        int []result = new int[n];

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+= nums[i];
            result[i] = sum;
            
        }
        return result;

    }

    public static void main(String[] args) {
        int []nums = {10,20,10,30,20};
        int []result = solution(nums);
        System.out.println(Arrays.toString(result));
    }
}