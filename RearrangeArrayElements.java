package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElements {

    public static void main(String[] args) {

        inputAcceptor();
        
    }

    public static void inputAcceptor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of numbers to order: ");
        Integer numOfNums = sc.nextInt();
        System.out.println("Enter " + numOfNums + " numbers ");
        int[] array = new int[numOfNums];

        for (int i = 0; i < numOfNums; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        sc.close();

        for (int i =0; i < array.length; i++) {
                
            if (!inputArraySizeValidator(array.length)) {
                displayResult(null);
            }
            if (!inputArrayValidate(array)) {
                displayResult(null);
            }
        }

            int[] newArray = computeRearrangedArray(array);
            displayResult(newArray);

    }

    public static boolean inputArraySizeValidator(int size) {
            if (size == 0) {
                return false;
            } return true;
    }

    public static boolean inputArrayValidate(int[] set) {
        for (int i = 0; i < set.length - 1; i++) {
            if(set[i] > set [i + 1]) {
                return false;
            }
        } return true;
    }

    public static int[] computeRearrangedArray(int[] set) {
        int[] rearranged = new int[set.length];
        int length = rearranged.length;

        int index = 0;

        // for (int i = 0; i <= length / 2; i++) {
        //     for (int j = length - 1; j > length / 2; j--) {
            for (int i = 0, j = length-1; i <= length / 2 || j > length / 2;
            i++, j--) {
                if (index < length) {
                    rearranged[index] = set[j];
                    index++;
                }
                if (index < length) {
                    rearranged[index] = set[i];
                    index++;
                }
            }
        
        return rearranged;
    }

    public static void displayResult(int[] set) {

        if (set == null) {
            System.out.println("Give proper input");
        } else {
        for (int i = 0; i < set.length; i++) {
            System.out.print(set[i] + " ");
        }
    }

}




}
