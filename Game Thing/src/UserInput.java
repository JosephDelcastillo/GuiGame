import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  

public class UserInput extends Frame implements WindowListener{
	private static final long serialVersionUID = 1L;
	
	//Public Variables
	private Label nameLabel;
	private TextField nameInput;
	
    UserInput(){  
        addWindowListener(this);  
        setLayout(new FlowLayout());
        
        nameLabel = new Label("Enter your name");
        nameInput = new TextField(10);
        
        
        add(nameLabel);
        add(nameInput);
        
        setSize(400,400);  
        setVisible(true);  
    }  
      
public static void main(String[] args) {  
    new UserInput();  
}  
public void windowActivated(WindowEvent e) {}  
public void windowClosed(WindowEvent e) {}  
public void windowClosing(WindowEvent e) {  
    dispose();  
}  
public void windowDeactivated(WindowEvent e) {}  
public void windowDeiconified(WindowEvent e) {}  
public void windowIconified(WindowEvent e) {}  
public void windowOpened(WindowEvent arg0) {}  
}  