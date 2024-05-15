package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_Country {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
        //  WebElement ad = GWD.getDriver().findElement(By.)
        String ulkeAdi = RandomStringUtils.randomAlphanumeric(10);
        String ulkeCod = RandomStringUtils.randomNumeric(5);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, ulkeAdi);
        dc.mySendKeys(dc.codeInput, ulkeCod);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        //success yazizini dogrula
        dc.verifyContainsText(dc.successMessage,"success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String ulkeAdi, String ulkeKod) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,ulkeAdi);
        dc.mySendKeys(dc.codeInput,ulkeKod);
        dc.myClick(dc.saveButton);
    }



}
