public class UserService {
    public String login(User user) {
        return user.getUserName() + user.getPassword();
    }
}
