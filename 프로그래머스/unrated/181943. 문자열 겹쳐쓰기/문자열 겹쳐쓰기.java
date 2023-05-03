class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] ar = my_string.toCharArray();
        for(int i=0;i<overwrite_string.length();i++) {
            ar[s+i] = overwrite_string.charAt(i);
        }
        for(char a :ar) {
            answer +=a;
        }
        
        return answer;
    }
}