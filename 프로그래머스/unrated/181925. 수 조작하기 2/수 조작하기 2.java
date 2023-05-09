class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int pre = 0;
        int cur = 0;
        for(int i=1;i<numLog.length;i++) {
            pre = numLog[i-1];
            cur = numLog[i];
            switch(cur-pre) {
                case 1: 
                    answer +="w";
                    break;
                case -1: 
                    answer +="s";
                    break;
                case 10: 
                    answer +="d";
                    break;
                case -10:
                    answer +="a";
                    break;
            }
        }
        return answer;
    }
}