/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.b.plus.tree;
import java.util.*;


class BPlusNode {
    boolean isLeaf;
    List<Integer> keys;
    List<BPlusNode> children;
    BPlusNode next; // للربط بين الأوراق

    public BPlusNode(boolean isLeaf) {
        this.isLeaf = isLeaf;
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
        this.next = null;
    }
}

public class BPlusTree {
    private int degree;
    private BPlusNode root;

    public BPlusTree(int degree) {
        this.degree = degree;
        this.root = new BPlusNode(true);
    }

    public void insert(int key) {
        BPlusNode r = root;
        if (r.keys.size() == degree - 1) {
            BPlusNode newRoot = new BPlusNode(false);
            newRoot.children.add(r);
            splitChild(newRoot, 0);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    private void insertNonFull(BPlusNode node, int key) {
        if (node.isLeaf) {
            node.keys.add(key);
            Collections.sort(node.keys);
        } else {
            int i = 0;
            while (i < node.keys.size() && key > node.keys.get(i)) i++;
            BPlusNode child = node.children.get(i);
            if (child.keys.size() == degree - 1) {
                splitChild(node, i);
                if (key > node.keys.get(i)) i++;
            }
            insertNonFull(node.children.get(i), key);
        }
    }

    private void splitChild(BPlusNode parent, int index) {
        BPlusNode node = parent.children.get(index);
        BPlusNode newNode = new BPlusNode(node.isLeaf);
        int mid = degree / 2;

        newNode.keys.addAll(node.keys.subList(mid, node.keys.size()));
        node.keys = new ArrayList<>(node.keys.subList(0, mid));

        if (!node.isLeaf) {
            newNode.children.addAll(node.children.subList(mid, node.children.size()));
            node.children = new ArrayList<>(node.children.subList(0, mid));
        } else {
            newNode.next = node.next;
            node.next = newNode;
        }

        parent.keys.add(index, newNode.keys.get(0));
        parent.children.add(index + 1, newNode);
    }

    public void printLeaves() {
        BPlusNode node = root;
        while (!node.isLeaf)
            node = node.children.get(0);
        while (node != null) {
            System.out.print(node.keys + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        BPlusTree tree = new BPlusTree(4);
        int[] keys = {10, 20, 5, 6, 12, 30, 7, 17};
        for (int key : keys)
            tree.insert(key);

        System.out.print("B+ Tree Leaf Nodes: ");
        tree.printLeaves();
    }
}