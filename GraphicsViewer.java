import javax.swing.JFrame;
public class GraphicsViewer {
	
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,800);
		frame.setTitle("Graphic Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		CheckerboardComponent checkerboard = new CheckerboardComponent();
		frame.add(checkerboard);
		frame.setVisible(true);
		
		OlympicRingComponent olympicring = new OlympicRingComponent();
		frame.add(olympicring);
		frame.setVisible(true);
		
		BullseyeComponent bullseye = new BullseyeComponent();
		frame.add(bullseye);
		frame.setVisible(true);
		
	}
}
