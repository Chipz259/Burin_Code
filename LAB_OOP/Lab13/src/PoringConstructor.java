import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener {
    private JButton add;
    private JFrame fr;
    public PoringConstructor() {
        add = new JButton("Add");
        fr = new JFrame();
        
        add.addActionListener(this);
        
        fr.setLayout(new FlowLayout());
        fr.add(add);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            new Poring();
        }
    }
}
