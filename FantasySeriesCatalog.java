
public class FantasySeriesCatalog implements SeriesCatalog{

    @Override
    public void showCatalo() {
        System.out.println("Se muestra catalogo de series de fantasia.");
        
    }

    @Override
    public void setCatalog() {
        System.out.println("Modifica catalogo de series de fantasia.");
        
    }

    @Override
    public void removeItemCatalog(int idItem) {
        System.out.println("Se elimina una serie del catalogo de series de fantasia.");
        
    }

    @Override
    public void addItemCatalog(String item) {
        System.out.println("Se agrega una serie al catalogo de series de fantasia.");
        
    }

}
