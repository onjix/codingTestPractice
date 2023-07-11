import java.util.Arrays;
class Solution {
    public String solution(String s) {
        // int[] num = Integer.parseInt(s.split(" "));
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        for(int i = 0;i<num.length;i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        String answer = "";
        answer += Integer.toString(num[0]);
        answer += " ";
        answer += Integer.toString(num[num.length-1]);
        
        return answer;
    }
}