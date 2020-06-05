import java.awt.Graphics;

import java.util.ArrayList;



public class BST{

	public ArrayList<BSTNode> nodes = new ArrayList<>();

	

     public BSTNode root;

     public BST(){

         root = new BSTNode(0, new Point(200, 100));

     }

     public boolean isEmpty(){

         return root == null;

     }

     public void insert(int data){

         root = insert(root, 0, 0, data);

     }

     private BSTNode insert(BSTNode node, int prevX, int prevY, int data){

         if (node == null){

             node = new BSTNode(data, new Point(prevX, prevY));

             nodes.add(node);

         }

         else{

             if (data <= node.data)

                 node.left = insert(node.left, node.location.x-50, node.location.y+50, data);

             else

                 node.right = insert(node.right, node.location.x+50, node.location.y+50, data);

         }

         return node;

    

     }}