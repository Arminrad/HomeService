import connection.SessionFactorySingleton;
import controller.Menu;
import controller.Utility;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
        Menu menu = new Menu();
        menu.mainMenu();
    }
}
