
package bfstest;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    
    public void bfs(Vertex root){
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex temp = queue.remove();

            for(Vertex v : temp.getAdjacent()){
                if(!v.isVisited()){
                    System.out.println("Visited: " + v.getVertexName());
                    v.setVisited(true);
                    queue.add(v);
                }
            }
//            System.out.println("" + temp.getVertexName());
        }           
    }
}
