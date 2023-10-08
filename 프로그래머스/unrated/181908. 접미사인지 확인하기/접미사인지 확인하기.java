class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] ar = new String[my_string.length()];
        String str = "";
        for(int i=0;i<my_string.length();i++) {
            for(int j=i;j<my_string.length();j++) {
                str += my_string.charAt(j);
            }
            ar[i] = str;
            str = "";
        }
        for(String a : ar) {
            if(a.equals(is_suffix)) {
                answer = 1;
            }
        }
        return answer;
    }
}