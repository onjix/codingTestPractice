import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        int i=0;
        for(char c : b) {
            if(Character.isUpperCase(c)) {
                b[i] = Character.toLowerCase(c);
            }
            else {
                b[i] = Character.toUpperCase(c);
            }
            System.out.print(b[i]);
            i++;
        }
    }
}