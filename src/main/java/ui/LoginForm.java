package ui;


import DAO.TaiKhoanDAO;
import entity.TaiKhoan;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import ui.indexForm;
import utils.Auth;
import utils.OpenFrame;

public class LoginForm extends JDialog {

    private JTextField userNameField;
    private JPasswordField passwordField;
    private int initialX; // Vị trí ban đầu X
    private int initialY; // Vị trí ban đầu Y
    private TaiKhoanDAO tkdao = new TaiKhoanDAO();
    public static boolean menuFormOpened = false;

    public LoginForm(JFrame parent) {
        super(parent, "Login", true);
        initComponents();
        centerOnScreen();
        addComponentListener();
    } 

    public LoginForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initComponents() {
        setSize(300, 100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        userNameField = new JTextField(15);
        passwordField = new JPasswordField(15);

        JLabel userNameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        userNameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin(); // Thực hiện xử lý đăng nhập khi nhấn Enter
            }
        });

        // Lắng nghe sự kiện nhấn Enter ở passwordField
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin(); // Thực hiện xử lý đăng nhập khi nhấn Enter
            }
        });

        panel.add(userNameLabel);
        panel.add(userNameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
    }

    private void centerOnScreen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        initialX = (dim.width - getWidth()) / 2;
        initialY = (dim.height - getHeight()) / 2;
        setLocation(initialX, initialY);
    }
    
    private void addComponentListener() {
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                setLocation(initialX, initialY);
            }
        });
    }

    private void performLogin() {
        String userName = userNameField.getText();
        String password = new String(passwordField.getPassword());
        
        
        TaiKhoan acc = tkdao.selectAccount(userName);
        System.out.println(userName);
        if(acc == null){
            userNameField.setText("sai tên đăng nhập");
        }
        else if(!password.equals(acc.getPassword())){
            userNameField.setText("sai mật khẩu");
        }
        else{
            Auth.user = acc;
            this.dispose();
            OpenFrame.CloseIndexForm();
            OpenFrame.OpenServerMenuForm();

        }
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm(new JFrame()).setVisible(true);
            }
        });
    }
}
