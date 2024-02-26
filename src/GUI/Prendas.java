package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class Prendas extends Panel_Iterativo{
    
    public Prendas(){
        Timer tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
            }
        });
        tiempo.start();
    }
    
    @Override
    public void init() {
        ImageIcon imagen = new ImageIcon(getClass().getResource(Constantes_Fijas.url[Vista.aux]));
        JLabel img = new JLabel(imagen);
        img.setBounds(10,10,450,180);
        add(img);
        
        contenido.setText(Constantes_Fijas.cartasString[Vista.aux]);
        contenido.setBounds(20,200,200,20);
        contenido.setFont(new Font("calibri",1,25));
        add(contenido);
        
        precio.setText(Constantes_Fijas.preciosString[Vista.aux]);
        precio.setBounds(20,250,200,20);
        precio.setForeground(Color.cyan);
        precio.setFocusable(false);
        precio.setFont(new Font("calibri",1,25));
        add(precio);
        
        comprar.setText("Comprar");
        comprar.setBounds(300,220,100,25);
        add(comprar);
        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La opcion no esta disponible en estos momentos");
            }
        });
    }
    JLabel contenido = new JLabel();
    JLabel precio = new JLabel();
    JButton comprar = new JButton();
}
