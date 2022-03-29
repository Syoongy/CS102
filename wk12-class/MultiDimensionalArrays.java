import java.util.*;

public class MultiDimensionalArrays {

    public static void doMagic(int[] arr) {
        // arr[0] = 3;

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] + 2;
        }
        // This only changes the local arr to {3,4}
        // The argument passed in does not change
        arr = result;
    }

    public static void doMultiDimensionalMagic(int[][] arr) {
        int[] result = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            result[i] = arr[0][i] + 2;
        }
        
        arr[0] = result;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2};
        // int[][] twoDArr = { { 3, 4 }, { 5, 6 } };
        // int[] oneDArr = { 3, 4 };
        // int[] oneDArr2 = { 5, 6 };
        // int[][] twoDArr2 = { oneDArr, oneDArr2 };

        // System.out.println(twoDArr[0][0] == twoDArr2[0][0]);
        int[] arr = { 1, 2 };
        doMagic(arr);
        System.out.println(Arrays.toString(arr));

        int[][] multiArr = { { 1, 2 } };
        doMultiDimensionalMagic(multiArr);
        System.out.println(Arrays.toString(multiArr[0]));

        // Jagged Array
        int[][] jaggedArr = { { 1, 2, 3 }, { 4, 5 }, { 6 } };
        doMultiDimensionalMagic(multiArr);
        System.out.println(Arrays.toString(multiArr[0]));
    }
}
