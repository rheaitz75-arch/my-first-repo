public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found it!
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 90};
        int target = 30;
        
        int result = search(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
