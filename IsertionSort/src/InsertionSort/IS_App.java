package InsertionSort;

import java.io.IOException;

public class IS_App {
    public static void main(String[] args) throws IOException {
//  input n elements in random array
        int[] myArray = IS_Utility.inputArray();

        System.out.println("Unsorted Array");
        IS_Utility.printArray(myArray);

//        call the method to sort the elements
        IS_Utility.InsertionSort(myArray);

        System.out.println("Sorted Array");
        IS_Utility.printArray(myArray);
    }
}