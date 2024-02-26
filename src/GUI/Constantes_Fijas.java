package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Constantes_Fijas {
    
    private final int numeroDeObjetos = 4;
    public JLabel[] cartas = new JLabel[numeroDeObjetos];
    public JPanel[] contenido = new JPanel[numeroDeObjetos];
    public JLabel[] precios = new JLabel[numeroDeObjetos];
    public JLabel[] imagenes = new JLabel[numeroDeObjetos];
    public static String[] url = {"../Multimedia/ropa1.png","../Multimedia/ropa2.png",
        "../Multimedia/ropa3.png","../Multimedia/ropa4.png"};
    public static String[] preciosString = {"12.3$","12.99$","9.99$","12.1$"};
    public static String[] cartasString = {"Ropa de Verano","Ropa de Verano","Ropa de Verano","Ropa de Verano"};
}
