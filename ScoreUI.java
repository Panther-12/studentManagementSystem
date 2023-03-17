import javax.swing.*;
import java.awt.*;

public class ScoreUI extends JFrame {
    private JLabel courseLabel, catScoreLabel, examScoreLabel;
    private JTextField courseTextField, catScoreTextField, examScoreTextField;
    private JButton addButton, removeButton;
    private JList<Score> scoreList;
    
    public ScoreUI() {
        setTitle("Score Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create and add components to the window
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        
        courseLabel = new JLabel("Course:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(courseLabel, constraints);
        
        courseTextField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(courseTextField, constraints);
        
        catScoreLabel = new JLabel("CAT Score:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(catScoreLabel, constraints);
        
        catScoreTextField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(catScoreTextField, constraints);
        
        examScoreLabel = new JLabel("Exam Score:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(examScoreLabel, constraints);
        
        examScoreTextField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(examScoreTextField, constraints);
        
        addButton = new JButton("Add Score");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(addButton, constraints);
        
        removeButton = new JButton("Remove Score");
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(removeButton, constraints);
        
        scoreList = new JList<>();
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        JScrollPane scrollPane = new JScrollPane(scoreList);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        panel.add(scrollPane, constraints);
        
        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ScoreUI scoreUI = new ScoreUI();
    }
}
