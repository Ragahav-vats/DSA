import java.util.*;

public class BubbleSort {
    public static void PrintArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[] = {7,3,1,8,2};

        // sorting
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr);
    }
}