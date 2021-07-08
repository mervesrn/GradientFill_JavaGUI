package ceng497_lab5;
import java.awt.Color;  
import java.awt.GradientPaint;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
public class GradientPaintDemo extends JPanel 

{  
	
	public void paint(Graphics g)   
	 {  
	  super.paint(g);  
	  Graphics2D g2d = (Graphics2D) g;  
	  int x=0;
	  int y=0;
	  int width= this.getWidth()/2;
	  int height=this.getHeight();
	 
	  GradientPaint gp1 = new GradientPaint(10, 20, Color.BLUE, 200, 150, Color.black);  
	  g2d.setPaint(gp1);  
	  g2d.fillRect(x, y, width, height); 
	  
	  x+=width;
	  GradientPaint gp2 = new GradientPaint(0, 0, Color.MAGENTA, 0, 20, Color.black, true);   
	  g2d.setPaint(gp2); 
	  g2d.fillRect(x, y, width, height); 
	 
	 }  
	 public static void main(String[] args)   
	 {  
	  JFrame frame = new JFrame("--Non Cyclic Gradient and Cyclic Gradient--");  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  frame.add(new GradientPaintDemo());  
	  frame.setSize(500, 500);  
	  frame.setLocationRelativeTo(null);  
	  frame.setVisible(true);  
	 }  
}  