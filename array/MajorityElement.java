import java.util.Arrays;
public class MajorityElement {

    /*
        * Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
     */

    static int solution(int []nums){
        Arrays.sort(nums);
        return nums[(nums.length)/ 2];

    }
    public static void main(String[] args) {
        int []arr = {2,2,1,1,1,2,2};
        int majority = solution(arr);
        System.out.println(majority);
    }
}