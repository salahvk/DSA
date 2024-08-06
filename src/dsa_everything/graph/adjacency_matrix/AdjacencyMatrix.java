package dsa_everything.graph.adjacency_matrix;

import java.util.HashMap;

public class AdjacencyMatrix {
    // Implemented minimum logic -> Some more condition need to be cleared

    int[][] adjacencyMatrix;
    int vertexSize;
    HashMap<Integer, Integer> vertexMap;
    int nextVertex;

    AdjacencyMatrix(int vertices) {
        this.adjacencyMatrix = new int[vertices][vertices];
        this.vertexSize = vertices;
        this.vertexMap = new HashMap<>();
    }

    void addVertex(int vertex) {
        if (nextVertex >= vertexSize) {
            throw new IllegalArgumentException("Size is full please add size to contain more vertex");
        }
        vertexMap.put(vertex, nextVertex++);
    }

    void addEdges(int fromVertex, int toVertex, boolean isBidirectional) {
        Integer fromVertexPosition = vertexMap.get(fromVertex);
        Integer toVertexPosition = vertexMap.get(toVertex);
        if (fromVertexPosition == null || toVertexPosition == null) {
            throw new IllegalArgumentException("Both Vertices must be added to the graph before connecting each other");
        }
        adjacencyMatrix[fromVertexPosition][toVertexPosition] = 1;
        if (isBidirectional) {
            adjacencyMatrix[toVertexPosition][fromVertexPosition] = 1;
        }
    }

    void printAdjacencyMatrix() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);

        adjacencyMatrix.addVertex(5);
        adjacencyMatrix.addVertex(9);
        adjacencyMatrix.addVertex(11);
        adjacencyMatrix.addVertex(21);
        adjacencyMatrix.addVertex(4);

        adjacencyMatrix.addEdges(5, 9, false);
        adjacencyMatrix.addEdges(21, 11, true);
        adjacencyMatrix.addEdges(4, 5, true);
        adjacencyMatrix.addEdges(21, 9, false);

        adjacencyMatrix.printAdjacencyMatrix();
    }
}
