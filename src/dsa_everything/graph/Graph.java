package dsa_everything.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
    HashMap<Integer, List<Integer>> hashMap = new HashMap<>();

    void insert(int vertex, int edge, boolean isBidirectional) {
        if (!hashMap.containsKey(vertex)) {
            hashMap.put(vertex, new ArrayList<>());
        }
        if (!hashMap.containsKey(edge)) {
            hashMap.put(edge, new ArrayList<>());
        }
        hashMap.get(vertex).add(edge);
        if (isBidirectional) {
            hashMap.get(edge).add(vertex);
        }
    }

    void display() {
        for (var i : hashMap.keySet()) {
            System.out.println(i + hashMap.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.insert(5, 6, true);
        graph.insert(10, 5, true);
        graph.insert(100, 6, false);

        graph.display();
    }
}
