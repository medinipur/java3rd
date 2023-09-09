package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
	
	
	private static class Node{
		/*
		 * Fields
		 */
		private int value;
		private Node left;
		private Node right;
		
		/*
		 * Constructor
		 */
		public Node(int value) {
			this.value=value;
			this.left=null;
			this.right=null;
			
			
		}
	}



//	private static final String Queue = null;


	
  private static Node root;
	public BinaryTree() {
		this.root=null;
	}
	  
	public void  add(int value) {
		root=addNode(root, value);
	} 
	
	
	public Node addNode(Node root,int value) {
		if(root==null) {
			return new Node(value);
		}
		if(value<root.value) {
			root.left=addNode(root.left,value);
		}
		else if(value>root.value) {
			root.right=addNode(root.right,value);
		}
		else {
			return root;
		}
		return root;
	}
	
	
	
	public void traverseInOrder() {
		traverseInOrder(root);
	}
	
	private void traverseInOrder(Node root) {
		if(root==null) {
			return;
		}
		traverseInOrder(root.left);
		System.out.print(root.value+" ");
		traverseInOrder(root.right);
		
	} 
//	public void traversepreOrder() {
//		traversepreOrder(root);
//	}
//	
//	private void traversepreOrder(Node root) {
//		if(root==null) {
//			return;
//		}
//		System.out.print(root.value+" ");
//		traversepreOrder(root.left);
//		
//		traversepreOrder(root.right);
//		
//	} 
	
	//Reverse the binary tree
	
	public void invert() {
		root=invert(root);
	}
   private Node invert(Node node) {
	   if(node==null)
		   return node;
	   
	   Node left=invert(node.left);
	   Node right=invert(node.right);
	   
	   node.left=right;
	   node.right=left;
	   
	   return node;
   }
   
	
	/*
	 * levelOrder Traversal
	 */
	public void levelOrderTraversal(Node root) {
	if(root==null) {
		return;
	}
	Queue<Node>queue=new ArrayDeque<>();
	queue.add(root);
	
	Node currentNode;
    
	while(!queue.isEmpty()) {
		currentNode=queue.poll();
		System.out.println(currentNode.value+" ");
		
		if(currentNode.left!=null) {
			queue.add(currentNode.left);
		}
		
		if(currentNode.right!=null) {
			queue.add(currentNode.right);
		}
	}
	}
	
	
	
	
	
	public void delete(int value) {
		root=deleteNode(root, value);
	}
	
	private Node deleteNode(Node current,int value) {
		if(current==null) {
			return null;
		}
		if(value==current.value) {
	//Case 1: no children
			if(current.left==null && current.right==null) {
				return null;
			}
	//case 2: only 1 child
			if(current.right==null) {
				return current.left;
			}
			if(current.left==null) {
				return current.right;
		}
	//case 3: 2 child
			int smallestValue=findsmallestValue(current.right);
			
			current.value=smallestValue;
			current.right=deleteNode(current.right,smallestValue);
             return current;
		}
		System.out.println(">"+current.value);
		
		if(value<current.value) {
			current.left=deleteNode(current.left,value);
			return current;
		}
		
		current.right=deleteNode(current.right,value);
		return current;
	}
	public static int findsmallestValue(Node root) {
		return root.left==null ? root.value:findsmallestValue(root.left);
		
		}
		
	
//
//	public static boolean search(Node root, int value) {
//		if(root == null) {
//			return false;
//		}
//		if(root.value>value) {
//			return search(root.left,value);
//		}
//		else if(root.value == value) {
//			return true;
//		}
//		else {
//			return search(root.right, value);
//		}
//	
//	}

	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
           bt.add(6);
           bt.add(4);
           bt.add(8);
           bt.add(3);
           bt.add(5);
           bt.add(7);
           bt.add(9);
   //  bt.traverseInOrder();
//          
//          if(search(root,19)) {
//        	  System.out.println("found");
//        	  
//          }
//          else {
//        	  System.out.println("not found");
//          }
//        
         //  bt.levelOrderTraversal(root);
         //  bt.delete(3);
          
           bt.invert();
           bt.traverseInOrder();
          
	}

}
