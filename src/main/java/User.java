public class User implements IUserLogin, IUserSendPackage, IUserSendInvoice {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String packageSKU;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPackageSKU(String packageSKU) {
        this.packageSKU = packageSKU;
    }

    public String getPackageSKU() {
        return packageSKU;
    }
}
