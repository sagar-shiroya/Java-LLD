package Design_Pattern.Singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println(db1);

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db2); // We'll get the same instance as of db1
    }
}
