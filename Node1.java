package Tree;

public class Node1 {
int key; Node1 left , right;
public Node1(int item)
{
	key = item;
	left = right = null;
	
}
}
class BinaryTree1
{
	Node1 root;
	BinaryTree1(int key)
	{
		root = new Node1(key);
		
	}
	BinaryTree1()
	{
		root  = null;
		
	}
	public static void main(String args[])
	{
		BinaryTree1 tree = new BinaryTree1();
		tree.root= new Node1(1);
		tree.root.left= new Node1(2);
		tree.root.right= new Node1(3);
		tree.root.left.left= new Node1(4);
		System.out.println(tree.root);
		System.out.println(tree.root.left);
		System.out.println(tree.root.right);
		System.out.println(tree.root.left.left);
		
		
		
	}
}
