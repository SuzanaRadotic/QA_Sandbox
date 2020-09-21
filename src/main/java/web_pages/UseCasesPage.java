package web_pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ExcelReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UseCasesPage  extends LoadableComponent<UseCasesPage> {

    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 45);


    public UseCasesPage() {

        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
    // Page factory
    // ######################################################################################################################################
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/a[2]")
    private WebElement createUseCaseBtn;
    @FindBy(xpath = "//*[@id=\"mobile-nav\"]/ul/li[4]/a")
    private WebElement logOutBtn;
    @FindBy(className = "usecases")
    private WebElement allUseCasesLst;
    @FindBy(xpath = "//span[contains(text(),'Use Case Steps')]")
    private WebElement allUseStepsLst;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/form/span[2]/button")
    public WebElement binBtn;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement deleteBtn;
    @FindBy(name = "title")
    private WebElement titleFld;
    @FindBy(name = "description")
    private WebElement descriptionFld;
    @FindBy(name = "expected_result")
    private WebElement expectedResultFld;
    @FindBy(name = "testStepId-0")
    private WebElement useCaseStep1Fld;
    @FindBy(name = "testStepId-1")
    private WebElement useCaseStep2Fld;
    @FindBy(className = "text-primary")
    private WebElement addStepBtn;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submitBtn;
    @FindBy(id = "switch")
    private WebElement automatedCheckBox;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/span")
    private WebElement createUseCasesLbl;

    // Ending page factory
    // ######################################################################################################################################

    public void isPageDisplayed() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(createUseCaseBtn));

    }

    @Override
    protected void isLoaded() throws Error {

        wait.until(ExpectedConditions.elementToBeClickable(createUseCaseBtn));

        Assert.assertTrue("tmReports view page couldn't be loaded " + driver.getTitle(),
                createUseCaseBtn.isEnabled());

    }
    @Override
    protected void load() {
        // TODO

    }

    public void logOut(){
        logOutBtn.click();
    }

    public void clickOnCreateUseCasesButton() throws InterruptedException {
        createUseCaseBtn.click();
    }

    /**
     * Method creates Use Cases by sending Excel values into the fields of the form and submitting them
     * Each sheet in the Excel file represents one Use Case
     *
     */

    public void createUseCase() throws IOException, InterruptedException {
        ExcelReader excelReader = new ExcelReader();

        for (int i = 0; i < excelReader.getNumberOfSheets("QA_Sandbox_cases.xlsx"); i++ ){

            clickOnCreateUseCasesButton();
            titleFld.sendKeys(excelReader.readCellData("QA_Sandbox_cases.xlsx", 0, 1, i));
            descriptionFld.sendKeys(excelReader.readCellData("QA_Sandbox_cases.xlsx", 1, 1, i));
            expectedResultFld.sendKeys(excelReader.readCellData("QA_Sandbox_cases.xlsx", 2, 1, i));
            useCaseStep1Fld.sendKeys(excelReader.readCellData("QA_Sandbox_cases.xlsx", 3, 1, i));
            addStepBtn.click();
            useCaseStep2Fld.sendKeys(excelReader.readCellData("QA_Sandbox_cases.xlsx", 4, 1, i));
            submitBtn.click();
        }


    }

    /**
     * Method verifies that list of Use Cases shown on the Use Cases page matches with use cases entered in the Excel file
     *
     */

    public void verifyUseCasesList() throws InterruptedException, IOException {
        ArrayList<String> allUseCases = collectAllUseCases();
        ExcelReader excelReader = new ExcelReader();

        ArrayList<String> excel = new ArrayList<String>();
        excel.addAll(excelReader.getCellOfAllSheets("QA_Sandbox_cases.xlsx", 0, 1));
        Collections.reverse(allUseCases);
        assertEquals(excel, allUseCases);

    }

    /**
     * Method collects all Use Cases from the page and returns their titles
     *
     */
    public ArrayList<String> collectAllUseCases() {
        ArrayList<String> allUseCases = new ArrayList<>();
        List<WebElement> useCasesList = allUseCasesLst.findElements(By.className("list-group-item"));
        for (WebElement element : useCasesList) {
            allUseCases.add(element.getText());
        }

        return allUseCases;

    }

    /**
     * Method deletes all Use Cases from the page
     * It opens each of them and deletes by clicking bin icon and "Delete" button
     *
     */

    public void deleteUseCases() {
        List<WebElement> useCasesList = allUseCasesLst.findElements(By.className("list-group-item"));

        for (int i = 0; i < useCasesList.size(); i++) {

            WebElement element = allUseCasesLst.findElements(By.className("list-group-item")).get(0);

            element.click();

            wait.until(ExpectedConditions.elementToBeClickable(binBtn));
            binBtn.click();
            wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));
            deleteBtn.click();

        }
    }

    /**
     * Method edits all Use Cases on the page
     * It opens each of them and replaces values in fields with strings in form "This field previously had " + charNum + " characters"
     *
     */

    public void editUseCases() {
        List<WebElement> useCasesList = allUseCasesLst.findElements(By.className("list-group-item"));

        for (int i = 0; i < useCasesList.size(); i++){
            WebElement element = allUseCasesLst.findElements(By.className("list-group-item")).get(i);
            element.click();
            wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
            int titleCharNum = titleFld.getAttribute("value").length();
            int descriptionCharNum = descriptionFld.getText().length();
            int expectedResultCharNum = expectedResultFld.getAttribute("value").length();


            titleFld.clear();
            titleFld.sendKeys("This field previously had " + titleCharNum + " characters");
            descriptionFld.clear();
            descriptionFld.sendKeys("This field previously had " + descriptionCharNum + " characters");
            expectedResultFld.clear();
            expectedResultFld.sendKeys("This field previously had " + expectedResultCharNum + " characters");

            editUseSteps();

            submitBtn.click();

        }

    }


    /**
     * Method edits all Use Step on the Use Case form
     * Used in method for editing Use Cases
     */

    public void editUseSteps() {
        ArrayList<String> allUseCases = new ArrayList<>();
        List<WebElement> useSteps = allUseStepsLst.findElements(By.xpath("//*[@id=\"stepId\"]"));
        for (WebElement element : useSteps) {
            int useStepCharNum = element.getAttribute("value").length();
            element.clear();
            element.sendKeys("This field previously had " + useStepCharNum + " characters");
            allUseCases.add(element.getText());
        }

    }

    // TODO - Needs to be completed
    /**
     * Method should verify that, after editing, list of Use Cases on the Use Cases page has also been updated
     *
     */
    public void verifyListWithEditedUseCases() {
        ArrayList<String> editedUseCasesTitles = new ArrayList<String>();
        List<WebElement> editedUseCases = allUseCasesLst.findElements(By.partialLinkText("This field previously had"));
        for (WebElement element : editedUseCases) {
            editedUseCasesTitles.add(element.getText());
        }

    }


    /**
     * Method deletes only edited Use Cases, which are identified by partialLinkText("This field previously had")
     *
     */
    public void deleteEditedUseCases()
    {
        ArrayList<WebElement> allEditedUseCases = new ArrayList<>();
        List<WebElement> editedUseCases = allUseCasesLst.findElements(By.partialLinkText("This field previously had"));

        for(WebElement element: editedUseCases )
        {
            allEditedUseCases.add(element);
        }

        if (allEditedUseCases.isEmpty())
        {
            System.out.println("There are no edited Use Cases");
        }

        else {
            Iterator<WebElement> iter = allEditedUseCases.iterator();
            while (iter.hasNext()) {
                WebElement element = allUseCasesLst.findElement(By.partialLinkText("This field previously had"));
                element.click();

                wait.until(ExpectedConditions.elementToBeClickable(binBtn));
                binBtn.click();
                wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));
                deleteBtn.click();

                element = iter.next();
                iter.remove();
            }
        }
    }


    /**
     * Method verifies message which is displayed when Use Cases page has no Use Cases
     *
     */
    public void createUseCasesMsgIsDisplayed() {
        createUseCaseBtn.isDisplayed();
        Assert.assertTrue(createUseCasesLbl.getText().contains("Feel free to create your first use case."));
    }


    /**
     * Method verifies that, after deletion, list of Use Cases does not have edited Use Cases
     *
     */
    public void listOfUseCasesDoesNotContainEditedUseCases() {
        ArrayList<WebElement> allEditedUseCases = new ArrayList<>();
        List<WebElement> editedUseCases = allUseCasesLst.findElements(By.partialLinkText("This field previously had"));

        for (WebElement element : editedUseCases) {
            allEditedUseCases.add(element);
        }

        Assert.assertTrue(allEditedUseCases.isEmpty());
    }
}

