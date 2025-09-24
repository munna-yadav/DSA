import java.util.Arrays;
public class LargestNumber {

    static String largestNumber(int []nums){

        Arrays.sort(nums);
        String result = "";

        for(int i = nums.length-1; i >=0; i--){
            result+= String.valueOf(nums[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        int []nums = {3,30,34,5,9};
        String result = largestNumber(nums);
        System.out.println(result);
    }
}