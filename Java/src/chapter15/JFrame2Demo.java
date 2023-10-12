package chapter15;

import javax.swing.*;

public class JFrame2Demo extends JFrame {
    JFrame2Demo() {
        setTitle("안녕 미리");

        JButton jb = new JButton("button");
        add(jb);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame2Demo();
    }
}
