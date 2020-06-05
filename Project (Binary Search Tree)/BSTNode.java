import java.awt.*;

import java.util.ArrayList;



public class BSTNode {

     BSTNode left, right;

     int data;

     Point location;

     Color c;

     ArrayList<BSTNode> neighbors;

     

     public BSTNode(int n, Point location){

         left = null;

         right = null;

         this.location = location;

         this.data = n;

         this.c = c;

         this.neighbors = new ArrayList<BSTNode>();

         

         

     }

     public String toString() {

    	 return Integer.toString(this.data);

     }

     public void draw(Graphics g) {

       //for( BSTNode left : this.neighbors) {

    	 if (this.left != null) {

    		 left.draw(g);

    		 g.drawLine(this.location.x, this.location.y, left.location.x, left.location.y);

    	 }

       //}

       //for( BSTNode right : this.neighbors) {

    	 if (this.right != null) {

    		 right.draw(g);

    		 g.drawLine(this.location.x, this.location.y, right.location.x, right.location.y);     	 

    	 }

       //}

    	 g.setColor(Color.RED);

    	 g.fillOval(this.location.x, this.location.y, 30, 30);

    	 

    	 g.setColor(Color.BLUE);

    	 g.drawOval(this.location.x, this.location.y, 30, 30);

    	 g.drawString(Integer.toString(data), this.location.x+10, this.location.y+10);

     }

	public void moveTo(Point mouseLocation) {

		this.location = mouseLocation;

	}

	//public void addNeigbor(BSTNode a) {

		//this.neighbors.add(a);

	}

     

    

 