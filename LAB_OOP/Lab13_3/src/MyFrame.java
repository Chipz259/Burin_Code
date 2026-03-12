import java.awt.*;
import javax.swing.*;
public class MyFrame {
    private JFrame fr;
    public void main() {
        fr = new JFrame("My Clock");
        
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        
        t.start();
        
        fr.setLayout(new FlowLayout());
        fr.add(clock);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,100);
        fr.setVisible(true);
    }
}
