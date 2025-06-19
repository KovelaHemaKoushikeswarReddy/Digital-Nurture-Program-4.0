
public class AppLauncher {
    public static void main(String[] args) {

        System.out.println();

        // Create a user data source
        UserDataSource source = new InMemoryUserData();

        // Inject into the service layer
        UserService service = new UserService(source);

        // Fetch and display user info
        User result = service.retrieveUser(101);
        System.out.println("User ID: " + result.getUserId());
        System.out.println("User Name: " + result.getUserName());
    }
}
