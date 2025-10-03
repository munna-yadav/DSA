import java.util.Arrays;

public class MergerSortedArray {

    static void solution(int []nums1,int n,  int[] nums2,int m){
         int j = 0;

        for(int i = m; i < m+n; i ++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }

    static void optimal(int []nums1, int n, int []nums2, int m){
        int i = n -1;
        int j = m -1;
        int k = m + n - 1;

        while( i >= 0 && j >= 0){

            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else{
                nums2[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};
        int n = 3; 
        int m = 3;
        solution(nums1, n, nums2, m);
        System.out.println(Arrays.toString(nums1));

    }
}