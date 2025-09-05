import java.util.*;

public class ThreeSum {

    static List<List<Integer>> threeSumBrute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {  
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }

    static List<List<Integer>> optimal(int []nums){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i+1; j < nums.length; j++) {
                int k  = -(nums[i] + nums[j]);
                if (set.contains(k)) {
                    List<Integer> list = Arrays.asList(nums[i],nums[j],k);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                }
                set.add(nums[j]);
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans1 = threeSumBrute(nums);
        List<List<Integer>>ans2 = optimal(nums);
        System.out.println(ans2);
        System.out.println(ans1);
    }
}
