
package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Assignment1 {

    public static void main(String[] args) {
        int[] array = new int[100000];
        array = initiateArray(array);
        long startTime = System.currentTimeMillis();
        array = BubbleSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
        linearSearchAllValuePosition(99997, array);
        long EndTime = System.currentTimeMillis();
        System.out.println("Total time for sorting and searching: " +(double)(EndTime - startTime)/ 1000);
//        int index = linearSearchLastValue(1232, array);
//        System.out.println("Index : " + index);
    }
    
    public static int[] initiateArray(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            array[i] = (int) (Math.random() * 200 + 200);
        }
        return array;
    }
    
    public static void printArray(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            System.out.println(array[i]);
        }      
    }
    
    public static int linearSearchFirstValue(int search, int[] array){
        int length = array.length;
        int counter = -1;
        for(int i = 0; i < length; i++){
            if(array[i] == search){
                counter = i;
                break;
            }
        }
        return counter;
    }
    
    public static int linearSearchLastValue(int search, int[]array){
        int length = array.length;
        int counter = -1;
        for(int i = length - 1; i >= 0 ; i--){
            if(array[i] == search){
                counter = i;
                break;
            }
        }
        return counter;
    }
    
    public static void linearSearchAllValuePosition(int search, int[] array){
        int length = array.length;
        List<Integer> positionList = new ArrayList<>();
        for(int i = 0; i < length; i++){
            if(search == array[i]){
                positionList.add(i+1);
            }
        }
        
        ///// print the positionList
        System.out.println("All positions: ");
        if(positionList.isEmpty()){
            System.out.println("Not Found");
        }else{
            for(Integer position : positionList){
                System.out.print(position + " ");
            }
            System.out.println("");
        }
    }
    
    public static int[] BubbleSort(int[] array){
        long count = 0L;
        int swapped = array.length - 1;
        int lastSwap;
        while(swapped != 0){
            lastSwap = 0;
            for(int i = 0; i < swapped; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    lastSwap = i;
                    count++;
                }
            }
            swapped = lastSwap;
        }
        System.out.println("total looping for sorting: " + count);
        return array;
    }
}
