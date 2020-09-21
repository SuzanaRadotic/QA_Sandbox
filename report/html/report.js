$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/QA_Sandbox.feature");
formatter.feature({
  "name": "Use Cases functionality tests",
  "description": "  As a user I want to check create, read, update and delete actions on Use Cases functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllUseCases"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \"QASANDBOXLOGIN\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iAmOnPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into application with \"AUTOTESTEMAIL\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iLogIntoApplicationWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"QA Sandbox Dashboard\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Use Cases Box\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iClickOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"Use Cases\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Use Cases",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllUseCases"
    },
    {
      "name": "@Delete"
    }
  ]
});
formatter.step({
  "name": "I delete Use Cases",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iDeleteUseCases()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List of Use Cases is empty",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.listOfUseCasesIsEmpty()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \"QASANDBOXLOGIN\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iAmOnPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into application with \"AUTOTESTEMAIL\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iLogIntoApplicationWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"QA Sandbox Dashboard\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Use Cases Box\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iClickOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"Use Cases\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Use Cases",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllUseCases"
    },
    {
      "name": "@Create"
    }
  ]
});
formatter.step({
  "name": "I create Use Cases",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iCreateUseCases()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use Cases are shown in the list on \"Use Cases\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.useCasesAreShownInTheListOnPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \"QASANDBOXLOGIN\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iAmOnPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into application with \"AUTOTESTEMAIL\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iLogIntoApplicationWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"QA Sandbox Dashboard\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Use Cases Box\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iClickOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"Use Cases\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit Use Cases",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllUseCases"
    },
    {
      "name": "@Edit"
    }
  ]
});
formatter.step({
  "name": "I edit Use Cases",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iEditUseCases()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List of Use Cases is also updated",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.listOfUseCasesIsAlsoUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \"QASANDBOXLOGIN\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iAmOnPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into application with \"AUTOTESTEMAIL\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iLogIntoApplicationWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"QA Sandbox Dashboard\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Use Cases Box\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iClickOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system shows \"Use Cases\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theSystemShowsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Edited Use Cases",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllUseCases"
    },
    {
      "name": "@DeleteEdited"
    }
  ]
});
formatter.step({
  "name": "I delete edited Use Cases",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iDeleteEditedUseCases()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List of Use Cases does not contain edited Use Cases",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.listOfUseCasesDoesNotContainEditedUseCases()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});