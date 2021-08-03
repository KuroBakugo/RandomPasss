package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JPanel {

    private JTextField  choiceWaysForPassword;
    private JLabel choiceLengthPassword, choiceWaysForPasswordText;
    private JButton[] buttons = new JButton[5];
    private Font font = new Font("SanSerif", Font.BOLD, 10);
    private JButton ok;

    public MyFrame(){
        setLayout(null);

        choiceWaysForPasswordText = new JLabel("Укажите путь для записи пароля: ");
        choiceWaysForPasswordText.setBounds(20, 20, 220, 20);
        add(choiceWaysForPasswordText);

        choiceWaysForPassword = new JTextField();
        choiceWaysForPassword.setBounds(230, 20, 200, 20);
        add(choiceWaysForPassword);

        choiceLengthPassword = new JLabel("Какой длины хотели бы пароль?");
        choiceLengthPassword.setBounds(20, 60, 460, 20);
        add(choiceLengthPassword);

        int j = 6;
        for(int i = 0; i < 5; i++){
            buttons[i] = new JButton((j += 2) +  "");
            buttons[i].setBounds(i * (70) + 20 , 100, 50, 20);
            buttons[i].setFont(font);
            add(buttons[i]);
        }


        ActionListener l  = (ActionEvent e)->{
            RandomPasswordGenerator.setNameFile(choiceWaysForPassword.getText());
            RandomPasswordGenerator.setFilePassword(choiceWaysForPassword.getText());
            JButton b = (JButton)e.getSource();
            RandomPasswordGenerator.setLengthPassword(Integer.parseInt(b.getText()));
        };

        for(JButton b: buttons){
            b.addActionListener(l);
        }

         ok = new JButton("OK");
        ok.setBounds(360,140,80,20);
        ok.setFont(font);
        add(ok);

        ActionListener oks = (ActionEvent e)->{
            if(choiceWaysForPassword.equals(null)) {
                JOptionPane.showMessageDialog(MyFrame.this,
                        "Укажите путь!");
            }else if(RandomPasswordGenerator.getLengthPassword() == 0){
                JOptionPane.showMessageDialog(MyFrame.this,
                        "Укажите длинну пароля!");
            } else {
                RandomPasswordGenerator.choiceLength();
                JOptionPane.showMessageDialog(MyFrame.this,
                        "Пароль был успешно создан и отправлен по пути: " + RandomPasswordGenerator.getNameFile());
            }
        };

        ok.addActionListener(oks);

    }
}
