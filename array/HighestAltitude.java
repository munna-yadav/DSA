public class HighestAltitude {


    static int solution(int []gain){

        int max = 0;
        int current = 0;

        for(int ele: gain){
            current  += ele;
            max = Math.max(current,max);

        }
        return max;
    }
    public static void main(String[] args) {
        int []gain = {-5,1,5,0,-7};
        int result = solution(gain);
        System.out.println(result);
    }
}