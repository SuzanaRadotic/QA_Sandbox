package web_pages;

import enums.Url;
import enums.Users;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class LoginPage extends LoadableComponent<LoginPage> {
    // DriverFactory df = new DriverFactory();
    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 45);

    // Page factory
    // ######################################################################################################################################
    @FindBy(name = "email")
    private WebElement emailLocator;
    @FindBy(name = "password")
    private WebElement passwordLocator;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement btnSubmit;


    // Ending page factory
    // ######################################################################################################################################

    public LoginPage() {

        PageFactory.initElements(DriverFactory.getDriver(), this);
    }


    // used for selenium loadable component
    @Override
    protected void isLoaded() throws Error {

        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        Assert.assertTrue("QA Sandbox application cannot be loaded " + driver.getTitle(),
                btnSubmit.isEnabled());

    }

    /**
     * Navigation to the specified page
     *
     * @param url
     */

    public void getPage(String url){
        if(url.equalsIgnoreCase("QASANDBOXLOGIN")){
            getLoginPage(url);
        }
        else if (url.equalsIgnoreCase("QASANDBOXDASHBOARD")){
            getDashboard();
            Assert.assertEquals("This is not Sign up page please check the value of the page", btnSubmit.getText(),"Submit");

        }
        else {
            System.out.println("Name of the page is not properly defined");
        }
    }

    private void getLoginPage(String url){
        DriverFactory.driver.get(Url.valueOf(url.toUpperCase()).getUrl());
    }

    private void getDashboard(){
        getLoginPage("QASANDBOXLOGIN");
        btnSubmit.click();
    }

    /**
     * Sending email and pass to text field in login page
     *
     * @param email
     * @param pass
     */

    public void LoginWithValidParam(String email, String pass)  {


        emailLocator.sendKeys(email);
        passwordLocator.sendKeys(pass);

        btnSubmit.click();

    }


    /**
     * Method converts string parameters in enumeration
     *
     * @param email
     */
    public void loginWithEmailAndPass(String email) {
        LoginWithValidParam(Users.valueOf(email.toUpperCase()).getUserParams(),
                Users.valueOf(email.toUpperCase() + "pass".toUpperCase()).getUserParams());


    }

    @Override
    protected void load() {
        // TODO

    }
}
