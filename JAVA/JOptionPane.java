public class Client {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
              Socket conToServer =  new Socket("localhost", 433);
        DataOutputStream toServer  = new DataOutputStream(conToServer.getOutputStream());
      String radius =   JOptionPane.showInputDialog("Enter radius");
       String height =  JOptionPane.showInputDialog("Enter height");
          int rad =  Integer.parseInt(radius.trim());
          int h =  Integer.parseInt(height.trim());
          toServer.writeInt(rad);
          toServer.write(h);
          toServer.flush();
          JOptionPane.showMessageDialog(null,"Numbers are sent to server for calculation: " + rad + " and " + h);
        } catch (IOException | HeadlessException | NumberFormatException e) {
            System.err.println(e);
        }
    }
}
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(433);
            while (true) {                
                Socket conn = server.accept();
                HandleClient thread = new HandleClient(conn);
                thread.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 class HandleClient extends Thread
{
     private Socket conToClient;
     Double pi = 3.14;
     int r = 0;
     int h =0;
     Double surfArea;
    public HandleClient(Socket conToClient) {
        this.conToClient = conToClient;
    }
    public void run()
    {
        try {
            DataInputStream fromClient = new DataInputStream(conToClient.getInputStream());
            while (true) {                
               r = fromClient.readInt();
               h = fromClient.readInt();
                   surfArea =  2*(pi * r*r)+ 2*(pi*h*r);
                JOptionPane.showMessageDialog(null,surfArea);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}