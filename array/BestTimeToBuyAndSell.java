public class BestTimeToBuyAndSell {
    static int BruteForce(int []arr){
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
    
    static int optimal(int []arr){
        int min = arr[0];
        int maxPro = 0;
        for (int i = 1; i < arr.length; i++){
            int profit = arr[i] - min;
            maxPro =  Integer.max(maxPro, profit);
            min = Integer.min(min, arr[i]);
        }
        return maxPro;
    }
    public static void main(String[] args) {
         int arr[] = {7,1,5,3,6,4};

    int maxPro = optimal(arr);
    System.out.println("Max profit is: " + maxPro);
    }
}
