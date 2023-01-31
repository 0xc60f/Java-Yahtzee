import java.awt.*;
import javax.swing.*;
import Helpers.*;
public class GraphicsDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        JButton helloThere = new JButton("Hello There");
        EndingListener listener = new EndingListener();
        helloThere.addActionListener(listener);
        frame.add(helloThere);
        Player player = new Player("Bob");
        System.out.println(player);
    }
}
