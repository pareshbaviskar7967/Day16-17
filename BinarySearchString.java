import java.util.*;

public class BinarySearchString {
    public static int binarySearch(int arr[], int l, int h) {
        int m = 0;
        string str = (int) str;
        while (l <= h) {
            m = (l + h) / 2;

            if (arr[m] == str) {
                return 1;
            } else if (arr[m] > str) {
                h = m - 1;
            } else if (arr[m] < str) {
                l = m + 1;
            }
        }
        return 0;
    }

    public static int binaryStringSearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) // the start should not be great then end
        {
            mid = (low + high) / 2; // the start should not be great then end

            if (a[mid].equals(x)) {
                return 1;
            } else if (a[mid].compareTo(x) < 0) // compare using---compareTo method return -1,0,1
            {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String array[] = { "EWRSFSFSFSB", "BB", "AA", "SDFSFJ", "WRTG", "FF", "ERF", "FED", "TGH" };
        Scanner sc = new Scanner(System.in);
        System.out.println("given array is: EWRSFSFSFSB, BB, AA, SDFSFJ, WRTG, FF ,ERF, FED, TGH ");
        System.out.println("Enter the word : ");
        String str = sc.nextLine();
        Arrays.sort(array); /// to sort the String array
        System.out.println("The entered string is: " + str);
        int ans = binaryStringSearch(array, str);
        if (ans == 1) {
            System.out.println("The String is found ");
        } else
            System.out.println("The String not found ");
    }
}