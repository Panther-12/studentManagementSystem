package SwingTutorials;
import javax.swing.*;

public class Gui{
    // enum Window{
    //     WIDTH(2),
    //     HEIGHT(3)
    // }
    static JFrame window = new JFrame("StudentLogin");
    static JButton hello = new JButton("Hello Nimrod");

    static void createWindow(){
        // The frame holds all the components 
        // Window width = Window.WIDTH;
        // Window height = Window.HEIGHT;


        // OnClick close close the current window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);


        window.getContentPane().add(hello);
        window.setVisible(true);
    }
}