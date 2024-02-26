package GUI;

import Logica.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class From_Inferior extends JPanel{
    
    public From_Inferior(){
        super.setLayout(null);
        super.setSize(500,70);
        super.setLocation(0,595);
        Timer tiempo = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Principal.blanco);
            }
        });
        tiempo.start();
        init();
    }

    private void init() {
        for (int i = 0; i < iconos.length; i++) {
            iconos[i] = new JLabel();
            
            iconos[i].setIcon(new ImageIcon(getClass().getResource(imagenes[i])));
            iconos[i].setBounds(x,0,70,70);
            super.add(iconos[i]);
            x += 90;
            int aux = i;
            iconos[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    indice = aux;
                }
            });
        }
    }
    public static int indice;
    String[] imagenes = {"../Multimedia/home.png","../Multimedia/cart.png","../Multimedia/profile.png",
                            "../Multimedia/location.png","../Multimedia/notification.png"};
    JLabel[] iconos = new JLabel[imagenes.length];
    private int x = 20;
}
