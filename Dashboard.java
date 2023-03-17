import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    private JButton studentButton, courseButton, libraryButton, lecturerButton, scoreButton, bookButton;
    
    public Dashboard() {
        setTitle("Student System Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));
        
        // Create buttons for each section of the system
        studentButton = new JButton("Students");
        courseButton = new JButton("Courses");
        libraryButton = new JButton("Library");
        lecturerButton = new JButton("Lecturers");
        scoreButton = new JButton("Scores");
        bookButton = new JButton("Books");
        
        // Add action listeners to each button
        studentButton.addActionListener(this);
        courseButton.addActionListener(this);
        libraryButton.addActionListener(this);
        lecturerButton.addActionListener(this);
        scoreButton.addActionListener(this);
        bookButton.addActionListener(this);
        
        // Add buttons to the dashboard
        add(studentButton);
        add(courseButton);
        add(libraryButton);
        add(lecturerButton);
        add(scoreButton);
        add(bookButton);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Determine which button was pressed and open the corresponding UI
        if (e.getSource() == studentButton) {
            StudentUI studentUI = new StudentUI();
            studentUI.setVisible(true);
        } else if (e.getSource() == courseButton) {
            CourseUI courseUI = new CourseUI();
            courseUI.setVisible(true);
        } else if (e.getSource() == libraryButton) {
            LibraryUI libraryUI = new LibraryUI();
            libraryUI.setVisible(true);
        } else if (e.getSource() == lecturerButton) {
            LecturerUI lecturerUI = new LecturerUI();
            lecturerUI.setVisible(true);
        } else if (e.getSource() == scoreButton) {
            ScoreUI scoreUI = new ScoreUI();
            scoreUI.setVisible(true);
        } else if (e.getSource() == bookButton) {
            BookUI bookUI = new BookUI();
            bookUI.setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
    }
}
