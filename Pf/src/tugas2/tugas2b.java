package tugas2;
import javax.swing.JOptionPane;
public class tugas2b{
    public static void main(String[]args){
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if(username != null && password !=null
                && (
                (username.equals("yoru") && password.equals ("abid")) ||
                        (username.equals("sova") && password.equals ("aqil"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "You're in.");
        } else {
            JOptionPane.showMessageDialog(null, "You're Suspicious!.");
        }
    }
}