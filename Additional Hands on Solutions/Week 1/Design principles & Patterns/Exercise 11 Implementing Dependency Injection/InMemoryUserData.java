
public class InMemoryUserData implements UserDataSource {
    @Override
    public User fetchUserById(int userId) {
        // This would normally connect to a real database
        return new User(userId, "Alice Johnson");
    }
}
