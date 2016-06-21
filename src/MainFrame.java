import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int HEIGHT = 220;
    public static final int WIDTH = 300;

    public MainFrame(){
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Demo Main Frame");
        this.setSize(this.WIDTH, this.HEIGHT);
        this.setLayout(null);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(25, 30, 70, 30);
        this.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setName("username");
        usernameField.setBounds(105, 30, 145, 30);
        this.add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(25, 70, 70, 30);
        this.add(passwordLabel);

        JTextField passwordField = new JPasswordField();
        passwordField.setName("password");
        passwordField.setBounds(105, 70, 145, 30);
        this.add(passwordField);

        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(100, 115, 100, 30);
        this.add(loginButton);

        this.centreFrame();
        this.setVisible(true);
    }

    public void centreFrame(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int xPos = (dim.width/2) - (this.getSize().width/2);
        int yPos = (dim.height/2) - (this.getSize().height/2);

        this.setLocation(xPos, yPos);
    }
}
