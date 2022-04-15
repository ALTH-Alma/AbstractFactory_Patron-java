
public class FantasyMovieCatalog implements MovieCatalog{

    @Override
    public void showCatalog() {
        System.out.println("Se muestra catalogo de peliculas de fantasia.");
        
    }

    @Override
    public void setCatalog() {
        System.out.println("Modifica catalogo de peliculas de fantasia.");
        
    }

    @Override
    public void removeItemCatalog(int idItem) {
        System.out.println("Se elimina una pelicula del catalogo de peliculas de fantasia.");
        
    }

    @Override
    public void addItemCatalog(String item) {
        System.out.println("Se agrega una pelicula al catalogo de peliculas de fantasia.");
        
    }

}
