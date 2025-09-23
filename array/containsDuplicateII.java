public class containsDuplicateII {


    /*
     * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
     */
    static boolean solution(int []arr, int k){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && Math.abs(i - j) <=k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,1,2,3};
        int k = 2;
        boolean solution = solution(arr, k);
        System.out.println(solution);
    }
}