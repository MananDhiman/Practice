class arr_sub {

    static void subarray(int[] arr) {
        int l = arr.length;
        // start index
        for (int start = 0; start < l; start++) {
            // end index
            for (int end = start; end < l; end++) {
                // from start to end
                for (int it = start; it < end; it++) {
                    System.out.print(arr[it] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    static void subseq(int[] arr, int start) {
        if (start >= arr.length) return;

        subseq(arr, start + 1);
        // System.out.println();

        System.out.println(arr[start]);

        subseq(arr, start + 1);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // subarray(arr);
        subseq(arr, 0);
    }
}
