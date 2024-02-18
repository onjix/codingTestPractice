class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer ="";
        boolean boo = true;
        for(String c : str) {
            if(boo == true) {
                answer += c.toUpperCase();
            }
            else {
                answer += c.toLowerCase();
            }
            boo = c.equals(" ") ? true : false;
        }
        return answer;
    }
}