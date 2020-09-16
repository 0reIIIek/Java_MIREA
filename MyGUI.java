package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JFrame {
    int milCount = 0, // Счетчик команды Милан
        madCount = 0; // счетчик команды Мандрид
    JLabel lbRes = new JLabel("Result: "+milCount+" X "+madCount);
    JLabel lbLS = new JLabel("Last Scorer: N/A");
    JLabel lbW = new JLabel("Winner: DRAW");
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");

    public MyGUI(){
        super("Футбол на Бережковской");
        setSize(380, 140);

        /*
        setLayout(new BorderLayout());
        add(lbLS, BorderLayout.CENTER);
        add(lbW, BorderLayout.SOUTH);
        add(lbRes, BorderLayout.NORTH);
        add(madridButton, BorderLayout.EAST);
        add(milanButton, BorderLayout.WEST);
         */

        setLayout(null);
        milanButton.setBounds(0, 0, 110, 110);
        madridButton.setBounds(260,0,110,110);
        add(milanButton);
        add(madridButton);

        lbLS.setBounds(120, 0, 120, 40);
        lbRes.setBounds(120, 30, 120, 40);
        lbW.setBounds(120, 60, 120, 40);
        add(lbLS);
        add(lbRes);
        add(lbW);

        milanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {
                if (madCount + milCount < 4) {
                    lbLS.setText("Last Scorer: AC Milan");
                    milCount++;
                    lbRes.setText("Result: "+milCount+" X "+madCount);
                }
                else {
                    lbLS.setText("Last Scorer: AC Milan");
                    milCount++;
                    lbRes.setText("Result: "+milCount+" X "+madCount);
                    if (milCount > madCount) {
                        lbW.setText("Winner: AC Milan");
                        madCount = 0;
                        milCount = 0;
                    }
                    else{
                        lbW.setText("Winner: Real Madrid");
                        madCount = 0;
                        milCount = 0;
                    }
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        madridButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {
                if (madCount + milCount < 4) {
                    lbLS.setText("Last Scorer: Real Madrid");
                    madCount++;
                    lbRes.setText("Result: "+milCount+" X "+madCount);
                }
                else {
                    lbLS.setText("Last Scorer: Real Madrid");
                    madCount++;
                    lbRes.setText("Result: "+milCount+" X "+madCount);
                    if (milCount > madCount) {
                        lbW.setText("Winner: AC Milan");
                        madCount = 0;
                        milCount = 0;
                    }
                    else{
                        lbW.setText("Winner: Real Madrid");
                        madCount = 0;
                        milCount = 0;
                    }
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    public static void main(String[] args) {
        new MyGUI().setVisible(true);
    }
}
