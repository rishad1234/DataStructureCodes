
package dfstest;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    
    private Stack<Vertex> stack;

    public DepthFirstSearch() {
        stack = new Stack<>();
    }
    
    
    public void dfs(List<Vertex> vertexList){
        
        for(Vertex v : vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                DfsVisit(v);
            }
        }
        
    }
    
    public void DfsVisit(Vertex root){
        this.stack.add(root);
        root.setVisited(true);
        
        while(!stack.isEmpty()){
            Vertex actualVertex = this.stack.pop();
            System.out.println(actualVertex.getVertexName());
            
            for(Vertex v : actualVertex.getAdjacent()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
}
