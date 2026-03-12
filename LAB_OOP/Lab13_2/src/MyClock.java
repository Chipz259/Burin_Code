import java.awt.*;
import java.util.*;
import javax.swing.*;
public class MyClock extends JLabel implements Runnable {
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            
            String secStr = "";
            if (sec < 10) {
                secStr = "0" + sec;
            } else {
                secStr = String.valueOf(sec);
            }
            String minStr = "";
            if (min < 10) {
                minStr = "0" + min;
            } else {
                minStr = String.valueOf(min);
            }
            String hourStr = "";
            if (hour < 10) {
                hourStr = "0" + hour;
            } else {
                hourStr = String.valueOf(hour);
            }

            this.setFont(new Font("Tahoma", Font.BOLD, 48));
            this.setText(hourStr + ":" + minStr + ":" + secStr);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
