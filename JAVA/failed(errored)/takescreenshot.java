
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ln;
import javax.imageio.ln;
 
class Snap
{
 public static void main(String args[]) throws Exception
 {
  Robot awt_robot = new Robot();
  BufferedImage Entire_Screen = awt_robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
  ImageIO.write(Entire_Screen, "PNG", new File("Entire_Screen.png"));
 }
}