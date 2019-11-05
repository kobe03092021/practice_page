package game;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class KeyboardExample2 extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini Tennis");
		KeyboardExample2 keyboardExample = new KeyboardExample2();
		frame.add(keyboardExample);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public KeyboardExample2(){
		KeyListenr listner = new KeyListner(){
			@Override
			public void keyTyped(KeyEvent e){

			}

			@Override
			public class keyReleased(KeyEvent e){
				System.out.println("KeyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("KeyReleased="+KeyEvent.getKeyText(e.getKeyCode()));

			}
		};
		addKeyListner(listner);
		setFocusable(true);
	}
}