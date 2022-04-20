// Clase abstracta del objeto --> somethingMovieCatalog = clase concreta
public interface MovieCatalog {
    public void showCatalog();
    public void setCatalog();
    public void removeItemCatalog(int idItem);
    public void addItemCatalog(String item);

}
