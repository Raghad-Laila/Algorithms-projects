# Balanced Binary Search Tree (AVL Tree)

## Purpose
This project implements an AVL Tree — a self-balancing binary search tree that maintains optimal height after each insertion. It ensures that the tree remains balanced to provide efficient operations.

## How It Works
- Each node stores a key and its height.
- After inserting a node, the balance factor is calculated.
- If the tree becomes unbalanced, rotations (left, right, or double) are applied to restore balance.
- In-order traversal is used to display the tree in sorted order.

## Key Features
- Automatic balancing after insertions.
- Efficient in-order traversal.
- Rotations to maintain height balance.

## Benefits
- Guarantees O(log n) time complexity for insert, delete, and search operations.
- Prevents the tree from becoming skewed or inefficient.
- Ideal for dynamic datasets with frequent updates.

## What I Learned
This implementation helped me understand how AVL Trees maintain balance through rotations. I learned how to calculate balance factors and apply the correct rotation strategy. It also reinforced the importance of recursion and traversal in tree-based data structures.

------Part of my early learning journey in algorithms and recursion.
