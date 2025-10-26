
package com.mycompany.dfs;

import java.util.Stack;

class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char label) {
        this.label = label;
        this.wasVisited = false;
    }
}

class Graph {
    private final int MAX_VERTS = 20;
    private Vertex[] vertexList; // قائمة القمم
    private int[][] adjMatrix;   // مصفوفة التلاصق
    private int vertexCount;
    private Stack<Integer> stack;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMatrix = new int[MAX_VERTS][MAX_VERTS];
        vertexCount = 0;
        stack = new Stack<>();

        // تهيئة مصفوفة التلاصق بالقيم 0
        for (int i = 0; i < MAX_VERTS; i++)
            for (int j = 0; j < MAX_VERTS; j++)
                adjMatrix[i][j] = 0;
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1; // لأن الرسم غير موجه
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label + " ");
    }

    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }

        // إعادة تعيين حالة الزيارة لجميع القمم
        for (int i = 0; i < vertexCount; i++)
            vertexList[i].wasVisited = false;
    }

    private int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < vertexCount; j++) {
            if (adjMatrix[v][j] == 1 && !vertexList[j].wasVisited)
                return j;
        }
        return -1;
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // إضافة القمم
        graph.addVertex('A'); // 0
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        graph.addVertex('E'); // 4

        // إضافة الحواف
        graph.addEdge(0, 1); // A-B
        graph.addEdge(1, 2); // B-C
        graph.addEdge(0, 3); // A-D
        graph.addEdge(3, 4); // D-E

        System.out.print("DFS Traversal: ");
        graph.dfs(); // تنفيذ DFS
    }
}