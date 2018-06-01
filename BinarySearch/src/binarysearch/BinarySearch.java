
package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[100000];
        array = initiateArray(array);
        array = insertionSort(array);
        int position = binarySearch(array, 99999);
        System.out.println(position);
    }
    
    
    
    public static int binarySearch(int[] array, int search){
        
        int start = 0;
        int end = array.length;
        
        while(start < end){
            int midPoint = (start + end) / 2;
            
            if(array[midPoint] == search){
                return midPoint;
            }else if(array[midPoint] < search){
                start = midPoint + 1;
            }else{
                end = midPoint;
            }
        }
        
        return  -1;
    }
    
    public static int[] initiateArray(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            array[i] = (int) (Math.random() * 100000 + 1);
        }
        return array;
    }
    
    public static int[] insertionSort(int[] array){
        
        int length = array.length;
        for(int i = 1; i < length; i++){
            int element = array[i];
            int sortedIndex = i;
                     
            while(sortedIndex > 0 && array[sortedIndex - 1] > element){
                    array[sortedIndex] = array[sortedIndex - 1];
                    sortedIndex--;
            }
            array[sortedIndex] = element;
        }
        return array;
    }
    
}
