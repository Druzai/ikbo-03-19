package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui_TextArea extends JFrame implements ActionListener {
    private final JTextArea jTa = new JTextArea("\n\n\n\n\n\nTest message");
    private JMenuBar menuBar = new JMenuBar();
    private JMenu mFont = new JMenu("Font");
    private JMenu mColor = new JMenu("Color");
    private JMenuItem[] items = new JMenuItem[6];
    private final Font fnt1 = new Font("Times New Roman", Font.PLAIN ,15);
    private final Font fnt2 = new Font("MS Sans Serif", Font.PLAIN ,15);
    private final Font fnt3 = new Font("Courier New", Font.PLAIN ,15);

    public Gui_TextArea(){
        String[] arr = {"Times New Roman", "MS Sans Serif", "Courier New", "Black", "Red", "Blue"};
        for(int i = 0; i < items.length; i++ ){
            items[i] = new JMenuItem(arr[i]);
            items[i].addActionListener(this);
            if (i < 3) mFont.add(items[i]);
            else mColor.add(items[i]);
        }
        menuBar.add(mFont);
        menuBar.add(mColor);
        this.setLayout(new BorderLayout());
        this.add(menuBar, BorderLayout.PAGE_START);
        this.add(jTa, BorderLayout.CENTER);
        this.setTitle("Test");
        this.setMinimumSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new Gui_TextArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == items[0]) jTa.setFont(fnt1);
        if (e.getSource() == items[1]) jTa.setFont(fnt2);
        if (e.getSource() == items[2]) jTa.setFont(fnt3);
        if (e.getSource() == items[3]) jTa.setForeground(Color.black);
        if (e.getSource() == items[4]) jTa.setForeground(Color.red);
        if (e.getSource() == items[5]) jTa.setForeground(Color.blue);
    }
}
