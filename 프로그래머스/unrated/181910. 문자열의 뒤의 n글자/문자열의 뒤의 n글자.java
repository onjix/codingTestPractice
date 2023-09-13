class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int size = my_string.length();
        int init = size - n;
        for(int i=init;i<size;i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}