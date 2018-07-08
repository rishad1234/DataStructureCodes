
package hanoinonrecursive;

public class HanoiNonRecursive {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        nonRecursiveHanoi(20, 1, 2, 3);
        long time = System.currentTimeMillis();
        System.out.println(time - currentTime);
    }
    
    public static void nonRecursiveHanoi(int disk, int i, int j, int k){
    Stack stack = new Stack();
    Node object = new Node(disk, i, j, k);
    stack.push(object);
    while(!stack.isEmpty()){
        Node hanoi = stack.pop();
        //System.out.println("disk: "+hanoi);
        if(hanoi.getDisk() == 1){
            System.out.println(hanoi.getI() + "->" + hanoi.getK());
        }else{
                Node s1 = new Node(hanoi.getDisk() - 1, hanoi.getJ(), hanoi.getI(), hanoi.getK());
                Node s2 = new Node(1, hanoi.getI(), hanoi.getJ(), hanoi.getK());
                Node s3 = new Node(hanoi.getDisk() - 1, hanoi.getI(), hanoi.getK(), hanoi.getJ());
            stack.push(s1);
            stack.push(s2);
            stack.push(s3);
        }

    }
        
        
    }
    
}
