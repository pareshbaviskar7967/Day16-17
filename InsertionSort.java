class InsertionSort {
    public static void main(String h[]) {
        System.out.println("The insertion Sort.");
        int[] a = { 100, 12, 31, 53, 4, 13, 27, 11 };
        int i, j, temp;
        for (i = 1; i < a.length; i++) {
            j = i - 1;
            while (j >= 0 && a[j] > a[i]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i = j;
                j--;

            }
        }
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
    }
}