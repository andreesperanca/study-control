package arrays;// Java program to demonstrate
// return of array from method

class code06_returning_array_from_method {
    // Driver method
    public static void main(String args[]) {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    public static int[] m1() {
        // returning array
        return new int[]{1, 2, 3};
    }
}