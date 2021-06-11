import java.util.*;

public class Anagram {
    public static boolean anagram(String str1, String str2) {
        // converting string to int array
        int c1[] = countAlpha(str1); // here call countAlpha method
        int c2[] = countAlpha(str2);

        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;

    }

    static int[] countAlpha(String st) {
        int count[] = new int[26];

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 65]++;
            } else if (ch >= 'a' && ch <= 'z') {
                count[ch - 97]++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd String:");
        String str2 = sc.nextLine();
        boolean status = anagram(str1, str2);
        if (status) {
            System.out.println("Yeah.....It is a anagram");
        } else {
            System.out.println("Ooops....It is not a anagram");
        }
    }
}