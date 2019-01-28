import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {


    @Test
    public void create_user_created(){
        IUserLogin createdUser = new User();
        Assert.assertNotNull(createdUser);
    }

    @Test
    public void createOnConstructor_user_created(){
        UserHandler userHandler = new UserHandler();
        IUserLogin createdUser = userHandler.user;
        Assert.assertNotNull(createdUser);
    }

    @Test
    public void login_userService_has(){
        UserService userService = new UserService();

        IUserLogin user = new User();
        user.setUserName("123456");
        user.setPassword("password");

        String actual = userService.login(user);
        String expected = "123456password";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void sendPackage_userService_queue(){
        UserService userService = new UserService();

        IUserSendPackage user = new User();
        user.setFirstName("Alejandro");
        user.setLastName("Enríquez");
        user.setAddress("Rambla de barcelona, 25");
        user.setPackageSKU("123456");
        String actualTrackingId = userService.sendPackage(user);

        String expectedTrackingId = "AlejandroEnríquez123456";

        Assert.assertEquals(actualTrackingId , expectedTrackingId);
    }

    @Test
    public void sendInvoice_userService_queue(){
        UserService userService = new UserService();

        IUserSendInvoice user = new User();
        user.setAddress("Rambla de barcelona, 25");

        String expectedInvoiceId = ("Invoice Rambla de barcelona, 25");
        String actualInvoiceId = userService.sendInvoice(user);

        Assert.assertEquals(expectedInvoiceId,actualInvoiceId);
    }

    @Test
    public void sendEmail_userService_queue(){
        UserService userService = new UserService();

        IUserSendEmail user = new User();
        user.setEmail("alexalejandro123@yahoo.com");

        String expectedResponse = "sent from: alexalejandro123@yahoo.com";
        String actualResponse = userService.sendEmail(user);

        Assert.assertEquals(actualResponse,expectedResponse);
    }

    @Test
    public void createPersonalizedHat_userService_queue(){
        UserService userService = new UserService();

        User user = new User();
        user.setHeadSize("M");

        String expectedResponse = "hat size: M";
        String actualResponse = userService.createPersonalizedHat(user);

        Assert.assertEquals(actualResponse,expectedResponse);
    }
}
