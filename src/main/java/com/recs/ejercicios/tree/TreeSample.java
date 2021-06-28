package com.recs.ejercicios.tree;

import java.util.Stack;

// Example of how a Tree can be ordered recursively e iteratively.
public class TreeSample {

	static class Tree<T> {
		T value;
		Tree<T> left;
		Tree<T> right;
		Tree(T value, Tree<T> left, Tree<T> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
	
	static <T> void preorderRecursive(Tree<T> tree) {
        System.out.println(tree.value);
        if (tree.left != null) 
            preorderRecursive(tree.left);
        if (tree.right != null)
            preorderRecursive(tree.right);
    }

    static <T> void preorderIterative(Tree<T> tree) {
        Stack<Tree<T>> s = new Stack<Tree<T>>();
        s.push(tree);
        while(!s.isEmpty()) {
            Tree<T> node = s.pop();
            if (node.right != null)
                s.push(node.right);
            if (node.left != null)
                s.push(node.left);
            System.out.println(node.value);
        }
    }
        
	public static void main(String args[]) {
		
	}
}
