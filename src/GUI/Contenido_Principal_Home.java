package GUI;

public class Contenido_Principal_Home extends Panel_Iterativo{
    
    Vista vista = new Vista();
    Constantes_Fijas constantes = new Constantes_Fijas();

    public Contenido_Principal_Home() {
        init();
    }

    @Override
    public void init() {
        int[] posicionX = {10,250,10,250};
        int[] posicionY = {10,10,250,250};
        vista.IniciarComponentes(constantes.contenido,this,posicionX,posicionY,220,220);
        vista.IniciarComponentesDeTexto(constantes.cartas,constantes.contenido,20,140,Constantes_Fijas.cartasString,150,20);
        vista.IniciarComponentesDeTexto(constantes.precios,constantes.contenido,20,170,Constantes_Fijas.preciosString,150,20);
        vista.IniciarComponentesDeImagenes(constantes.imagenes,constantes.contenido, Constantes_Fijas.url,10,10,200,100);
    }
}
