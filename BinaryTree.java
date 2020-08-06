package Tree;

public class BinaryTree {
Node root;

private Node addRecursive(Node current , int value)
{
	
	if(current == null)
	{
		return new Node(value);
		
	}
	if(value < current.value )
	{
		current.left = addRecursive(current.left , value);
		
	}
	else if (value > current.value)
	{
		current.right= addRecursive(current.right , value);
		
	}
	else
	{
		return current;
		
		
	}
	return current;
	
	
}
public void add(int value)
{
	root = addRecursive(root, value);
	
}
public static void main(String args[])
{
	

BinaryTree bt = new BinaryTree();
	
	bt.add(6);
	bt.add(4);
	bt.add(8);
	bt.add(3);
	bt.add(5);;
	bt.add(7);;
	bt.add(9);
	System.out.println(bt);
	//return bt;
}
}
