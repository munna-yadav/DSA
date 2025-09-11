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

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int []result = solution(arr);
        System.out.println(Arrays.toString(result));
    }
}