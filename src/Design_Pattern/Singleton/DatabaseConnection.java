package Design_Pattern.Singleton;

public class DatabaseConnection {

    // 1. Make class instance property static so can be accessed without creating an object
    private static DatabaseConnection instance;

    // 2. Make constuctor private, so noone can object directly
    private DatabaseConnection(){

    }

    // 3. Create method to check & get the instance of this class
    // This function can be called without object, so make it static
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
