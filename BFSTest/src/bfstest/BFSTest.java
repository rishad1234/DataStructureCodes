
package bfstest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BFSTest {

    public static void main(String[] args) {
        BreathFirstSearch bfs = new BreathFirstSearch();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int numberOfVertices = input.nextInt();
        
        List<Vertex> listOfVertices = new ArrayList<>();
        for(int i = 0; i < numberOfVertices; i++){
            listOfVertices.add(new Vertex(i + 1));
        }
        
        System.out.println(listOfVertices);
        
        for(int i = 0; i < numberOfVertices; i++){
            System.out.println("For vertex " + (i + 1) + " Enter the number of adjacent vertices" + 
                     "(1-" + numberOfVertices + ")" + "with a space in between them" + " if not, enter 0 and continue");
            if(i == 0){
                input.nextLine();
            }
            String vertex = input.nextLine();
            try{
                if(Integer.parseInt(vertex) == 0){
                    continue;
                }
            }catch(Exception e){
                
            }
            String[] ver = vertex.split(" ");
            for(String v : ver){
                System.out.println(v);
            }
            for(int j = 0; j < ver.length; j++){
                
                for(int k = 0; k < listOfVertices.size(); k++){
                    if(ver[j].equals(String.valueOf(listOfVertices.get(k).getVertexName()))){
                        listOfVertices.get(i).addAdjacentVertex(listOfVertices.get(k));
                        break;
                    }
                }
            }
        }
        
        System.out.println("Enter the root vertex: ");
        int number = input.nextInt();

        bfs.bfs(listOfVertices.get(number - 1));
        
        
//        Vertex v1 = new Vertex(1);
//        Vertex v2 = new Vertex(2);
//        Vertex v3 = new Vertex(3);
//        Vertex v4 = new Vertex(4);
//        Vertex v5 = new Vertex(5);
//        
//        v1.addAdjacentVertex(v2);
//        v1.addAdjacentVertex(v4);
//        v4.addAdjacentVertex(v5);
//        v2.addAdjacentVertex(v3);
//        
//        bfs.bfs(v1);
    }
    
}
