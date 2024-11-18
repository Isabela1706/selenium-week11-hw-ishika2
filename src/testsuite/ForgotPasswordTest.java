package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p [@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//button [@type = 'submit']")).getText();
        Assert.assertEquals("Correct Reset Password",expectedText, actualText);
        //click on the ‘Cancel’ button
        driver.findElement(By.xpath("//button [@type = 'button']")).click();
        //Verify the text ‘Login’
        String expectedTextLogin = "Login";
        String actualTextLogin = driver.findElement(By.xpath("//button [@type = 'submit']")).getText();
        Assert.assertEquals("Correct Login Button",expectedTextLogin, actualTextLogin);




    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}

