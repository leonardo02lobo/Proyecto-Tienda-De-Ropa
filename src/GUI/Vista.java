package GUI;

import Logica.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Vista {

    public static int aux;

    public void IniciarComponentes(JPanel[] con, JPanel contenido, int[] posicionX, int[] posicionY, int ancho, int alto) {

        for (int i = 0; i < con.length; i++) {
            con[i] = new JPanel();
            con[i].setBounds(posicionX[i], posicionY[i], ancho, alto);
            int j = i;
            Timer tiempo = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    con[j].setBackground(Color.gray);
                }
            });
            tiempo.start();
            con[i].setLayout(null);
            con[i].setOpaque(true);
            contenido.add(con[i]);
            int x = i;
            con[i].addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    aux = x;
                    From_Inferior.indice = 3;
                }
            });
        }
    }

    public void IniciarComponentesDeTexto(JLabel[] con, JPanel[] contenido, int posicionX, int posicionY, String[] url, int ancho, int alto) {

        for (int i = 0; i < con.length; i++) {
            con[i] = new JLabel(url[i]);
            con[i].setBounds(posicionX, posicionY, ancho, alto);
            con[i].setFont(new Font("calibri", 1, 20));
            int j = i;
            Timer tiempo = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(Principal.blanco == Color.black){
                        con[j].setForeground(Color.white);
                    }else{
                        con[j].setForeground(Color.black);
                    }
                }
            });
            tiempo.start();
            
            contenido[i].add(con[i]);
        }
    }

    public void IniciarComponentesDeImagenes(JLabel[] con, JPanel[] contenido, String[] url, int posicionX, int posicionY, int ancho, int alto) {

        for (int i = 0; i < con.length; i++) {
            con[i] = new JLabel(new ImageIcon(getClass().getResource(url[i])));
            con[i].setBounds(posicionX, posicionY, ancho, alto);
            contenido[i].add(con[i]);
        }
    }
}
