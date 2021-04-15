package seleniumtests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CommonSteps {

  WebDriver driver;

  public CommonSteps(DriverManager driverManager) {
    this.driver = driverManager.getDriver();
  }

  @Given("i navigate to {string}")
  public void iNavigateTo(String path) {
    driver.navigate().to(path);
  }

  @When("i input the location {string}")
  public void iInputTheLocation(String arg0) {}

  @And("click search")
  public void clickSearch() {}

  @Then("i see current weather for my location")
  public void iSeeCurrentWeatherForMyLocation() {}
}