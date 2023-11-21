package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baserl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baserl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        String expectedErrorMessage = "Register";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Register ']")).getText();
        Assert.assertEquals("Register", expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        //Gender field
        WebElement Gender = driver.findElement(By.id("gender-female"));
        Gender.click();
        //Find the FirstName field
        WebElement firstnameField = driver.findElement(By.id("FirstName"));
        firstnameField.sendKeys("Krupali");
        //Find LastName field
        WebElement lastnameField = driver.findElement(By.id("LastName"));
        lastnameField.sendKeys("Lalkia");

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("28");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1994");

        //Find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("krupali123@gmail.com");
        //Find the password field and type the password to password field
        driver.findElement(By.name("Password")).sendKeys("krupali123");

        //Find the confirmPassword field and type the password to confirmPassword field
        driver.findElement(By.name("ConfirmPassword")).sendKeys("krupali123");
        WebElement RegisterButton = driver.findElement(By.linkText("Register"));
        RegisterButton.click();
        String expectedText = "Your registration completed";
        //Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Your registration completed", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
