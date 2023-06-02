class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int j=0;
        for(int[] part : parts) {
            for(int i=part[0];i<=part[1];i++) {
                answer += my_strings[j].charAt(i);
            }
            j++;
        }
        return answer;
    }
}