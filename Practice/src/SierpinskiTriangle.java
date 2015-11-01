import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SierpinskiTriangle extends JApplet{
	private JTextField jtfOrder = new JTextField("0", 5);
	private SierpinskiTrianglePanel trianglePanel = 
			new SierpinskiTrianglePanel();
	
	public SierpinskiTriangle(){
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(jtfOrder);
		jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
		
		jtfOrder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
			}
		});
	}
	static class SierpinskiTrianglePanel extends JPanel{
		private int order = 0;
		
		public void setOrder(int order){
			this.order = order;
			repaint();
		}
	
		protected void paintComponent(Graphics g){
			super.paintComponents(g);
		
			Point p1 = new Point(getWidth() / 2, 10);
			Point p2 = new Point(10, getHeight() - 10);
			Point p3 = new Point(getWidth() - 10, getHeight() - 10);
		
			displayTriangles(g, order, p1, p2, p3);
		}
		
		private static void displayTriangles(Graphics g, int order,
				Point p1, Point p2, Point p3){
			if(order >= 0){
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
				g.drawLine(p1.x, p1.y, p3.x, p3.y);
				g.drawLine(p2.x, p2.y, p3.x, p3.y);
				
				Point p12 = midPoint(p1, p2);
				Point p23 = midPoint(p2, p3);
				Point p31 = midPoint(p3, p1);
				
				displayTriangles(g, order - 1, p1, p12, p31);
				displayTriangles(g, order - 1, p12, p2, p23);
				displayTriangles(g, order - 1, p31, p23, p3);
			}
		}
		
		private static Point midPoint(Point p1, Point p2){
			return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		}
	}
}