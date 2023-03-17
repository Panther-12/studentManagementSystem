import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StudentUI extends PersonUI {
    private JLabel regNumberLabel, programLabel, coursesLabel;
    private JTextField regNumberField, programField;
    private JButton addCourseButton, removeCourseButton;
    private JList<Course> courseList;
    private DefaultListModel<Course> courseListModel;

    public StudentUI() {
        super();

        // Create labels and text fields for student information
        regNumberLabel = new JLabel("Registration Number:");
        regNumberField = new JTextField(20);
        programLabel = new JLabel("Program:");
        programField = new JTextField(20);
        coursesLabel = new JLabel("Courses:");
        addCourseButton = new JButton("Add Course");
        removeCourseButton = new JButton("Remove Course");

        // Create list model and JList for courses
        courseListModel = new DefaultListModel<>();
        courseList = new JList<>(courseListModel);

        // Add labels, text fields, and buttons to the content pane
        Container container = getContentPane();
        container.setLayout(new GridLayout(7, 2));
        container.add(regNumberLabel);
        container.add(regNumberField);
        container.add(programLabel);
        container.add(programField);
        container.add(coursesLabel);
        container.add(new JScrollPane(courseList));
        container.add(addCourseButton);
        container.add(removeCourseButton);

        // Set window properties
        setTitle("Student");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentUI();
    }
}
