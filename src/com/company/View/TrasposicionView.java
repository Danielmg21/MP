package com.company.View;

import com.company.Controller.VigenereController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrasposicionView {
    private JTextField textField2;
    private JTextField textField1;
    private JButton btCriptar;
    private JButton btdes;
    private JTextField textField3;
    private JButton btdesconectar;
    private JButton btCesar;
    private JButton btVigenere;

    public TrasposicionView() {
        btVigenere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 1;

            }
        });
        btCesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 2;
            }
        });
        btCriptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 3;
            }
        });
        btdes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 4;
            }
        });
    }
}
