# Graph Data Structure in Java

# Project Objective
This project demonstrates how to implement a directed graph data structure in Java using custom classes for vertices and edges. Each edge can optionally carry a weight, allowing for more advanced graph modeling such as weighted paths or networks.

---

# What I Learned
Through building this project, I gained practical experience in:
- Designing custom data structures using classes.
- Understanding the relationship between vertices and edges in a graph.
- Using Java collections like LinkedList and HashSet to manage graph components.
- Implementing a directed graph with weighted edges.
- Displaying graph contents in a readable format via console output.

---

# Project Structure
1. vertex Class
Represents a node in the graph. Each vertex contains:
- A name (identifier).
- A list of outgoing edges.
2. edge Class
Represents a directed connection from one vertex to another. Each edge contains:
- A destination vertex.
- An optional weight (default is 1).
3. graph Class
Represents the entire graph structure. It includes:
- A set of vertices.
- Methods to add vertices and edges.
- A Display() method to print the graph's structure.
4. Graph (Main Class)
The entry point of the program. It:
- Creates vertices.
- Adds them to the graph.
- Connects them with edges.
- Displays the graph in the console.

---

# Sample Output
When executed, the program prints each vertex and its outgoing edges:
source0   :
weight = 2 Destination Vertex =1  
-------------
source1   :
weight = 3 Destination Vertex =2  
-------------
...


# Requirements
- Language: Java
- IDE: netbeans or any IDE

---

 # Notes
- The graph is directed, meaning each edge has a direction from one vertex to another.
- Vertices are stored in a HashSet, preventing duplicates.
- Multiple edges between the same pair of vertices are allowed with different weights.

------Part of my early learning journey in algorithms and recursion.


