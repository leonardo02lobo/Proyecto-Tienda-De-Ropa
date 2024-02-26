package GUI;

public class Contenido_Principal_Cart extends Panel_Iterativo{
    Vista vista = new Vista();
    Constantes_Fijas constantes = new Constantes_Fijas();
    
    public Contenido_Principal_Cart(){
        init();
    }

    @Override
    public void init() {
        int[] posicionX = {10,10,10,10};
        int[] posicionY = {10,140,240,340};
        vista.IniciarComponentes(constantes.contenido, this, posicionX, posicionY, 450, 120);
        vista.IniciarComponentesDeTexto(constantes.cartas, constantes.contenido,120, 30, Constantes_Fijas.cartasString, 200, 20);
        vista.IniciarComponentesDeTexto(constantes.precios, constantes.contenido,120, 50, Constantes_Fijas.preciosString, 200, 20);
        vista.IniciarComponentesDeImagenes(constantes.imagenes, constantes.contenido, Constantes_Fijas.url, 10, 10, 90, 90);
    }
}
