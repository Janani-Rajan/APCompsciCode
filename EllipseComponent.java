import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
@SuppressWarnings("serial")
public class EllipseComponent extends JComponent {
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double circle = new Ellipse2D.Double(20, 20, 60, 60);
		g2.draw(circle);
		Point2D.Double from = new Point2D.Double(30, 30);
		Point2D.Double to = new Point2D.Double(70, 70);
		Line2D.Double line = new Line2D.Double(to, from);
		g2.draw(line);
		g2.drawString("MY NAME IS JOEEEEE", 10, 10);
		
	}
}
