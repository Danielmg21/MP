package com.company.View;

import com.company.Controller.CesarController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CesarView {
    private JButton btVigenere;
    private JButton btTrans;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btCriptar;
    private JButton btdes;
    private JTextField textField3;
    private JButton btdesconectar;



    public CesarView() {
        btVigenere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 1;
                CesarController controlador = new CesarController(boton);
            }
        });
        btTrans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 2;
                CesarController controlador = new CesarController(boton);
            }
        });

    }

    private void createUIComponents() {


    }

}
