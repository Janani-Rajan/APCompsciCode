import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
@SuppressWarnings("serial")
public class OlympicRingComponent extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle1 = new Ellipse2D.Double(20, 150, 30, 30);
		g2.setColor(Color.blue);
		g2.draw(circle1);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(55, 150, 30, 30);
		g2.setColor(Color.black);
		g2.draw(circle2);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(90, 150, 30, 30);
		g2.setColor(Color.red);
		g2.draw(circle3);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(37.5, 165, 30, 30);
		g2.setColor(Color.yellow);
		g2.draw(circle4);
		Ellipse2D.Double circle5 = new Ellipse2D.Double(72.5, 165, 30, 30);
		g2.setColor(Color.green);
		g2.draw(circle5);
		
	}
}
