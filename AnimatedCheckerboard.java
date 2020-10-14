import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;
@SuppressWarnings("serial")
public class AnimatedCheckerboard extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle [] checkerboard = new Rectangle[8];
		
		//Draws Checkerboard
		int x = 20;
		int y = 20; 
		for (int i = 0; i < checkerboard.length; i++) {
			for (int j = 0; j < checkerboard.length; j++) {
				checkerboard[i] = new Rectangle(x, y, 40, 40);
				
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
					try {
						  Thread.currentThread().sleep(10);
						 } 
						catch (InterruptedException e){          
						  e.printStackTrace();
					}
					  g2.setPaint(Color.red);
					  g2.fill(checkerboard[i]);
				} else {
					try {
						  Thread.currentThread().sleep(10);
						 } 
						catch (InterruptedException e){          
						  e.printStackTrace();
					}
					g2.setPaint(Color.black);
					g2.fill(checkerboard[i]);
				}
				
				g2.draw(checkerboard[i]);
				
				x += 40;
			}
			x = 20;
			y += 40;
		}
	}
}