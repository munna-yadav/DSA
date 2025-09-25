import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumII {

    static int [] solution(int []nums, int target){
        int []result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target- nums[i];
            if(map.containsKey(required)){
                int index = map.get(required);
                result[0] =index+1;
                result[1] = i+1;

            }
            map.put(nums[i], i);
            

        }
        return result;
    }
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;

        int []result = solution(nums, target);
        System.out.println(Arrays.toString(result));

    }
}