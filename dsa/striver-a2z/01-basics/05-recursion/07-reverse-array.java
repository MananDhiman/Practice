class Main {
  static void rev(int[] arr) {
    rev(arr, 0);
  }
  static void rev(int[] arr, int i) {
    int l = i, r = arr.length - 1 - i;

    if(l >= r) return;

    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;

    rev(arr, i+1);
  }
  public static void main(String[] args) {
    int[] arr = {0,1,2,3,4,5,6,7};

    for(int i: arr) System.out.print(i + " ");

    System.out.println();
    rev(arr);
    for(int i: arr) System.out.print(i + " ");
  }
}