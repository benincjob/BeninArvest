package broCode;
import javax.swing.JOptionPane;
public class MessageBox {

	public static void main(String[] args) {
		
		
		String name;
		name = JOptionPane.showInputDialog("Please enter your name: ");
		JOptionPane.showMessageDialog(null, "You are the man! " + name);
		

	}

}
