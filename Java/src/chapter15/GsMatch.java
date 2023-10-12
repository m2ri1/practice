package chapter15;

import javax.swing.*;
import java.awt.*;

public class GsMatch extends JFrame {
    GsMatch() {
        setTitle("요청 보내기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
        setVisible(true);

    }


    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2,0));

        JLabel l1 = new JLabel("제목");
        JLabel l2 = new JLabel(" ");


        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);

        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);
    }

    void showCenter() {
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(30, 20);
        area.setText("요청 내용을 작성해주세요");
        area.setEnabled(false);
        area.setForeground(Color.MAGENTA);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = {"전체", "여자", "남자"};
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("취소");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("요청보내기");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new GsMatch();
    }
}
