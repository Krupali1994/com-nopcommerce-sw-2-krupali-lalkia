package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on it
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        String expectedText = "Welcome, Please Sign In!";
        //Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find the login link and click on it
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        //Find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("krupali123@gmail.com");
        //Find the password field and type the password to password field
        driver.findElement(By.name("Password")).sendKeys("krupali123");
        //Find the login button element and click
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedErrorMessage = "log out";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.className("ico-logout")).getText();
        Assert.assertEquals("Correct Message not Displayed", expectedErrorMessage, actualErrorMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        //Find the login link and click on it
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        //Find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abcgmail.com");
        //Find the password field and type the password to password field
        driver.findElement(By.name("Password")).sendKeys("abc123");
        //Find the login button element and click
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the error and try again,\n" +
                " No customer account found";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
