import javax.swing.*;
import java.awt.*;

public class CourseUI extends JFrame {

    // Labels for course information
    private JLabel codeLabel, titleLabel, creditUnitLabel;

    // Text fields for course information
    private JTextField codeField, titleField, creditUnitField;

    // Buttons for course actions
    private JButton addButton, removeButton, viewButton;

    // Constructor
    public CourseUI() {
        super("Course Management System");
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create labels and text fields for course information
        codeLabel = new JLabel("Course Code:");
        titleLabel = new JLabel("Course Title:");
        creditUnitLabel = new JLabel("Credit Unit:");

        codeField = new JTextField(20);
        titleField = new JTextField(20);
        creditUnitField = new JTextField(5);

        // Create buttons for course actions
        addButton = new JButton("Add Course");
        removeButton = new JButton("Remove Course");
        viewButton = new JButton("View Course");

        // Create panel to hold course information components
        JPanel courseInfoPanel = new JPanel(new GridLayout(3, 2));
        courseInfoPanel.add(codeLabel);
        courseInfoPanel.add(codeField);
        courseInfoPanel.add(titleLabel);
        courseInfoPanel.add(titleField);
        courseInfoPanel.add(creditUnitLabel);
        courseInfoPanel.add(creditUnitField);

        // Create panel to hold course action buttons
        JPanel courseButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        courseButtonPanel.add(addButton);
        courseButtonPanel.add(removeButton);
        courseButtonPanel.add(viewButton);

        // Create panel to hold all components
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(courseInfoPanel, BorderLayout.CENTER);
        mainPanel.add(courseButtonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CourseUI();
    }
}
