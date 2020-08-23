package Tree;
//Java program to Print root to leaf path WITHOUT 
//using recursion 
import java.util.Stack; 
import java.util.HashMap; 
 class PrintPath1 { 

	/* Function to print root to leaf path for a leaf 
	using parent Node5s stored in map */
	public static void printTopToBottomPath(Node5 curr, HashMap<Node5,Node5> parent) 
	{ 
		Stack<Node5> stk=new Stack<>() ; 
	
		// start from leaf Node5 and keep on pushing 
		// Node5s into stack till root Node5 is reached 
		while (curr!=null) 
		{ 
			stk.push(curr); 
			curr = parent.get(curr); 
		} 
	
		// Start popping Node5s from stack and print them 
		while (!stk.isEmpty()) 
		{ 
			curr = stk.pop(); 
			System.out.print(curr.data+" "); 
		} 
		System.out.println(); 
	} 


	/* An iterative function to do preorder traversal 
	of binary tree and print root to leaf path 
	without using recursion */
	public static void printRootToLeaf(Node5 root) 
	{ 
		// Corner Case 
		if (root == null) 
			return; 
	
		// Create an empty stack and push root to it 
		Stack<Node5> Node5Stack=new Stack<>(); 
		Node5Stack.push(root); 
	
		// Create a map to store parent pointers of binary 
		// tree Node5s 
		HashMap<Node5,Node5> parent=new HashMap<>(); 
	
		// parent of root is NULL 
		parent.put(root,null); 
	
		/* Pop all items one by one. Do following for 
		every popped item 
			a) push its right child and set its parent 
			pointer 
			b) push its left child and set its parent 
			pointer 
		Note that right child is pushed first so that 
		left is processed first */
		while (!Node5Stack.isEmpty()) 
		{ 
			// Pop the top item from stack 
			Node5 current = Node5Stack.pop(); 
	
			// If leaf Node5 encountered, print Top To 
			// Bottom path 
			if (current.left==null && current.right==null) 
				printTopToBottomPath(current, parent); 
	
			// Push right & left children of the popped Node5 
			// to stack. Also set their parent pointer in 
			// the map 
			if (current.right!=null) 
			{ 
				parent.put(current.right,current); 
				Node5Stack.push(current.right); 
			} 
			if (current.left!=null) 
			{ 
				parent.put(current.left,current); 
				Node5Stack.push(current.left); 
			} 
		} 
	} 


	public static void main(String args[]) { 
		Node5 root=new Node5(10); 
		root.left = new Node5(8); 
		root.right = new Node5(2); 
		root.left.left = new Node5(3); 
		root.left.right = new Node5(5); 
		root.right.left = new Node5(2); 
		printRootToLeaf(root); 
	} 
} 

/* A binary tree Node5 */
class Node5 
{ 
	int data; 
	Node5 left, right; 
	Node5(int data) 
	{ 
		left=right=null; 
		this.data=data; 
	} 
};  

