package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree
{
	Node root;

	//Inserting in a node
	private Node addRecursive(Node current,int value)
	{
		if(current==null)
		{
			return new Node(value);
		}
		if(value > current.value)
		{
			addRecursive(current.right,value);
		}
		else if(value<current.value)
		{
			addRecursive(current.left,value);
		}
		else
		{
			return current;
		}
		return current;
	}
	//Creating a Binary Tree
	public void add(int value)
	{
		root=addRecursive(root,value);
	}
	private BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();

		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

		return bt;
	}
	//Finding an Element
	private boolean containsNodeRecursive(Node current, int value)
	{
		if(current==null)
		{
			return false;
		}
		if(current.value==value)
		{
			return true;
		}

		return value < current.value ?
				containsNodeRecursive(current.left,value):containsNodeRecursive(current.right,value);
	}

	//Finding from the root
	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	//Delete From the node

	private Node deleteRecursive(Node current, int value)
	{
		if(current==null)
		{
			return null;
		}
		if(value==current.value)
		{
			//a node has no children
			if (current.left == null && current.right == null) {
				return null;
			}
			//a node has exactly one child
			if (current.right == null) {
                return current.left;
			}
			if (current.left == null) {
                return current.right;
			}
			//a node has two children
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}
		if(value<current.value)
		{
			current.left=deleteRecursive(current.left,value);
			return current;
		}
			current.right=deleteRecursive(current.right,value);

		return current;
	}
	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	//Traversal-DFS
	/*
	Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.
	The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree:
	 */
	 public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	/**
	 *
	 * Pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
	 */

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	/**
	 *
	 * Post-order traversal visits the left subtree, the right subtree, and the root node at the end:
	 */

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}

	//Traversal-BFS- Breadth First search

	/**
	 *
	 * visits all the nodes of a level before going to the next level.
	 */

	public void traverseLevelOrder() {
		if (root == null) {
			return;
		}

		Queue<Node> nodes = new LinkedList<Node>();
		nodes.add(root);

		while (!nodes.isEmpty()) {

			Node node = nodes.remove();

			System.out.print(" " + node.value);

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.right!= null) {
				nodes.add(node.right);
			}
		}
	}

	public static void main(String[] args)
	{

	}


}
