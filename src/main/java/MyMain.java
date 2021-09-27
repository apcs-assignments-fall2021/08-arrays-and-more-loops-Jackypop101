import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int w = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (i != 0) {
                arr[i - 1] = x;
            }
            else{
                arr[arr.length-1] = x;
            }
        }
        arr[arr.length-2] = w;
        return arr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int w = arr[0];
        for (int i = arr.length-1; i >= 0; i--) {
            int x = arr[i];
            if (i != arr.length-1) {
                arr[i + 1] = x;
            }
            else{
                arr[0] = x;
            }
        }
        arr[1] = w;
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int j = 0; j < arr.length; j++){
            int x = arr[j];
            if (x != -1) {
                for (int i = j+1; i < arr.length; i++) {
                    int y = arr[i];
                    if (y == x) {
                        arr[i] = -1;
                    }
                    else {
                        arr[i] = y;
                    }
                }
            }
            else{
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
