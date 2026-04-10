package button;



import java.util.Random;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Class {
    public static void main(String[] args) {
      
       JFrame frame = new JFrame("");
       frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       
    //    JLabel label = new JLabel("label");
    //    label.setBounds(40, 10, 200, 30);

       JButton button = new JButton("clickme");
       button.setSize(100, 40);

       int maxX = frame.getWidth() -button.getWidth() - 20;
       
       int maxY = frame.getWidth() -button.getWidth() - 40;

       Random random = new Random();

       int x = random.nextInt(Math.max(1, maxY));
       int y = random.nextInt(Math.min(1, maxY));
       button.setLocation(x, y);
       
 Timer hidTimer = new Timer(1000, new ActionListener() {

    @Override
        public void actionPerformed(ActionEvent e){
            button.setVisible(false);
        }
    
 });
 hidTimer.start();
 frame.add(button);
frame.setVisible(true);

      
 }
        
    }
    

