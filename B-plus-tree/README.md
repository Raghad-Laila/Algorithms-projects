# B+ Tree (Simplified Implementation)

## Purpose
This B+ Tree implementation demonstrates how to insert keys into a balanced multi-way tree structure. All data is stored in leaf nodes, which are linked for efficient sequential access.

## How It Works
- Each node can hold multiple keys (based on the degree).
- When a node exceeds its capacity, it is split and the middle key is promoted.
- Leaf nodes are linked to support fast range queries.
- Only leaf nodes store actual data; internal nodes are used for navigation.

## Benefits
- Efficient for large-scale data storage and indexing.
- Supports fast range queries and ordered traversal.
- Maintains balance with minimal restructuring.

## What I Learned
Through this implementation, I learned how B+ Trees differ from binary trees. I understood how node splitting works and how leaf-level linking improves performance for range-based queries. It also highlighted the importance of choosing the right data structure for scalable systems.

------Part of my early learning journey in algorithms and recursion.
