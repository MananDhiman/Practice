class LL{

    public static void main(String[] args) {

        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
        };

        int left = 0, top = 0;
        int right = arr[0].length - 1, bottom = arr[0].length - 1;


        while (left < right && top < bottom) {
            // print top row
            for (int i=left; i<=right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // print right col
            for (int i=top; i<=bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // print bottom row
            if (top < bottom) {
                for (int i=right; i>=left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // print left col
            if (left < right) {
                for (int i=bottom; i>=top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

    }
}
