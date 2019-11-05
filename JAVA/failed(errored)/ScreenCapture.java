import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class CaptureScreen {

	public static void main (String [] args) {

		try{

			Robot robot = new Robot();

			//Capture a particular area on the screen

			int x = 50;
			int y = 50;
			int width = 250;
			int height = 250;

			Rectangle area = new Rectangle(x,y,width,height);

			BufferedImage BufferedImage = 
			robot.CreateScreenCapture(area)
				//WRITE GENERATED IMAGE TO A FILE
	
			try {

				//SAVA AS A PNG
			File file = new File ("ScreenShot_small.png");
			ImageIO.Write(BufferedImage, "png", File);

				} catch (IOException e) {

			System.out.printin("Could not save small screenshot" +
				e.getMessage());
				
				}

				//Capture the whole screen
				area = new
			Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

				bufferedImage = robot.craeteScreenCapture(area);

				//Write generated image to a file

				try {

				//Save as a PNG

				File file = new File("screenshot_full.png");

				ImageIO.write(bufferedImage, "png", file);

					) catch (IOException e) {

			System.out.printIn("Could not save full screenshot" +
			 e.getMessage());

				}
		}	catch (AWTException e) {

			System.out.printIn("could not capture screen" +
				e.getMessage());
		}
		
			}
		}