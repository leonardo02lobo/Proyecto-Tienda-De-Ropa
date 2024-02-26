package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ventana_Inicio extends JPanel {

    Nav_Fijo nav = new Nav_Fijo();
    Panel_Iterativo panel = new Contenido_Principal_Home();
    Panel_Iterativo carro = new Contenido_Principal_Cart();
    From_Inferior form = new From_Inferior();
    Prendas prenda = new Prendas();
    Home perfil = new Home();
    Timer tiempo;

    public Ventana_Inicio() {
        super.setLayout(null);
        tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(nav);
                add(form);
                add(panel);
                CambioDelFrom();
            }
        });
        tiempo.start();

    }

    private void CambioDelFrom() {
        switch (From_Inferior.indice) {
            case 0:
                CambioPaneles(panel);
                break;
            case 1:
                CambioPaneles(carro);
                break;
            case 2:
                CambioPaneles(perfil);
                break;
            case 3:
                CambioPaneles(prenda);
                break;
            case 4:
                break;
        }
    }

    private void CambioPaneles(JPanel cont) {
        super.removeAll();
        super.add(cont, BorderLayout.CENTER);
        super.add(nav);
        super.add(form);
        super.revalidate();
        super.repaint();
    }
}
