package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShip {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);

    }

    @When("Create a CitizenShip")
    public void createACitizenShip() {
        String citizenshipName = RandomStringUtils.randomAlphanumeric(7);
        String citizenshipShortName = RandomStringUtils.randomNumeric(5);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, citizenshipName);
        dc.mySendKeys(dc.shortName, citizenshipShortName);
        dc.myClick(dc.saveButton);
    }

//  yeni gunde buradan basladik


    //  @When("Create a CitizenShip as name {string} as ShortName {string}")
    //  public void createACitizenShipAsNameAsShortName(String name, String shortName) {
    //      dc.myClick(dc.addButton);
    //      dc.mySendKeys(dc.nameInput,name);
    //      dc.mySendKeys(dc.shortName,shortName);
    //      dc.myClick(dc.saveButton);
    //  }


//@When("Create a CitizenShip name as {string} shortkod as {string}")
//public void createACitizenShipNameAsShortkodAs(String name, String shortName) {
//    dc.myClick(dc.addButton);
//    dc.mySendKeys(dc.nameInput,name);
//    dc.mySendKeys(dc.shortName,shortName);
//    dc.myClick(dc.saveButton);
//}

    @When("Create a CitizenShip as name {string} as ShortName {string}")
    public void createACitizenShipAsNameAsShortName(String name, String shortName) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.shortName, shortName);
        dc.myClick(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExist, "already");
    }


    @When("Create a CitizenShip name as {string} shortkod as {string}")
    public void createACitizenShipNameAsShortkodAs(String name, String shortName) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.shortName, shortName);
        dc.myClick(dc.saveButton);
    }

    @When("user delete name as {string}")
    public void userDeleteNameAs(String deleteName) {
        dc.deleteItem(deleteName);
    }

}
