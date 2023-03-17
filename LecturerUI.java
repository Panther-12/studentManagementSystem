import javax.swing.*;
import java.awt.*;

public class LecturerUI extends JFrame {
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel phoneNumberLabel;
    private JLabel emailLabel;
    private JLabel staffNumberLabel;
    private JLabel departmentLabel;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField phoneNumberField;
    private JTextField emailField;
    private JTextField staffNumberField;
    private JTextField departmentField;
    private JButton saveButton;
    private JButton clearButton;

    public LecturerUI() {
        setTitle("Lecturer Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        nameLabel = new JLabel("Name:");
        addressLabel = new JLabel("Address:");
        phoneNumberLabel = new JLabel("Phone Number:");
        emailLabel = new JLabel("Email:");
        staffNumberLabel = new JLabel("Staff Number:");
        departmentLabel = new JLabel("Department:");
        nameField = new JTextField(20);
        addressField = new JTextField(20);
        phoneNumberField = new JTextField(20);
        emailField = new JTextField(20);
        staffNumberField = new JTextField(20);
        departmentField = new JTextField(20);
        saveButton = new JButton("Save");
        clearButton = new JButton("Clear");

        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressField);
        add(phoneNumberLabel);
        add(phoneNumberField);
        add(emailLabel);
        add(emailField);
        add(staffNumberLabel);
        add(staffNumberField);
        add(departmentLabel);
        add(departmentField);
        add(saveButton);
        add(clearButton);

        setVisible(true);
    }
}
