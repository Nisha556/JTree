package Tree;
//Java program to find height of tree 
public class DepthofBinarytree {
int data;
DepthofBinarytree left, right;
DepthofBinarytree(int item)
{
	data  = item ;
	left = right= null;
	
}
}
class Binarytree {
	DepthofBinarytree root;
	int  DepthofBinarytree(DepthofBinarytree node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = DepthofBinarytree(node.left); 
            int rDepth = DepthofBinarytree(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
    } 
	 
		 public static void main(String args[])
		 {
			 Binarytree tree  = new Binarytree();
			 tree.root = new DepthofBinarytree(1); 
		        tree.root.left = new DepthofBinarytree(2); 
		        tree.root.right = new DepthofBinarytree(3); 
		        tree.root.left.left = new DepthofBinarytree(4); 
		        tree.root.left.right = new DepthofBinarytree(5); 
		   
		        System.out.println("Height of tree is : " +  
		                                      tree.maxDepth(tree.root)); 
		 }
}
