import javax.swing.*;
import java.awt.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3,ms1;
    private JMenuItem mi2,mi3,mi4,msi1,msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1,frame2,frame3;
    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.black);
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);

        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        
        frame1.setSize(250,250);
        frame1.setLocation(50,200);
        frame1.setVisible(true);
        frame2.setSize(250,250);
        frame2.setLocation(150,50);
        frame2.setVisible(true);
        frame3.setLocation(250,200);
        frame3.setSize(250,250);
        frame3.setVisible(true);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        fr.add(desktopPane);
        
        fr.setSize(650,650);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
