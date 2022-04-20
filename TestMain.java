//Produce familia de objetos relacionados sin especificar sus clases concretas 
// --> familia de objetos relacionados: catalogo de cierto tipo de ficción: movie catalog + series catalog ...ect
// --> Variantes: de acción, de fantasia, de horror, etc...
//--> ayuda a añadir nuevos objetos o familias sin modificar el codigo original --> implementa interfaces por cada variedad =/= de familia.
import java.util.Scanner;

public class TestMain {

    public static void main(String[] args){

        int option;

        do{
            System.out.println("\nSelecciona una opcion de servicio:");
            System.out.println("1.- Serivicio de catalogo de ficcion de accion.");
            System.out.println("2.- Serivio de catalogo de ficcion de horror.");
            System.out.println("3.- Serivio de catalogo de ficcion de fantasia.");
            System.out.println("4.- Salir.");

            Scanner scan = new Scanner(System.in);
            option = scan.nextInt();

            if (option == 1){
                use(new ActionFictionCatalogFactory());

            }else if(option == 2){
                use(new HorrorFictionCatalogFactory());
            
            }else if(option == 3){
                use(new FantasyFictionCatalogFactory());
            }
                

        }while(option < 4 && option > 0);
    }

    public static void use(FictionCatalogFactory factory){

        MovieCatalog mCatalog = factory.createMovieCatalog();
        SeriesCatalog sCatalog = factory.createSeriesCatalog();

        System.out.println("\n---Prueba de funcionalidades: show, set, addItem, removeItem----");
        System.out.println("\nEn peliculas del catalogo:");
        mCatalog.showCatalog();
        mCatalog.setCatalog();
        mCatalog.addItemCatalog("Movie 1");
        mCatalog.removeItemCatalog(2);
        System.out.println("\nEn series del catalogo:");
        sCatalog.showCatalog();
        sCatalog.setCatalog();
        sCatalog.addItemCatalog("Serie 1");
        sCatalog.removeItemCatalog(3);

    }
    
}
