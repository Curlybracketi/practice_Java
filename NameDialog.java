 // NAmeDialog.java
 // basic import with a dialog box.
 import javax.swing.JOptionPane;

 public class NameDialog
 {
     public static void main(String[] args )
     {
         // prompt user to enter name
         String name =
                 JOptionPane.showInputDialog( "What is your name?" );

         // create the message
         String message =
                 String.format( "Welcome, %s, to Java Programming!", name );

         // dispaly the messsage to welcome the user by name
         JOptionPane.showMessageDialog( null, message );
     } // end main
 } // end class NameDialog