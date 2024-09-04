package Session1;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        //Initializing Array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }
    /**
     * @param numbers
     * @param searchNum
     * @param fixedSum
     * @return
     */
    public static boolean result (int[] numbers, int searchNum, int fixedSum){
        int temp_sum = 0;
        for(int num : numbers){
            //If value is 10
            if(num == searchNum){
                temp_sum += num;
            }
            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }
         //Return true if condition satisfies
         return temp_sum == fixedSum;
    }
    
}
