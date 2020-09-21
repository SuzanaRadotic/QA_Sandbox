package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_pages.LoginPage;
import web_pages.MainDashboard;
import web_pages.UseCasesPage;

import java.io.IOException;

public class MyStepdefs {

    LoginPage loginPage = new LoginPage();
    MainDashboard dashboard = new MainDashboard();
    UseCasesPage useCases = new UseCasesPage();

    @Given("I am on {string} page")
    public void iAmOnPage(String url) {
        loginPage.getPage(url);
    }


    @Then("the system shows {string} page")
    public void theSystemShowsPage(String page) throws Throwable {
        switch(page) {
            case "QA Sandbox Dashboard":
                    dashboard.isDashboardDisplayed();
                    break;
            case "Use Cases":
                    useCases.isPageDisplayed();
                    break;
            default:
                System.out.println("Page name in the feature file is not correct ");
        }
    }


    @When("I log into application with {string}")
    public void iLogIntoApplicationWith(String email) {
        loginPage.loginWithEmailAndPass(email);
    }

    @And("I log out of the application")
    public void iLogOutOfTheApplication() {
        dashboard.logOut();
    }

    @When("I click on {string}")
    public void iClickOn(String arg0) throws InterruptedException {
        dashboard.clickOnUseCasesBox();
    }

    @When("I create Use Cases")
    public void iCreateUseCases() throws IOException, InterruptedException {
        useCases.createUseCase();
    }

    @Then("Use Cases are shown in the list on {string} page")
    public void useCasesAreShownInTheListOnPage(String arg0) throws IOException, InterruptedException {
        useCases.verifyUseCasesList();
    }

    @When("I delete Use Cases")
    public void iDeleteUseCases() {
        useCases.deleteUseCases();
    }

    @Then("List of Use Cases is empty")
    public void listOfUseCasesIsEmpty() {
        useCases.createUseCasesMsgIsDisplayed();
    }

    @When("I edit Use Cases")
    public void iEditUseCases() throws IOException, InterruptedException {
        useCases.editUseCases();
    }


    @When("I delete edited Use Cases")
    public void iDeleteEditedUseCases() {
        useCases.deleteEditedUseCases();
    }

    @Then("List of Use Cases is also updated")
    public void listOfUseCasesIsAlsoUpdated() {
        useCases.verifyListWithEditedUseCases();
    }

    @Then("List of Use Cases does not contain edited Use Cases")
    public void listOfUseCasesDoesNotContainEditedUseCases() {
        useCases.listOfUseCasesDoesNotContainEditedUseCases();
    }
}
