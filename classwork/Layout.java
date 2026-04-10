package classwork;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Layout {
   //flow layout
public static void main(String[] args) {
    
//        JFrame frame = new JFrame("FlowLayout");
//         frame.setLayout(new FlowLayout());

//         frame.add(new JButton("Button 1"));
//         frame.add(new JButton("Button 2"));
//         frame.add(new JButton("Button 3"));
//         frame.add(new JButton("Button 4"));
//         frame.add(new JButton("Button 5"));
//         frame.add(new JButton("Button 6"));

//         frame.setSize(300, 150);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);


        //grid layout

        // JFrame frame = new JFrame("GridLayout");
        // frame.setLayout(new GridLayout(2, 3));

        // frame.add(new JButton("Button 1"));
        // frame.add(new JButton("Button 2"));
        // frame.add(new JButton("Button 3"));
        // frame.add(new JButton("Button 4"));
        // frame.add(new JButton("Button 5"));
        // frame.add(new JButton("Button 6"));

        // frame.setSize(400, 200);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);


//Border layout
// JFrame frame = new JFrame("BorderLayout");

// frame.setLayout(new BorderLayout());

// frame.add(new JButton("North"), BorderLayout.NORTH);
// frame.add(new JButton("South"), BorderLayout.SOUTH);
// frame.add(new JButton("East"), BorderLayout.EAST);
// frame.add(new JButton("West"), BorderLayout.WEST);
// frame.add(new JButton("Center"), BorderLayout.CENTER);

// frame.setSize(400, 250);
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setVisible(true);


//Box Layout
   JFrame frame = new JFrame("BoxLayout on JFrame");

       
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    
}






