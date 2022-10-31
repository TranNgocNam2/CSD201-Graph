/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.adjacency_list;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class testGraph1 {

    public static void main(String[] args) {
        Graph g = new Graph();
        g = g.loadFromFile1("graph1.txt");
        System.out.println(g.toString());
        ArrayList<Edge> edges = g.depthFirstSearch();
        System.out.println("Depth First Search");
        g.printEdges(edges, System.out);
        edges = g.breadthFirstSearch();
        System.out.println("Breadth First Search");
        g.printEdges(edges, System.out);
    }
}
