public class Search {
    public static int binarySearch(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Driver method to test above
    public static void main(String[] args) {

        // 8/2 = 4
        // L = 0
        // R = 4
        int[] arr = { 1, 3, 4, 5, 6, 7, 11, 15 };
        // System.out.println(Search.linearSearch(arr, 1));
        // System.out.println(Search.linearSearch(arr, 5));
        // System.out.println(Search.linearSearch(arr, 11));
        // System.out.println(Search.linearSearch(arr, 17));
        System.out.println(Search.binarySearch(arr, 1));
        System.out.println(Search.binarySearch(arr, 5));
        System.out.println(Search.binarySearch(arr, 11));
        System.out.println(Search.binarySearch(arr, 17));

    }
}