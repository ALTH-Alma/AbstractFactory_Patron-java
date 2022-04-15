
public class HorrorMovieCatalog implements MovieCatalog{

    @Override
    public void showCatalo() {
        System.out.println("Se muestra catalogo de peliculas de horror.");
        
    }

    @Override
    public void setCatalog() {
        System.out.println("Modifica catalogo de peliculas de horror.");
        
    }

    @Override
    public void removeItemCatalog(int idItem) {
        System.out.println("Se elimina una pelicula del catalogo de peliculas de horror.");
        
    }

    @Override
    public void addItemCatalog(String item) {
        System.out.println("Se agrega una pelicula al catalogo de peliculas de horror.");
        
    }

}
