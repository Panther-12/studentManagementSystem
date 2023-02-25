package SwingTutorials;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout{
    // constructor for the layout class
    Layout(){}
    public static void main(String[] args){
        // createWindow();
        JFrame window = new JFrame("StudentLogin");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);


        // Creating Menu bar and drop down menus
        JMenuBar options = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Help");

        // Add the sub menus to the main menu
        options.add(menu1);
        options.add(menu2);

        // Add items to the two sub menus
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        menu1.add(open);
        menu1.add(save);

        // Add items to the second menu
        JMenuItem  documentation = new JMenuItem("Documentation");
        JMenuItem  about = new JMenuItem("About");
        menu2.add(documentation);
        menu2.add(about);

        JTextArea chatText = new JTextArea();

        // Panel to hold the bottom chat window
        JPanel userInterface = new JPanel();
        
        // Layout of the input field for user interaction
        JLabel prompt = new JLabel("Enter text:");
        JTextField input = new JTextField(10);
        JButton send = new JButton("Send");
        send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == send){
                    chatText.append("Nimrod:"+input.getText()+"\n");
                    System.out.println("Your message:"+input.getText());
                }
            }
        });

        JButton reset = new JButton("Reset");


        // Add them to the panel
        userInterface.add(prompt);
        userInterface.add(input);
        userInterface.add(send);
        userInterface.add(reset);

        window.getContentPane().add(BorderLayout.NORTH,options);
        window.getContentPane().add(BorderLayout.CENTER,chatText);
        window.getContentPane().add(BorderLayout.SOUTH,userInterface);
        window.setVisible(true);

    }
}

// // The actionListener interface is contained in the java.awt.event
// class ClickListener implements ActionListener {
//     // Must implement the method below to eliminate the error
//     public void actionPerformed(ActionEvent e){
//         if(e.getSource() == "send"){
//             System.out.println(input.getText());
//         }
//     }
// }
