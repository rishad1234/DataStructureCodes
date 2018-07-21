
package bfstest;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
    
    public void bfs(Vertex root){
        
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        
        while(!queue.isEmpty()){
            Vertex temp = queue.remove();
            System.out.println(temp);
            
            for(Vertex v : temp.getAdjacent()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
