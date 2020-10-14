import javax.swing.JFrame;
public class EllipseViewer {
	public static void main(String [] args) {
		JFrame frame = new JFrame();
        frame.setSize(600,800);
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        EllipseComponent drawing = new EllipseComponent();
        frame.add(drawing);
	}
}
