import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    private JPanel mainPanel;
    private JButton nextMenuButton;
    private JTextField userNameTextField;
    public final static int PANEL_WIDTH = 640;
    public final static int PANEL_HEIGHT = 480;
    public final static int FONT_SIZE = 22;

    //Constructor for the MainMenu form - most things happen here!
    public MainMenu(){
        //Sets the form title - super means use the Constructor in the parent class
        super("Main Menu");
        //What happens when the form closes - always the same
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Uses the panel we set up - always the same
        this.setContentPane(mainPanel);
        //Sets the size of the form
        // if you do it this way all of your forms will be the same size
        mainPanel.setPreferredSize(new Dimension(  PANEL_WIDTH, PANEL_HEIGHT));
        //This means all of the components have the same size font & same font type
        nextMenuButton.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
        userNameTextField.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
        //This part builds the form
        this.pack();
        //Each component can have an action listener
        nextMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                NextMenu.showForm(userNameTextField.getText());
            }
        });
    }

    /**
     * Method to display the form
     */
    public static void showForm() {
        //Make a new instance of the form
        JFrame frame = new MainMenu();
        //Position it in the middle of the screen
        frame.setLocationRelativeTo(null);
        //Make it visible
        frame.setVisible(true);
    }

    /**
     * Main method that belongs to each form
     * @param args
     */
    public static void main(String[] args) {
        showForm();
    }

}
