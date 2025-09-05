import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class twoSum {

    static int[] sum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    static int[] optimal(int []nums, int target){

            Set<Integer> set = new HashSet<>();
            int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int subtrahand = target - nums[i];
            if (set.contains(subtrahand)){
                int index = getIndexOf(subtrahand, nums);
                result[0] = i;
                result[1] = index;
            }
            set.add(nums[i]);
        }
        return result;
    }

    static int getIndexOf(int n, int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] result = optimal(arr, 9);
        for (int ele : result) {
            System.out.println(ele + " ");
        }
    }
}