public class FantasyFictionCatalogFactory implements FictionCatalogFactory {

    @Override
    public MovieCatalog createMovieCatalog() {
        return new FantasyMovieCatalog();
    }

    @Override
    public SeriesCatalog createSeriesCatalog() {
        return new FantasySeriesCatalog();
    }
    
}
