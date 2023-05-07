class Solution {
    public String solution(String code) {
        String answer = "";
        int mode =0;
        char[] ar = code.toCharArray();
        for(int i=0;i<ar.length;i++) {
            if(ar[i] == '1') {
                if(mode == 0) {
                    mode = 1;
                }
                else {
                    mode = 0;
                }
                continue;
            }
            
            if(mode == 0) {
                if(i % 2 == 0) {
                    answer += ar[i];
                }
            }
            else {
                if(i % 2 == 1) {
                    answer += ar[i];
                }
            }
        }
        if(answer.length() == 0) {
                answer = "EMPTY";
            }
        return answer;
    }
}