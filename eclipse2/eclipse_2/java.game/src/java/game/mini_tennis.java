/**
 * 
 */
package java.game;

/**
 * @author tetuya
 *
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderignHints;
import java.awt.geom.Ellipse2D;
import javax.swing._lFrame;
import javax.swing.JFrame;
import javax.swing._JPanel;

@SuppresWarnings("serial")
public class mini_tennis extends Jpanel {

	/**
	 * @param args
	 */
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0,30, 30);
		g2d.drawOval(0, 50, 30, 30);
		g2d.fillRect(50, 0, 30, 30);
		g2d.drawRect(50, 50, 30, 30);
		
		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Mini Tennis");
		frame.add(new mini_tennis());
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
