
public class ActionSeriesCatalog implements SeriesCatalog{

    @Override
    public void showCatalog() {
        System.out.println("Se muestra catalogo de series de accion.");
        
    }

    @Override
    public void setCatalog() {
        System.out.println("Modifica catalogo de series de accion.");
        
    }

    @Override
    public void removeItemCatalog(int idItem) {
        System.out.println("Se elimina una serie del catalogo de series de accion.");
        
    }

    @Override
    public void addItemCatalog(String item) {
        System.out.println("Se agrega una serie al catalogo de series de accion.");
        
    }
}
