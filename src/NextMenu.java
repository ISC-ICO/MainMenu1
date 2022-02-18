import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextMenu extends JFrame{
    private JPanel mainPanel;
    private JButton mainMenuButton;
    private JLabel userNameLabel;

    public NextMenu(String userName){
        super("Next Menu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        mainPanel.setPreferredSize(new Dimension(  MainMenu.PANEL_WIDTH, MainMenu.PANEL_HEIGHT));
        mainMenuButton.setFont(new Font("Arial", Font.BOLD, MainMenu.FONT_SIZE));
        userNameLabel.setFont(new Font("Arial", Font.BOLD, MainMenu.FONT_SIZE));
        userNameLabel.setText("userName: " + userName);
        this.pack();
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainMenu.showForm();
            }
        });
    }

    public static void showForm(String userName) {
        JFrame frame = new NextMenu(userName);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showForm("");
    }
}
