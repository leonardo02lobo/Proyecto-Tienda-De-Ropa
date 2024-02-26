package GUI;

import Logica.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Home extends Panel_Iterativo {

    public Home() {
        Timer tiempo = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Principal.blanco);
            }
        });
        tiempo.start();
        init();
    }

    @Override
    public void init() {
        configuracion.setBounds(170, 20, 250, 25);
        configuracion.setFont(new Font("calibri", 1, 25));
        super.add(configuracion);

        modo.setText(modosDeVista[0]);
        modo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aux++;
                if (aux % 2 == 0) {
                    modo.setText(modosDeVista[0]);
                    Principal.blanco = Color.white;
                    configuracion.setForeground(Color.black);
                } else {
                    modo.setText(modosDeVista[1]);
                    Principal.blanco = Color.black;
                    configuracion.setForeground(Color.white);
                }

            }
        });
        modo.setBounds(20, 80, 100, 40);
        add(modo);
    }

    private int aux = 0;
    JLabel configuracion = new JLabel("Configuracion");
    String[] modosDeVista = {"Claro", "Oscuro"};
    JButton modo = new JButton();

}
