/* This is the first graph program to my carrer */
// This is the test program to add vertex , edge representation 

import java.util.*;

public class Representation{
	Representation g;
	static int V;
	static LinkedList<Integer> adjListArray[];
	Representation(int V){
		Representation.V=V;
		adjListArray = new LinkedList[V];
		for(int i=0;i<V;i++){
			adjListArray[i] = new LinkedList<>();
		}
	}

	static void addEdge(int src, int dest){
			adjListArray[src].addFirst(dest);
			adjListArray[dest].addFirst(src);
	}

	static void print(){
		for (int i=0;i<V;i++){
		System.out.println("Adjacency List of Vertex " + i);
		for(Integer crawl : adjListArray[i]){
			System.out.print("->" + crawl);
		}
		System.out.println("\n");
	}
}
	public static void main(String[] args) {
		Representation G = new Representation(5);
		Representation.addEdge(0, 1);
		Representation.addEdge(0, 4);
		Representation.addEdge(1, 2);
		Representation.addEdge(1, 3);
		Representation.addEdge(1, 4);
		Representation.addEdge(2, 3);
		Representation.addEdge(3, 4);
		Representation.print(); 
	}
}
