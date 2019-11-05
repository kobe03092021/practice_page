package game.minitennis;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarinig("serial")
public class KeyboardExample extends Jpanel {

	public KeyboardExample(){
		KeyListener Listenr = new MyKeyListener();
		addKeyListner(listner);
		setFocusable(true);
	}


	public static void main(String[] args){
		JFrame frame = new JFrame("Mini Tennis");
		KeyboardExample keyboardExample = new KeyboardExample();
		frame.add(keyboardExample);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public class MyKeyListner implements KeyListner {
		@Override
		public void keyTyped(KeyEvent e){

		}

		@Override
		public void keyPressed(KeyEvent e){
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

		}

		@Override
		public void keyReleased(KeyEvent e){
			System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
			
		}
	}
}