class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        if(str.length % 2 == 0) {
            for(int i=str.length/2-1;i<str.length/2+1;i++) {
                answer += str[i];
            }
        }
        else {
            answer +=str[str.length/2];
        }
        return answer;
    }
}