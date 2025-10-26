# AVL Tree — Balanced Binary Search Tree

## Purpose
This project implements an AVL Tree, a self-balancing binary search tree that maintains optimal height after each insertion or deletion. It ensures efficient search and update operations by keeping the tree balanced at all times.

## How It Works
- Each node stores a key, height, and pointers to left and right children.
- After inserting or deleting a node, the tree recalculates balance factors.
- If imbalance is detected, rotations (left, right, or double) are applied to restore balance.
- The tree is printed using a structured pre-order traversal with indentation to visualize hierarchy.

## Key Features
-  Insert and delete operations with automatic balancing.
-  Left and right rotations to maintain height balance.
-  Balance factor calculation for every node.
-  Pre-order traversal with visual indentation for tree structure.

## Benefits
- Guarantees O(log n) time complexity for insert, delete, and search.
- Prevents the tree from becoming skewed or inefficient.
- Ideal for dynamic datasets with frequent updates.
- Easy to visualize and debug using the custom print method.

## What I Learned
This implementation helped me understand how AVL Trees maintain balance through rotations and height tracking. I learned how to handle edge cases during deletion, especially when nodes have one or two children. The structured print method also gave me insight into tree visualization and traversal logic.

------Part of my early learning journey in algorithms and recursion.
