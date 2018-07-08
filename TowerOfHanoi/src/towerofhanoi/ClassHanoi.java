
package towerofhanoi;

import java.util.Stack;

public class ClassHanoi {
    public void hanoi(int disk, int i, int j, int k){
        if(disk == 1){
            System.out.println(i + "->" + k);
        }else{
            hanoi(disk-1, i, k, j);
            hanoi(1, i, j, k);
            hanoi(disk-1, j, i, k);
        }
    }
    
    public void nonRecursiveHanoi(int disk, int i, int j, int k){
        Stack stack = new Stack();
        HanoiObject object = new HanoiObject(disk, i, j, k);
        stack.push(object);
        while(!stack.empty()){
            HanoiObject hanoi =(HanoiObject) stack.pop();
            if(hanoi.getDisk() == 1){
                System.out.println(hanoi.getI() + "->" + hanoi.getK());
            }else{
                HanoiObject s1 = new HanoiObject(hanoi.getDisk() - 1, hanoi.getJ(), hanoi.getI(), hanoi.getK());
                HanoiObject s2 = new HanoiObject(1, hanoi.getI(), hanoi.getJ(), hanoi.getK());
                HanoiObject s3 = new HanoiObject(hanoi.getDisk() - 1, hanoi.getI(), hanoi.getK(), hanoi.getJ());
                stack.push(s1);
                stack.push(s2);
                stack.push(s3);
            }
            
        }
        
        
    }
}

class HanoiObject{
    private int disk;
    private int i;
    private int j;
    private int k;

    public HanoiObject(int disk, int i, int j, int k) {
        this.disk = disk;
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
}