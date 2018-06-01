
package assignment1;

public class Assignment1 {
    
    public static long NumberOfComparisonInSelectionSort = 0L;
    public static long NumberOfComparisonInInsertionSort = 0L;
    public static long NumberOfMovementInSelectionSort = 0L;
    public static long NumberOfMovementInInsertionSort = 0L;
    
    public static void main(String[] args) {
        int[] array = new int[100000];
        
        array = initiateArray(array);
        
        long startInsertion = System.currentTimeMillis();
        array = insertionSort(array);
        long endInsertion = System.currentTimeMillis();
        
        double timeInSecondsForInsertion = (endInsertion - startInsertion);
        System.out.println("Insertion sort performed: " + "\n");
        printArray(array);
        
        System.out.println("");
        
        array = initiateArray(array);
        long startSelection = System.currentTimeMillis();
        array = selectionSort(array);
        long endSelection = System.currentTimeMillis();
        
        double timeInSecondsForSelection = (endSelection - startSelection);
        System.out.println("Selecttion sort performed: " + "\n");
        printArray(array);
        
        System.out.println("");
        System.out.println("Comparison between Insertion sort and Selection sort: ");
        System.out.println("");
        System.out.println("\t\t" +"Insertion sort" + "\t\t" + "SelectionSort");
        System.out.println("comparison: \t" + NumberOfComparisonInInsertionSort + "\t\t" + NumberOfComparisonInSelectionSort);
        System.out.println("Movement  : \t" + NumberOfMovementInInsertionSort + "\t\t" + (NumberOfMovementInSelectionSort));
        System.out.println("Time      : \t" + timeInSecondsForInsertion + "ms" + "\t\t" + timeInSecondsForSelection + "ms");
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
            if((i + 1) % 10 == 0){
                System.out.println("");
            }
        }      
    }
    
    public static int[] selectionSort(int [] array){
        
        int maxValueIndex;
        int length = array.length;
        
        for(int i = length - 1; i > 0; i--){
            maxValueIndex = 0;
            for(int j = 1; j <= i; j++){
                if(array[maxValueIndex] < array[j]){
                    maxValueIndex = j;
                    NumberOfComparisonInSelectionSort++;
                }
            }
            swap(array, maxValueIndex, i);  
            NumberOfMovementInSelectionSort++;
        }
        return array;
    }
    
    public static int[] insertionSort(int[] array){
        
        int length = array.length;
        for(int i = 1; i < length; i++){
            int element = array[i];
            int sortedIndex = i;
            
//            while(sortedIndex > 0){
//                if(array[sortedIndex - 1] > element){
//                    array[sortedIndex] = array[sortedIndex - 1];
//                    NumberOfMovementInInsertionSort++;
//                    NumberOfComparisonInInsertionSort++;
//                }
//                sortedIndex--;
//            }
            
            while(sortedIndex > 0 && (array[sortedIndex - 1] > element)){
                    array[sortedIndex] = array[sortedIndex - 1];
                    sortedIndex--;
                    NumberOfMovementInInsertionSort++;
                    NumberOfComparisonInInsertionSort++;
            }
            array[sortedIndex] = element;
            NumberOfMovementInInsertionSort++;
        }
        return array;
    }
    
    public static void swap(int[] array, int maxValueIndex, int lastUnsortedIndex){
        
        if(maxValueIndex == lastUnsortedIndex){
            return ;
        }
        
        int temp = array[maxValueIndex];
        array[maxValueIndex] = array[lastUnsortedIndex];
        array[lastUnsortedIndex] = temp;
        
    }

}
