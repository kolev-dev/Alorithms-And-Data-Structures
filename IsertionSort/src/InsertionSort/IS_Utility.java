package InsertionSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;



public class IS_Utility {
    public static int[] inputArray() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr, 16384);

        System.out.println("Input n number");
        int n = Integer.parseInt(reader.readLine());

        return new Random().ints(n, 1, 100).toArray();
    }



    public static void printArray(int [] myArray) {
        System.out.println(Arrays.toString(myArray));

    }

    public static void InsertionSort(int [] myArray) {
        int i;
        int n = myArray.length;
        for (i = 0; i < n ; i++) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key){
                myArray[j + 1] = myArray[j];
                j--;

            }
            myArray[j+1] = key;
        }
    }

}