package chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FlowLayoutDemo extends JFrame {
    FlowLayoutDemo() {
        setTitle("GSMATCH");

        JPanel p = new JPanel(new FlowLayout());
        p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JButton b1 = new JButton("전체에게 보내기");
        JButton b2 = new JButton("1학년에게 보내기");
        JButton b3 = new JButton("2학년에게 보내기");
        JButton b4 = new JButton("3학년에게 보내기");

        MouseAdapter resizeAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                Dimension size = button.getPreferredSize();
                button.setPreferredSize(new Dimension((int)(size.width * 1.25), (int)(size.height * 1.25)));
                button.revalidate();
                button.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JButton button = (JButton) e.getSource();
                Dimension size = button.getPreferredSize();
                button.setPreferredSize(new Dimension((int)(size.width / 1.25), (int)(size.height / 1.25)));
                button.revalidate();
                button.repaint();
            }
        };

        b1.addMouseListener(resizeAdapter);
        b2.addMouseListener(resizeAdapter);
        b3.addMouseListener(resizeAdapter);
        b4.addMouseListener(resizeAdapter);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
