package Graphs;

import java.util.ArrayList;
class GraphNode{
    public String name;
    public int index;

    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}

class Graph{
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    int[][] adjacencyMatrix;
    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
//        create the m*m matrix m: no. of nodes
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }
    // i: index of first node
    // j: index of second node
    public void addUndirectedEdge(int i, int j){
        // if they have link they are initialized to 1
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("   ");
        for (int i = 0; i<nodeList.size(); i++){
            s.append(nodeList.get(i).name).append(" ");
        }
        //for (GraphNode graphNode : nodeList) {
        //            s.append(graphNode.name).append(":");
        //        }
        //    }
        s.append("\n");
        for(int i = 0; i < nodeList.size(); i++){
            s.append(nodeList.get(i).name + ": ");
            for(int j: adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();



    }

}

public class GraphImplementationAdjacencyMatrix {

    public static void main(String[] args){
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);
        // A : B
        g.addUndirectedEdge(0, 1);
        // A : C
        g.addUndirectedEdge(0, 2);
        // A : D
        g.addUndirectedEdge(0, 3);
        // B : E
        g.addUndirectedEdge(1, 4);
        // C : D
        g.addUndirectedEdge(2, 3);
        // D : E
        g.addUndirectedEdge(3, 4);

        System.out.print(g.toString());




    }
}
