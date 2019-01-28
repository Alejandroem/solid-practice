import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {


    @Test
    public void create_user_created(){
        User createdUser = new User();
        Assert.assertNotNull(createdUser);
    }

    @Test
    public void createOnConstructor_user_created(){
        UserHandler userHandler = new UserHandler();
        User createdUser = userHandler.user;
        Assert.assertNotNull(createdUser);
    }

    @Test
    public void login_userService_has(){
        UserService userService = new UserService();

        User user = new User();
        user.setUserName("123456");
        user.setPassword("password");

        String actual = userService.login(user);
        String expected = "123456password";

        Assert.assertEquals(actual,expected);
    }


}
