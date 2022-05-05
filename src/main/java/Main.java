import connection.SessionFactorySingleton;
import controller.Utility;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
        Utility utility = new Utility();
        utility.mainMenu();

    }
}
