package com.company.View;

import com.company.controller.CesarController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class CesarView {
    private JButton btVigenere;
    private JButton btTrans;
    private JTextField tfClave;
    private JTextField tfCriptar;
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

        btCriptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 3;
                CesarController controlador = new CesarController(boton);
                String texto = tfCriptar.getText();
                int clave = Integer.parseInt(tfClave.getText());
                controlador.setTexto(texto);
                controlador.setClave(clave);
            }
        });
        btdes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 4;
                CesarController controlador = new CesarController(boton);
                String texto = tfCriptar.getText();
                int clave = Integer.parseInt(tfClave.getText());
                controlador.setTexto(texto);
                controlador.setClave(clave);
            }
        });
    }




    private void createUIComponents() {


    }

}
