import java.util.HashMap;
import java.util.Map;

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

    static boolean optimalSolution(int []arr, int k){
    Map<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i < arr.length; i++){
        if(map.containsKey(arr[i])){
            int prevIndex = map.get(arr[i]);
            if(i - prevIndex <= k){   
                return true;
            }
        }
        map.put(arr[i], i); 
    }
    return false;
}

    public static void main(String[] args) {
        int []arr = {1,0,1,1};
        int k = 1;
        boolean result = optimalSolution(arr, k);
        System.out.println(result);
    }
}