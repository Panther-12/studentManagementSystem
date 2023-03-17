import javax.swing.*;
import java.awt.*;

public class PersonUI extends JFrame {
    private JLabel nameLabel, addressLabel, phoneNumberLabel, emailLabel;
    private JTextField nameField, addressField, phoneNumberField, emailField;

    public PersonUI() {
        // Create labels and text fields for person information
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        addressLabel = new JLabel("Address:");
        addressField = new JTextField(20);
        phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField(20);
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        // Add labels and text fields to the content pane
        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 2));
        container.add(nameLabel);
        container.add(nameField);
        container.add(addressLabel);
        container.add(addressField);
        container.add(phoneNumberLabel);
        container.add(phoneNumberField);
        container.add(emailLabel);
        container.add(emailField);

        // Set window properties
        setTitle("Person");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PersonUI();
    }
}
