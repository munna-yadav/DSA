public class LengthOfLastWord {

    static int solution(String s){
        s = s.trim();
        int count = 0;

        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i)== ' '){
                break;
            }
            count++;

        }
        return count;

    }
    public static void main(String[] args) {
        String input = " My name is Munnas";
        int result = solution(input);
        System.out.println(result);
    }

}