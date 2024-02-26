package Logica;

import GUI.Ventana_Inicio;
import java.awt.Color;
import javax.swing.JFrame;

public class Principal {
    
    public static Color blanco = Color.white;
    
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        Ventana_Inicio inicio = new Ventana_Inicio();
        miVentana.add(inicio);
        miVentana.setSize(500,700);
        miVentana.setResizable(false);
        miVentana.setTitle("Aplicación de comercio electrónico");
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);
        miVentana.setVisible(true);
    }
}
