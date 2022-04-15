public class HorrorFictionCatalogFactory implements FictionCatalogFactory {

    @Override
    public MovieCatalog createMovieCatalog() {
        return new HorrorMovieCatalog();
    }

    @Override
    public SeriesCatalog createSeriesCatalog() {
        return new HorrorSeriesCatalog();
    }
}
