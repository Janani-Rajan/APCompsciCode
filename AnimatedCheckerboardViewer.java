import javax.swing.JFrame;
public class AnimatedCheckerboardViewer {
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,800);
		frame.setTitle("Animated Graphic Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		AnimatedCheckerboard checkerboard = new AnimatedCheckerboard();
		frame.add(checkerboard);
		frame.setVisible(true);
		
		
	}
}
