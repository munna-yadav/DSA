class SubarrayWithSum {
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 7, 5 };
        int target = 12;

        findSubarray(arr, target);
    }

    public static void findSubarray(int[] arr, int target)
    {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }
}
