//Factory que interactua con la aplicacion
public interface FictionCatalogFactory {
    
    public MovieCatalog createMovieCatalog();
    public SeriesCatalog createSeriesCatalog();

}
