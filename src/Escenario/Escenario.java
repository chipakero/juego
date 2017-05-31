/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenario;

import Scores.Datos;
import Scores.Puntajes;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import paanel.*;

/**
 *
 * @author Diego
 */
public class Escenario extends JFrame {

    public Escenario() {
        add(new NewPanel());
        setTitle("Ninja Jump");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Escenario frame = new Escenario();
        Puntajes Lista = new Puntajes();
        Datos Jugador = new Datos();
        int choice = JOptionPane.showConfirmDialog(null, " Bienvenido a Ninja Jump \n ¿Quieres leer las instrucciones? ");
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, " 1)Salta con Arriba \n 2) Muevete hacia los lados con Izquieda y Derecha");
            String a = JOptionPane.showInputDialog(null, "Ingresa tu nombre", "Informacion", JOptionPane.QUESTION_MESSAGE);
            if ((a == null) || choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Tu Score no se guardara, jugaras como invitado");
            } else {
                Jugador.setNombre(a);
            }
            JOptionPane.showMessageDialog(null, " Presiona Enter para Empezar  ");
        } else if (choice == JOptionPane.NO_OPTION) {
            String a = JOptionPane.showInputDialog(null, "Ingresa tu nombre", "Informacion", JOptionPane.QUESTION_MESSAGE);
            if ((a == null) || choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Tu Score no se guardara, jugaras como invitado");
            } else {
                Jugador.setNombre(a);
            }
            JOptionPane.showMessageDialog(null, " Presiona Enter para Empezar ");
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Haz salido del juego.");
            frame.setVisible(false);
        }
    }

}
