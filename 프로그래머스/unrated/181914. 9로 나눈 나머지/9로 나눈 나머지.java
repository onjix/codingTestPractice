import java.lang.Integer;
class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0;i<number.length();i++) {
            answer = answer+ (number.charAt(i)-'0');
        }
        answer = answer % 9;
        return answer;
    }
}