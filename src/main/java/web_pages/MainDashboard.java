package web_pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class MainDashboard  extends LoadableComponent<MainDashboard> {

    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 45);

    public MainDashboard() {

        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
    // Page factory
    // ######################################################################################################################################
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div/a/div/span/img")
    private WebElement useCasesBox;
    @FindBy(xpath = "//*[@id=\"mobile-nav\"]/ul/li[4]/a")
    private WebElement logOutBtn;

    // Ending page factory
    // ######################################################################################################################################

    public void isDashboardDisplayed() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(useCasesBox));

    }
    @Override
    protected void isLoaded() throws Error {

        Assert.assertTrue("Login page not loaded", driver.getTitle().equals("lllll"));

    }
    @Override
    protected void load() {
        // TODO

    }

    public void logOut(){
        logOutBtn.click();
    }

    public void clickOnUseCasesBox() throws InterruptedException {
        useCasesBox.click();
    }


}

