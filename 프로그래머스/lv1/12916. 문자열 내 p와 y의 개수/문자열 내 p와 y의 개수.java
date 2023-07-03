class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pc = 0;
        int yc = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pc++;
            }
            if(s.charAt(i) == 'y'|| s.charAt(i) == 'Y') {
                yc++;
            }
        }
        if(pc == yc) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}