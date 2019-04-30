package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vistaCesar {
    private JButton btVigenere;
    private JButton btTrans;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btCriptar;
    private JButton btdes;
    private JTextField textField3;
    private JButton btdesconectar;



    public vistaCesar() {
        btVigenere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 1;
                controladorCesar controlador = new controladorCesar(boton);
            }
        });
        btTrans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 2;
                controladorCesar controlador = new controladorCesar(boton);
            }
        });

    }

    private void createUIComponents() {


    }

}
