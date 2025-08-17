
class SortColors{

    static void sort(int[] nums)
    {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int ele : nums) {
            if (ele == 0) count0++;
            else if (ele == 1) count1++;
            else if (ele == 2) count2++;
        }

        for (int i = 0; i < count0; i++) nums[i] = 0;
        for (int i = count1; i < count0 + count2; i++) nums[i] = 1;
        for (int i = count0 + count1; i < nums.length; i++) nums[i] = 2;
    }

    public static void main(String[] args)
    {

        int []nums = { 1, 2, 0, 2, 0, 1, 2, 1 };
        sort(nums);
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
