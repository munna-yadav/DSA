class KadanesAlgorithm {

    public static int betterApproach(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Integer.max(max, sum);
            }
        }
        return max;
    }

    public static int optimalApproach(int []arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (sum < 0 ) {
                sum = 0;
            }
            max = Integer.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { -2,-4,4,4,-1,5 };
        int max = optimalApproach(arr);
        System.out.println(max);
        
    }
}