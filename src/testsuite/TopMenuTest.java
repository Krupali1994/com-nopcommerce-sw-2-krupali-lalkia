package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baserl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baserl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computers = driver.findElement(By.linkText("Computers"));
        computers.click();
        String expectedErrorMessage = "Computers";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Computers ']")).getText();
        Assert.assertEquals("Computers", expectedErrorMessage, actualErrorMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
        String expectedErrorMessage = "Electronics";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();
        Assert.assertEquals("Electronics", expectedErrorMessage, actualErrorMessage);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        apparel.click();
        String expectedErroerMessage = "Apparel";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        Assert.assertEquals("Apparel", expectedErroerMessage, actualErrorMessage);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();
        String expectedErrorMessage = "Digital downloads";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals("Digital downloads", expectedErrorMessage, actualErrorMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement books = driver.findElement(By.linkText("Books"));
        books.click();
        String expectedErrorMessage = "Books";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Books ']")).getText();

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        String expectedErrorMessage = "Jewelry";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        Assert.assertEquals("Jewelry", expectedErrorMessage, actualErrorMessage);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCards = driver.findElement(By.linkText("Gift Cards"));
        giftCards.click();
        String expectedErrorMessage = "Gift Cards";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals("Gift Cards", expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
