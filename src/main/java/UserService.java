public class UserService {
    public String login(IUserLogin IUserLogin) {
        return IUserLogin.getUserName() + IUserLogin.getPassword();
    }

    public String sendPackage(IUserSendPackage IUserSendPackage) {
        return IUserSendPackage.getFirstName() + IUserSendPackage.getLastName()+ IUserSendPackage.getPackageSKU();
    }
}
