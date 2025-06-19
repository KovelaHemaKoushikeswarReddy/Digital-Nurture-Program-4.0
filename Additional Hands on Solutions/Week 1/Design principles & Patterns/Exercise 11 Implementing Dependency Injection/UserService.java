
public class UserService {
    private final UserDataSource dataSource;

    // Dependency injected via constructor
    public UserService(UserDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public User retrieveUser(int userId) {
        return dataSource.fetchUserById(userId);
    }
}
