package hanoirecursive;

public class HanoiRecursive {

    public static void main(String[] args) {
       hanoi(25, 1, 2, 3);
    }
    
    public static void hanoi(int disk, int i, int j, int k){
        if(disk == 1){
            System.out.println(i + "->" + k);
        }else{
            hanoi(disk-1, i, k, j);
            hanoi(1, i, j, k);
            hanoi(disk-1, j, i, k);
        }
    }
}
