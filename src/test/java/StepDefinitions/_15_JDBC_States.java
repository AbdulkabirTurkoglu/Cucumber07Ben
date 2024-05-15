package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _15_JDBC_States {
    DialogContent dc = new DialogContent();

    @Then("Send The Query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        List<List<String>> dbList = DBUtility.getListData(sorgu);

        for (int i = 0; i < dbList.size(); i++)
            System.out.println(dbList.get(i).get(0));

        List<WebElement> UIList = dc.nameList;
        for (int i = 0; i < UIList.size(); i++)
            System.out.println(UIList.get(i).getText());

        for (int i = 0; i < dbList.size(); i++)
            Assert.assertEquals(dbList.get(i).get(0),
                    UIList.get(i).getText().trim(), "Eslestirme yapilamadi");


    }

}

