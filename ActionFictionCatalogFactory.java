public class ActionFictionCatalogFactory implements FictionCatalogFactory {

    @Override
    public MovieCatalog createMovieCatalog() {
        return new ActionMovieCatalog();
    }

    @Override
    public SeriesCatalog createSeriesCatalog() {
        return new ActionSeriesCatalog();
    }

}
