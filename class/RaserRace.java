import javax.swing.*;

public class RaserRace extends JFrame {

    JLabel raser1, raser2, raser3;

    public RaserRace() {
        setTitle("Thread Racer Race");
        setSize(600, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        raser1 = new JLabel("Racer 1");
        raser1.setBounds(10, 50, 100, 30);
        add(raser1);

        raser2 = new JLabel("Racer 2");
        raser2.setBounds(10, 100, 100, 30);
        add(raser2);

        raser3 = new JLabel("Racer 3");
        raser3.setBounds(10, 150, 100, 30);
        add(raser3);

        setVisible(true);

        new RacerThread(raser1).start();
        new RacerThread(raser2).start();
        new RacerThread(raser3).start();
    }

    class RacerThread extends Thread {
        JLabel label;

        public RacerThread(JLabel label) {
            this.label = label;
        }

        public void run() {
            for (int x = 10; x <= 500; x += 10) {
                int finalX = x;

                SwingUtilities.invokeLater(() -> {
                    label.setBounds(finalX, label.getY(), 100, 30);
                });

                try {
                    Thread.sleep((int) (Math.random() * 200));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new RaserRace();
    }
}