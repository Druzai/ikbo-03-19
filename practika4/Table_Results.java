package ru.mirea.practika4;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Table_Results extends JFrame implements ActionListener {
    private final Font fnt = new Font("Times new roman",Font.BOLD,17);
    private final JButton Button1 = new JButton("AC Milan");
    private final JButton Button2 = new JButton("Real Madrid");
    private final JLabel lb_res = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private int ResMilan = 0;
    private int ResMadrid = 0;
    private final JLabel lb_last_score = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private final Label lb_win = new Label("Winner: DRAW", Label.CENTER);

    public Table_Results(){
        init();

        this.setTitle("Match results table");
        this.setMinimumSize(new Dimension(680, 680));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void init(){
        Button1.addActionListener(this);
        Button2.addActionListener(new ButtonAction());
        Button1.setFont(fnt);
        Button2.setFont(fnt);
        lb_last_score.setFont(fnt);
        lb_win.setFont(fnt);
        lb_res.setFont(fnt);

        JPanel[] pnl = new JPanel[9];
        for(int i = 0 ; i < pnl.length ; i++) {
            pnl[i] = new JPanel();
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }
        this.setLayout(new GridLayout(3,3));

        pnl[0].add(Button1, BorderLayout.CENTER);
        pnl[2].add(Button2, BorderLayout.CENTER);
        pnl[4].add(lb_win, BorderLayout.CENTER);
        pnl[6].add(lb_last_score, BorderLayout.CENTER);
        pnl[8].add(lb_res, BorderLayout.CENTER);
    }

    public static void main(String[] args){
        new Table_Results();
    }

    private void buttonAction(boolean Milan){
        if (Milan){
            this.ResMilan++;
            lb_last_score.setText("Last Scorer: AC Milan");
        }
        else {
            this.ResMadrid++;
            lb_last_score.setText("Last Scorer: Real Madrid");
        }
        lb_res.setText("Result: " + ResMilan + " X " + ResMadrid);

        String retText = "";
        if (ResMilan > ResMadrid){
            retText = "Winner: AC Milan";
        }
        else if (ResMilan < ResMadrid){
            retText = "Winner: Real Madrid";
        }
        else {
            retText = "Winner: DRAW";
        }
        lb_win.setText(retText);
    }

    private class ButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonAction(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button1) {
            buttonAction(true);
        }
    }
}
