import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String str = "";
        for(int i=0;i<my_string.length();i++) {
            for(int j=i;j<my_string.length();j++) {
                str += my_string.charAt(j);
            }
            // System.out.println(str);
            answer[i] = str;
            str = "";
        }
        Arrays.sort(answer);
        return answer;
    }
}