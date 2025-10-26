
package com.mycompany.graph;

import java.util.LinkedList;
import java.util.HashSet;

//first class

class vertex {
private String name; 
private LinkedList<edge>edgelist;

public vertex(String nam){
this.name =nam;
this.edgelist=new LinkedList<>();
}

    public String getName() {
        return name;
    }

    public LinkedList<edge> getEdgelist() {
        return edgelist;
    }
    }

//second class

class edge {
    private vertex destvertex; //target or distnaiton
    private int weight;
    public edge(vertex destv, int w){
        this.destvertex = destv;
        this.weight=w;
    }

    public edge(vertex destv) {
        this.destvertex = destv;
        this.weight=1;
    }

    public vertex getDestvertex() {
        return destvertex;
    }

    public int getWeight() {
        return weight;
    }
}

//third class

class graph{
 private HashSet<vertex> nodes;
 public graph(){  
 nodes = new HashSet<>();}
 
 public boolean addvertex(vertex v){
     return nodes.add(v);
 }
 
public boolean addedge(vertex v, vertex destv, int w){
    return v.getEdgelist().add(new edge (destv,w));
}

public void Display(){
    for(vertex v:nodes){
    System.out.println("source"+v.getName()+"   :");
    
  
     for(edge e:v.getEdgelist()){
      System.out.println("weight = "+e.getWeight()+" Destination Vertex ="+e.getDestvertex().getName()+"  ");
  }
  System.out.println("-------------");
}
}
}
public class Graph {

    public static void main(String[] args) {
      graph ourgraph=new graph();
      vertex v0=new vertex("0");
      vertex v1=new vertex("1");
      vertex v2=new vertex("2");
      vertex v3=new vertex("3");
      ourgraph.addvertex(v0);
      ourgraph.addvertex(v1);
      ourgraph.addvertex(v2);
      ourgraph.addvertex(v3);
      ourgraph.addedge(v0, v1, 2);
      ourgraph.addedge(v1, v2, 3);
      ourgraph.addedge(v2, v1, 5);
      ourgraph.addedge(v2, v3, 1);
      ourgraph.addedge(v3, v2, 4);
      ourgraph.addedge(v2, v0, 1);
      ourgraph.Display();
    }
}











