class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuffer an=new StringBuffer();  
        int i=0;
        System.out.print(str1.charAt(0));
        while(i < str1.length()) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
            i++;
        }
        return answer;
    }
}