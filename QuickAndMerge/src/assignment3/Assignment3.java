package assignment3;

import java.util.Scanner;

public class Assignment3 {
    
    public static long comparisonInQuickSort = 0L;
    public static long movementInQuickSort = 0L;
    public static long comparisonInMergeSort = 0L;
    public static long movementInMergesort = 0L;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        initiateArray(array);
        long startTimeForQuick = System.currentTimeMillis();
        quickSort(array, 0, array.length);
        long endTimeForQuick = System.currentTimeMillis();
        long timeForQuick = endTimeForQuick - startTimeForQuick;
        //printArray(array);
        initiateArray(array);
        
        long startTimeForMerge = System.currentTimeMillis();
        mergeSort(array, 0, array.length - 1);
        long endTimeForMerge = System.currentTimeMillis();
        long timeForMerge = endTimeForMerge - startTimeForMerge;

        printArray(array);
        
        System.out.println("");
        System.out.println("Comparison between Quick sort sort and Merge Sort: ");
        System.out.println("");
        System.out.println("\t\t" +"Quick sort" + "\t\t" + "Merge Sort");
        System.out.println("comparison: \t" + comparisonInQuickSort + "\t\t\t" + comparisonInMergeSort);
        System.out.println("Movement  : \t" + movementInQuickSort + "\t\t\t" + movementInMergesort);
        System.out.println("Time      : \t" + timeForQuick + "ms" + "\t\t\t" + timeForMerge + "ms");        

    }
    
    public static int[] initiateArray(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            array[i] = (int) (Math.random() * 100000 + 1);
        }
        return array;
    }

    public static void printArray(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
            if((i + 1) % 20 == 0){
                System.out.println("");
            }
        }      
    } 
    
    public static int[] quickSort(int[] array, int first, int last){
        if(last - first < 2){
            return array;
        }
        
        int pivotIndex = partition(array, first, last);
        quickSort(array, first, pivotIndex);
        quickSort(array, pivotIndex + 1, last);
        return array;
    }
    
    public static int partition(int[] array, int first, int last){
        int pivot = array[first];
        int i = first;
        int j = last;
        
        while(i < j){
            
            while(i < j && array[--j] >= pivot){
                comparisonInQuickSort++;
            }
            
            if(i < j){
                array[i] = array[j];
                movementInQuickSort++;
            }
            
            while(i < j && array[++i] <= pivot){
                comparisonInQuickSort++;
            }
            if(i < j){
                array[j] = array[i];
                movementInQuickSort++;
            }
        }
        array[j] = pivot;
        return j;
    }
    
    public static int[] mergeSort(int[] array, int first, int last){
        int middle;
        if(first < last){
            middle = (first + last) / 2;
            mergeSort(array,first, middle);
            mergeSort(array, middle + 1, last);
            merge(array, first, middle, last);
        }
        
        return array;
    }
    
    public static void merge(int[] array, int first, int middle, int last){
        int i, j, k;
        int n1 = middle - first + 1;
        int n2 = last - middle;
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // copying the array
        for(i = 0; i < n1; i++){
            left[i] = array[first + i];
            movementInMergesort++;
        }
        //copying the array
        for(j = 0; j < n2; j++){
            right[j] = array[middle + j + 1];
            movementInMergesort++;
        }
        i=0;
        j=0;
        k=first;
        
        while(i<n1 && j<n2){
           
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
                movementInMergesort++;
            }
            else{
                array[k]=right[j];
                j++;
                movementInMergesort++;
            }
            k++;
            comparisonInMergeSort++;
        }
        while(i<n1){
            array[k]=left[i];
            k++;
            i++;
            movementInMergesort++;
        }
        while(j<n2){
            array[k]=right[j];
            k++;
            j++;
            movementInMergesort++;
        }
    }  
}

//    public static int[] quickSort(int[] array, int first, int last){
//        int i, j, temp, swap;
//        if(first < last){
//            i = first + 1;
//            while(i < array.length && array[i] < array[first]){
//                i++;
//                comparisonInQuickSort++;
//            }
//            j = last;
//            while(array[j] > array[first]){
//                j--;
//                comparisonInQuickSort++;
//            }
//            while(i < j){
//                temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//                movementInQuickSort++;
//                
//                while(array[i] <= array[first]){
//                    i++;
//                    comparisonInQuickSort++;
//                }
//                while(array[j] >= array[first]){
//                    j--;
//                    comparisonInQuickSort++;
//                }
//            }
//            swap = array[first];
//            array[first] = array[j];
//            array[j] = swap;
//            movementInQuickSort++;
//            
//            quickSort(array, first, j - 1);
//            quickSort(array, j + 1, last);
//        }
//        
//        return array;
//    }