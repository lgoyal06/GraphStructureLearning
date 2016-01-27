package com.lalit.graph.directed;

import org.junit.Ignore;

import com.lalit.graph.operations.GraphImpl;

public class GraphImplUnitTest {

	@Ignore
	public void givenEmptyGraphWhenInsertNodePrformedThenExpectGraphUpdatedWithNode() {

		// TODO: Fix it by 29th Jan 2016
		GraphImpl graph = new GraphImpl();
		graph.insertNode("A");
		graph.insertNode("B");
		graph.insertNode("E");
		graph.insertDirectedEdge("B", "A", "Test");
		graph.insertDirectedEdge("C", "A", "EdgeFromCToA");
		graph.insertDirectedEdge("B", "C", "EdgeFromBToC");
		graph.insertUndirectedEdge("B", "D", "UndirectedEdgeFromBToD");
		graph.insertDirectedEdge("E", "D", "EdgeFromEToD");

		System.out.println(graph);

		graph.deleteNode("B");
		graph.deleteNode("C");
		graph.deleteEdge("EdgeFromCToA");
		graph.reverseDirection("EdgeFromEToD");
		System.out.println(graph);

	}

	public static void main(String... s) {
		GraphImpl graph = new GraphImpl();
		graph.insertNode("A");
		graph.insertNode("B");
		graph.insertNode("E");
		graph.insertDirectedEdge("B", "A", "EdgeFromBToA");
		graph.insertDirectedEdge("C", "A", "EdgeFromCToA");
		graph.insertDirectedEdge("B", "C", "EdgeFromBToC");
		graph.insertUndirectedEdge("B", "D", "UndirectedEdgeFromBToD");
		graph.insertDirectedEdge("E", "D", "EdgeFromEToD");
		graph.insertDirectedEdge("F", "G", "EdgeFromFToG");
		graph.insertUndirectedEdge("F", "A", "UndirectedEdgeFromFToA");

		System.out.println(graph);

		graph.deleteNode("B");
		graph.deleteNode("C");
		graph.deleteEdge("EdgeFromCToA");
		graph.reverseDirection("EdgeFromEToD");
		graph.setDirectionFrom("EdgeFromEToD", "L");
		graph.setDirectionTo("EdgeFromEToD", "K");
		System.out.println(graph);
	}
}