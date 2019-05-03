package com.company.View;

import com.company.Controller.CesarController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class CesarView {
    private JButton btVigenere;
    private JButton btTrans;
    private JTextField tfClave;
    private JTextField tfCriptar;
    private JButton btCriptar;
    private JButton btdes;
    private JButton btdesconectar;
    private JButton btFichero;
    private JTextArea mostrar;


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
                mostrar.setText(controlador.getMensaje());
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
                mostrar.setText(controlador.getMensaje());

            }
        });
        btFichero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int boton = 5;
                CesarController controlador = new CesarController(boton);
                String texto = tfCriptar.getText();
                int clave = Integer.parseInt(tfClave.getText());
                controlador.setClave(clave);
                controlador.setTexto(texto);


            }
        });
        btdesconectar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
    }




    private void createUIComponents() {


    }

}
