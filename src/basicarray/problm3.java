package basicarray;

import java.util.Arrays;

public class problm3 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,5,7,8};
        int n=arr.length;

        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];

            }
        }

                arr[j++]=arr[arr.length-1];
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




/*

int n = arr.length;: The variable n is assigned the length of the array arr.
int j = 0;: We initialize an integer variable j to keep track of the unique elements in the array.
for (int i = 0; i < n-1; i++) {: This for loop iterates through the array from index 0 to n-2 (i.e., the second-to-last element).
Inside the loop:
if (arr[i] != arr[i + 1]) {: This condition checks if the current element (arr[i]) is different from the next element (arr[i + 1]).
If they are different, we consider it a unique element.
arr[j] = arr[i];: We store this unique element at the position indicated by j.
j++;: Increment j to prepare for the next unique element.
arr[j++] = arr[arr.length-1];: After the loop, we add the last element of the original array (arr[arr.length-1]) to the unique elements.
 This ensures that the last element is included even if it’s not repeated.
Finally, we print the unique elements of the array using the following loop
 */