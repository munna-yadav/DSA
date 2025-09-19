import java.util.Arrays;

public class ValidAnagram{
    static boolean solution(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char []sArray = s.toCharArray();
        char []tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "cars";
        boolean result = solution(s, t);
        System.out.println(result);
    }
}