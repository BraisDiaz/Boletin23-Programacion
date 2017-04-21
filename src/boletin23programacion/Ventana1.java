
package boletin23programacion;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Brais Núñez
 */
public class Ventana1 {
    
    String [] elementosLista ={"ElementoLista1","ElementoLista2","ElementoLista2"};

    JFrame marcoVentana1;
    JPanel panelSuperior;
    JPanel panelInferior;
    JLabel etiquetaNome;
    JLabel etiquetaPass;
    JTextField cuadroNome;
    JPasswordField cuadroPassword;
    JButton botonPremer,botonLimpar,botonBoton;
    JTextArea areaTexto;
    JList lista;

    public void crearMarco() {

        marcoVentana1 = new JFrame();
        marcoVentana1.setSize(1500, 1500);
        marcoVentana1.setVisible(true);
        marcoVentana1.setLocationRelativeTo(null);
        marcoVentana1.add(panelSuperior);
        marcoVentana1.add(panelInferior);
        marcoVentana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void manejoPaneles() {

        panelSuperior = new JPanel();
        panelInferior = new JPanel();
        
        panelSuperior.setBounds(0, 0, 1500, 650);
        panelSuperior.setLayout(null);
        panelSuperior.setVisible(true);
        panelSuperior.setBackground(Color.black);
        panelSuperior.add(etiquetaNome);
        panelSuperior.add(etiquetaPass);
        panelSuperior.add(botonPremer);
        panelSuperior.add(botonLimpar);
        panelSuperior.add(cuadroPassword);
        panelSuperior.add(cuadroNome);
                    
        
        panelInferior.setBackground(Color.ORANGE);
        panelInferior.setBounds(500, 0, 200, 200);       
        panelInferior.setLayout(null);       
        panelInferior.setVisible(true);
        panelInferior.add(areaTexto);
        panelInferior.add(botonBoton);
        panelInferior.add(lista);
}

    public void manejoEtiquetas() {

        etiquetaNome = new JLabel("NOME");
        etiquetaPass = new JLabel("PASSWORD");

        etiquetaNome.setVisible(true);
        etiquetaNome.setSize(150, 175);
        etiquetaNome.setLocation(0, 30);
        Font tipoFuente = new Font("Arial", Font.BOLD, 21);
        etiquetaNome.setFont(tipoFuente);
        etiquetaNome.setForeground(Color.orange);
        
        
        etiquetaPass.setVisible(true);
        etiquetaPass.setSize(200, 420);
        etiquetaPass.setLocation(00, 5);
        etiquetaPass.setFont(tipoFuente);
        etiquetaPass.setForeground(Color.orange);

    }

    public void manejoCuadros() {

        cuadroNome = new JTextField();
        cuadroNome.setLocation(200, 100);
        cuadroNome.setSize(600, 50);
        
        cuadroPassword = new JPasswordField();
        cuadroPassword.setSize(600, 50);
        cuadroPassword.setLocation(200, 200);
        
        lista = new JList(elementosLista);
        lista.setSize(500, 400);
        lista.setLocation(100, 700);
        
        areaTexto = new JTextArea();
        areaTexto.setSize(300, 400);
        areaTexto.setLocation(1000,700);
        areaTexto.setText("AREA DE TEXTO");    
    }

public void crearBotones(){
 
    botonPremer = new JButton("PREMER");
    botonLimpar = new JButton("LIMPAR");  
    botonBoton = new JButton("BOTON");

    botonPremer.setSize(400, 100);
    botonLimpar.setSize(400, 100); 
    botonBoton.setSize(250, 150);
    
    botonPremer.setLocation(280, 500);
    botonLimpar.setLocation(800, 500);
    botonBoton.setLocation(680, 800);    
}   
}
