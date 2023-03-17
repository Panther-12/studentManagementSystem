import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LibraryUI extends JFrame {
    
    private Library library;
    private JList<Book> bookList;
    private DefaultListModel<Book> bookListModel;
    private JTextField titleTextField, authorTextField, isbnTextField;
    
    public LibraryUI() {
        // Initialize the library
        library = new Library("My Library");
        
        // Create and configure the main window
        setTitle("Library System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        // Create the book list and add it to the window
        bookListModel = new DefaultListModel<>();
        bookList = new JList<>(bookListModel);
        JScrollPane bookListScrollPane = new JScrollPane(bookList);
        add(bookListScrollPane, BorderLayout.CENTER);
        
        // Create the book information panel and add it to the window
        JPanel bookInfoPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        bookInfoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(bookInfoPanel, BorderLayout.EAST);
        
        JLabel titleLabel = new JLabel("Title:");
        bookInfoPanel.add(titleLabel);
        
        titleTextField = new JTextField();
        bookInfoPanel.add(titleTextField);
        
        JLabel authorLabel = new JLabel("Author:");
        bookInfoPanel.add(authorLabel);
        
        authorTextField = new JTextField();
        bookInfoPanel.add(authorTextField);
        
        JLabel isbnLabel = new JLabel("ISBN:");
        bookInfoPanel.add(isbnLabel);
        
        isbnTextField = new JTextField();
        bookInfoPanel.add(isbnTextField);
        
        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleTextField.getText();
                String author = authorTextField.getText();
                String isbn = isbnTextField.getText();
                
                Book book = new Book(title, author, getDefaultCloseOperation(), isbn, rootPaneCheckingEnabled);
                library.addBook(book);
                
                bookListModel.addElement(book);
                
                titleTextField.setText("");
                authorTextField.setText("");
                isbnTextField.setText("");
            }
        });
        bookInfoPanel.add(addButton);
        
        JButton removeButton = new JButton("Remove Book");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = bookList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Book book = bookListModel.getElementAt(selectedIndex);
                    library.removeBook(book);
                    bookListModel.remove(selectedIndex);
                }
            }
        });
        bookInfoPanel.add(removeButton);
        
        // Add some example books to the library
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", getDefaultCloseOperation(), "9780446310789", rootPaneCheckingEnabled);
        Book book2 = new Book("1984", "George Orwell", getDefaultCloseOperation(), "9780451524935", rootPaneCheckingEnabled);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", getDefaultCloseOperation(), "9780743273565", rootPaneCheckingEnabled);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        bookListModel.addElement(book1);
        bookListModel.addElement(book2);
        bookListModel.addElement(book3);
    }
    
    public static void main(String[] args) {
        LibraryUI libraryUI = new LibraryUI();
        libraryUI.setVisible(true);
    }
}
