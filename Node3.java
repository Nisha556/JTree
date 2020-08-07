package Tree;

public class Node3 {
 int key;
 Node3 left, right;
 public Node3(int item)
 {
	 key = item;
	 left =right=null;
	 
 }
}
class BinaryTree3 {
	Node3 root;
	BinaryTree3()
	{
		root = null;
		
	}
	void printPostorder(Node3 node) {
	if(node == null)
		return;
	printPostorder(node.left);
	printPostorder(node.right);
	System.out.println(node.key + " ");
	
	}
	void printInorder(Node3 node)
	{
		if(node==null)
			return;
		System.out.println(node.key + " ");
		 printInorder(node.left);
		printInorder(node.right);
		
	}
	void printPreorder(Node3 node)
	{
		if(node == null)
			return;
		System.out.println(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	void printPostorder()
	{
		printPostorder(root);
		
	}
	void printInorder()
	{
		printInorder(root);
		
	}
	void printPreorder()
	{
		 printPreorder(root); 
		
	}
	public static void main(String args[])
	{
		BinaryTree3 tree = new BinaryTree3();
		tree.root = new Node3(1);
		tree.root.left = new Node3(2);
	tree.root.right= new Node3(4);
	tree.root.left.right = new Node3(5);
	System.out.println("Preorder traversal of binary tree is "); 
    tree.printPreorder(); 

    System.out.println("\nInorder traversal of binary tree is "); 
    tree.printInorder(); 

    System.out.println("\nPostorder traversal of binary tree is "); 
    tree.printPostorder(); 
	
		
	}
}
