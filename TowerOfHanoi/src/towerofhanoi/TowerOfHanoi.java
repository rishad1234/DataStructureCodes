
package towerofhanoi;


public class TowerOfHanoi {

    public static void main(String[] args) {
        ClassHanoi h = new ClassHanoi();
        long currentTime = System.currentTimeMillis();
        h.hanoi(30, 1, 2, 3);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - currentTime) / 1000);
        //System.out.println("");
//        long currentTime = System.currentTimeMillis();
//        h.nonRecursiveHanoi(20, 1, 2, 3);
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - currentTime);
    }
    
}
