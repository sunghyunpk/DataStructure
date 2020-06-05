import javax.swing.JComponent;

import javax.swing.JFrame;



import java.awt.Dimension;

import java.awt.Graphics; 

import java.util.ArrayList; 

import java.awt.event.MouseListener;

import java.awt.event.MouseMotionListener;

import java.awt.event.MouseEvent;



public class Screen extends JComponent implements MouseListener, MouseMotionListener {

	public static void main(String[] argv)

	{

		JFrame jf = new JFrame();

		Screen s = new Screen();

		jf.add(s);

		jf.setVisible(true);

		jf.setSize(new Dimension(500, 500));

	}

	

  BST tree = new BST();

  

  BSTNode current; 

  public void mouseMoved(MouseEvent e) { 

    System.out.println( this.current ); 

  } 

  public void mouseDragged(MouseEvent e) { 

    if (this.current != null) {

      int x = e.getX(), y = e.getY(); 

      Point mouseLocation = new Point(x, y); 

      this.current.moveTo( mouseLocation ); 

      this.repaint();

    }

    System.out.println( this.current ); 

  } 

  public void mouseEntered(MouseEvent e) { } 

  public void mouseExited(MouseEvent e) { } 

  public void mousePressed(MouseEvent e) { 

    int x = e.getX(), y = e.getY(); 

    Point mouseLocation = new Point(x, y); 

    for (BSTNode c : tree.nodes) {

      double d = c.location.distanceTo(mouseLocation);  

      // System.out.println( "Distance to " + c + " from your mouse is: " + d ); 

      if ( d < 20 ) {

        this.current = c; 

        // return;

        break; 

      }

    }

  } 

  public void mouseReleased(MouseEvent e) { 

     this.current = null; 

  } 

  public void mouseClicked(MouseEvent e) { } 

  ArrayList<BSTNode> graph = new ArrayList<BSTNode>();

  

  public Screen() {		  						     

      for(int i = 0; i < 10; i++)

		 tree.insert((int)(Math.random()*50));

    

    this.addMouseMotionListener(this); 

    this.addMouseListener(this); 

  }

  public void paintComponent(Graphics g) {

    // g.drawString("Howdy", 100, 200); 

    tree.root.draw(g);

  }

}