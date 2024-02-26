package GUI;

import Logica.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public abstract class Panel_Iterativo extends JPanel {

    public Panel_Iterativo() {
        super.setLayout(null);
        super.setSize(500, 530);
        super.setLocation(0, 70);

        Timer tiempo = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Principal.blanco);
            }
        });
        tiempo.start();
    }

    public abstract void init();

}
