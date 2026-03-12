import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Poring implements MouseListener {
    private JLabel ImgPoring;
    private JLabel CountPoring;
    private JFrame fr;
    private static int poringCount = 0;
    public Poring() {
        poringCount += 1;
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/poring.png"));
        ImgPoring = new JLabel(icon);
        
        CountPoring = new JLabel(String.valueOf(poringCount));
        fr = new JFrame();
        
        ImgPoring.addMouseListener(this);
        
        fr.setLayout(new FlowLayout());
        fr.add(ImgPoring);
        fr.add(CountPoring);
        
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setResizable(false);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == ImgPoring) {
            fr.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
