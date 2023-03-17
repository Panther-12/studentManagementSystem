import javax.swing.*;
import java.awt.*;

public class BookUI extends JFrame {

    private JLabel titleLabel, authorLabel, isbnLabel;
    private JTextField titleField, authorField, isbnField;
    private JButton addButton, clearButton;
    
    public BookUI() {
        // Set up window
        setTitle("Add Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));
        
        // Create labels and text fields for book information
        titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        authorLabel = new JLabel("Author:");
        authorField = new JTextField();
        isbnLabel = new JLabel("ISBN:");
        isbnField = new JTextField();
        
        // Create buttons
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
        
        // Add components to the window
        add(titleLabel);
        add(titleField);
        add(authorLabel);
        add(authorField);
        add(isbnLabel);
        add(isbnField);
        add(addButton);
        add(clearButton);
        
        // Show the window
        setVisible(true);
    }
    
    public static void main(String[] args) {
        BookUI bookUI = new BookUI();
    }
}
