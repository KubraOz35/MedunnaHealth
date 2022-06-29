package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SignInStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the Medunna page")
    public void user_is_on_the_Medunna_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
    }

    @Given("user clicks human icon")
    public void user_clicks_human_icon() {
        loginPage.humanIcon.click();
    }

    @Given("user clicks signIn button")
    public void user_clicks_sign_in_button() {
        loginPage.signInButton.click();
    }





}
