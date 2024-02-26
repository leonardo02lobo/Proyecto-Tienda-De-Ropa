package GUI;

import Logica.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Nav_Fijo extends JPanel{
    
    public Nav_Fijo(){
        super.setLayout(null);
        super.setBounds(0,0,500,70);
        Timer tiempo = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Principal.blanco);
                if(Principal.blanco == Color.black){
                    titulo.setForeground(Color.white);
                }else{
                    titulo.setForeground(Color.black);
                }
            }
        });
        tiempo.start();
        init();
    }

    private void init() {
        titulo.setText("Tienda Online");
        titulo.setBounds(150,10,200,50);
        titulo.setFont(new Font("calibri", 2, 30));
        super.add(titulo);
    }
    
    JLabel titulo = new JLabel();
    JLabel icono_MeGusta = new JLabel();
    JLabel tienda = new JLabel();
    JLabel menu = new JLabel();
}
