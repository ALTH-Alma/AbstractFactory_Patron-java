//Factory que interactua con la aplicacion ----> declara metodos que permiten crear los objetos de cada familia.
//--> las factorias concretas somethingFactory --> permiten crear los objetos concretos de la familia. 
public interface FictionCatalogFactory {
    
    public MovieCatalog createMovieCatalog();
    public SeriesCatalog createSeriesCatalog();

}
