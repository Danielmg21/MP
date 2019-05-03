package com.company.View;

import com.company.Controller.VigenereController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VigenereView {
    private JTextField textField2;
    private JTextField tfClave;
    private JButton btCriptar;
    private JButton btdes;
    private JTextField textField3;
    private JButton btdesconectar;
    private JButton btTrans;
    private JButton btCesar;

    public VigenereView() {
        btCesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 1;
                VigenereController controlador = new VigenereController(boton);
            }
        });
        btTrans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 2;
                VigenereController controlador = new VigenereController(boton);
            }
        });
        btCriptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 3;
                VigenereController controlador = new VigenereController(boton);
                String texto = btCriptar.getText();
                int clave = Integer.parseInt(tfClave.getText());
                //controlador.setTexto(texto);
                //controlador.setClave(clave);

            }
        });
        btdes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
