import java.util.Arrays;

public class ProductExcpetSelf{

    static int[] solution(int []arr){
        int []result = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            int prod = 1;
            for(int j = 0; j < arr.length; j++){
                if (arr[i] != arr[j]) {
                    prod *= arr[j];
                }
                result[i] = prod;
                
            }
        }
        return result;
    }

    static int[] optimalSolution(int []nums){

        int n = nums.length;

        int []prefixProductFromStart = new int[n];
        int []prefixProductFromEnd = new int[n];
        int []result = new int[n];

        //find product from left
        prefixProductFromStart[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixProductFromStart[i] = prefixProductFromStart[i-1] * nums[i];
        }

        // storing product from right side of the array
        prefixProductFromEnd[n-1] = nums[n -1];
        for(int i = n-2; i > 0; i--){
            prefixProductFromEnd[i] = prefixProductFromEnd[i + 1] * nums[i];
        }


        // storing the result

        result[0] = prefixProductFromStart[0];
        result[n -1 ] = prefixProductFromEnd[n -2];
        for(int i = 1; i < n - 1; i++){
            result[i] = prefixProductFromStart[ i - 1] * prefixProductFromEnd[ i + 1];
        }

        return result;

    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int []result = solution(arr);
        System.out.println(Arrays.toString(result));
    }
}