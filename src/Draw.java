import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Window");
		JPanel panel = new JPanel();
		MouseHandler handler = new MouseHandler();
		panel.addMouseListener(handler);
		window.add(panel);
		window.setSize(400, 400);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static class MouseHandler implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component) e.getSource();
			Graphics g = source.getGraphics();
			g.setColor(Color.RED);
			g.fillOval(50, 50, 100, 100);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
