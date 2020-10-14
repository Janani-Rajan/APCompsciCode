import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
@SuppressWarnings("serial")
public class BullseyeComponent extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		Ellipse2D.Double circle0 = new Ellipse2D.Double(10, 210, 100, 100);
		g2.draw(circle0);
		Ellipse2D.Double circle1 = new Ellipse2D.Double(20, 220, 80, 80);
		g2.setPaint(Color.black);
		g2.fill(circle1);
		g2.draw(circle1);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(30, 230, 60, 60);
		g2.setPaint(Color.blue);
		g2.fill(circle2);
		g2.draw(circle2);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(40, 240, 40, 40);
		g2.setPaint(Color.red);
		g2.fill(circle3);
		g2.draw(circle3);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(50, 250, 20, 20);
		g2.setPaint(Color.yellow);
		g2.fill(circle4);
		g2.draw(circle4);
		
	}
}
