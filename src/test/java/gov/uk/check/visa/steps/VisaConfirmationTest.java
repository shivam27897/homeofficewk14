package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.testng.Assert;

import static gov.uk.check.visa.browserfactory.ManageBrowser.driver;

public class VisaConfirmationTest {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept all cookie$")
    public void iAcceptAllCookie() {
        new StartPage().acceptAllCookies();
        driver.switchTo().defaultContent();
    }

    @And("^I click on Start Now$")
    public void iClickOnStartNow() {
        new StartPage().clickStartNow();
    }

    @And("^I select country as Australia$")
    public void iSelectCountryAsAustralia() {
        new SelectNationalityPage().selectingCountry("Australia");
    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("^I select reason$")
    public void iSelectReason() {
        new ReasonForTravelPage().selectReason();
    }

    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new ReasonForTravelPage().clickOnnextBtn();
    }

    @Then("^I should verify Result$")
    public void iShouldVerifyResult() {
        String actualmsg = new ResultPage().verifyMsg();
        String expectedmsg = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualmsg, expectedmsg);
    }

    @And("^I select country as Chile$")
    public void iSelectCountryAsChile() {
        new SelectNationalityPage().selectingCountry("Chile");
    }


    @And("^I click on duration option$")
    public void iClickOnDurationOption() {
        new DurationOfStayPage().clickOnMorethanSixMonth();
    }

    @And("^I select Job type$")
    public void iSelectJobType() {
        new WorkTypePage().selectHealthcare();
    }


    @And("^I select country as Colombia$")
    public void iSelectCountryAsColombia() {
        new SelectNationalityPage().selectingCountry("Colombia");
    }


    @And("^I select reason work or business$")
    public void iSelectReasonWorkOrBusiness() {
        new ReasonForTravelPage().selectReason1();
    }

    @And("^I select reason join partner or family$")
    public void iSelectReasonJoinPartnerOrFamily() {
        new ReasonForTravelPage().selectReason2();
    }

    @Then("^I should verify Result for visa$")
    public void iShouldVerifyResultForVisa() {
        String actualmsg1 = new ResultPage().verifyMsg();
        String expectedmsg1 = "You need a visa to work in health and care";
        Assert.assertEquals(actualmsg1, expectedmsg1);
    }

    @Then("^I should verify Result page$")
    public void iShouldVerifyResultPage() {
        String actualmsg2 = new ResultPage().verifyMsg();
        String expectedmsg2 = "You may need a visa";
        Assert.assertEquals(actualmsg2, expectedmsg2);
    }
}
