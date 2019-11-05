package game.minitennis;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListner;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarinig("serial")
public class Game extends Jpanel{

	Ball ball = new Ball(this);
	Racquet racquet = new Racquet(this);

	public Game(){
		addKeyListner(new KeyListner(){
			@Override
			public void keyTyped(KeyEvent e){
			}
			
			@Override
			public void keyReleased(KeyEvent e){
				racquet.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e){
				racquet.keyPressed(e);
			}
		)};
		setFocousable(true);
	}

	private void move(){
		ball.move();
		racquet.move();
	}

	@Override
	public void paint(Graphic g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			RendreingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
		racquet.paint(g2d);
	}

	public static void main(String[] args) throws InterruptedException{
		JFrame frame = new JFrame("Mini Tennis");
		Game game = new Game();
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true){
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
}