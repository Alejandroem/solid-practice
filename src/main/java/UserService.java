public class UserService {
    public String login(IUserLogin IUserLogin) {
        return IUserLogin.getUserName() + IUserLogin.getPassword();
    }

    public String sendPackage(IUserSendPackage IUserSendPackage) {
        return IUserSendPackage.getFirstName() + IUserSendPackage.getLastName()+ IUserSendPackage.getPackageSKU();
    }

    public String sendInvoice(IUserSendInvoice IUserSendInvoice) {
        return "Invoice "+ IUserSendInvoice.getAddress();
    }

    public String sendEmail(IUserSendEmail IUserSendEmail) {
        return "sent from: "+ IUserSendEmail.getEmail();
    }

    public String createPersonalizedHat(User user) {
        return "hat size: "+user.getHeadSize();
    }
}
